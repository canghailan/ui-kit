package cc.whohow.ui;

import cc.whohow.ui.core.UTF16Array;
import cc.whohow.ui.geom.Line;
import cc.whohow.ui.geom.Rect;
import cc.whohow.ui.provider.java2d.Java2DGraphicsBuffer;
import cc.whohow.ui.provider.java2d.Java2DGraphicsContext;
import cc.whohow.ui.text.Text;

import java.awt.Color;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class TestUI extends Frame {
    private static final long FRAME = 1000 / 60;
    private final ScheduledExecutorService ticker = Executors.newSingleThreadScheduledExecutor();

    private final Java2DGraphicsContext context = new Java2DGraphicsContext();
    private final Java2DGraphicsBuffer buffer = context.allocateGraphicsBuffer();
    private volatile ScheduledFuture<?> scheduled;
    private volatile long bufferInvalid = 0L;

    public TestUI() {
        add(buffer.getCanvas());

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("windowClosing");
                System.exit(0);
            }
        });
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                System.out.println("componentResized");
                bufferInvalid = System.currentTimeMillis();
            }

            @Override
            public void componentShown(ComponentEvent e) {
                System.out.println("componentShown");
                schedule();
            }
        });

        setSize(600, 600);
    }

    public static void main(String[] args) {
        TestUI ui = new TestUI();
        ui.setVisible(true);
    }

    public void update() {
        try {
            if (bufferInvalid < System.currentTimeMillis()) {
                System.out.println("buffer reset");
                buffer.reset();
                bufferInvalid = Long.MAX_VALUE;
            }

            context.drawRect(
                    new Offset(100, 100),
                    new Rect(-5, -15, 200, 20)
            ).apply(context, buffer);
            context.drawText(
                    new Offset(100, 100),
                    new Text(new UTF16Array(new Date().toString()), null)
            ).apply(context, buffer);
            context.drawLine(
                    new Offset(buffer.getWidth() - 10, 0),
                    new Line(0, 0, 0, buffer.getHeight())
            ).apply(context, buffer);

            buffer.flush();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    private void schedule() {
        if (scheduled == null) {
            synchronized (this) {
                if (scheduled == null) {
                    System.out.println("schedule");
                    Canvas canvas = buffer.getCanvas();
                    canvas.setBackground(Color.WHITE);
                    canvas.createBufferStrategy(2);
                    buffer.reset();
                    scheduled = ticker.scheduleWithFixedDelay(this::update, 0, FRAME, TimeUnit.MILLISECONDS);
                }
            }
        }
    }
}

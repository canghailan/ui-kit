package cc.whohow.ui.provider.java2d;

import cc.whohow.ui.graphics.GraphicsBuffer;

import java.awt.*;
import java.awt.image.BufferStrategy;

public class Java2DGraphicsBuffer implements GraphicsBuffer {
    private Canvas canvas;
    private BufferStrategy strategy;
    private Graphics2D graphics;

    public Java2DGraphicsBuffer() {
        this.canvas = new Canvas();
    }

    @Override
    public int getWidth() {
        return canvas.getWidth();
    }

    @Override
    public int getHeight() {
        return canvas.getHeight();
    }

    @Override
    public GraphicsBuffer reset() {
        strategy = canvas.getBufferStrategy();
        if (strategy != null) {
            if (graphics != null) {
                graphics.dispose();
            }
            graphics = (Graphics2D) strategy.getDrawGraphics();
        } else {
            if (graphics == null) {
                graphics = (Graphics2D) canvas.getGraphics();
            }
        }
        graphics.setColor(canvas.getBackground());
        graphics.fillRect(0, 0, getWidth(), getHeight());
        return this;
    }

    @Override
    public GraphicsBuffer flush() {
        if (strategy != null) {
            strategy.show();
        }
        canvas.invalidate();
        return this;
    }

    @Override
    public void close() {
        if (graphics != null) {
            graphics.dispose();
        }
    }

    @Override
    public String toString() {
        return canvas.toString();
    }

    public Canvas getCanvas() {
        return canvas;
    }

    public Graphics2D getGraphics() {
        return graphics;
    }
}

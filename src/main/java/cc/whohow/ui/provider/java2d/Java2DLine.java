package cc.whohow.ui.provider.java2d;

import cc.whohow.ui.Offset;
import cc.whohow.ui.geom.Line;
import cc.whohow.ui.graphics.GraphicsContext;
import cc.whohow.ui.graphics.GraphicsDrawable;

import java.awt.*;

public class Java2DLine implements GraphicsDrawable<Java2DGraphicsBuffer> {
    private final Offset offset;
    private final Line line;

    public Java2DLine(Offset offset, Line line) {
        this.offset = offset;
        this.line = line;
    }

    @Override
    public void apply(GraphicsContext<Java2DGraphicsBuffer> context, Java2DGraphicsBuffer buffer) {
        Graphics2D graphics = buffer.getGraphics();
        graphics.setColor(java.awt.Color.BLACK);
        graphics.drawLine(
                (int) (offset.getX() + line.getX1()),
                (int) (offset.getY() + line.getY1()),
                (int) (offset.getX() + line.getX2()),
                (int) (offset.getY() + line.getY2())
        );
    }
}

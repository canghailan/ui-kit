package cc.whohow.ui.provider.java2d;

import cc.whohow.ui.Offset;
import cc.whohow.ui.geom.Rect;
import cc.whohow.ui.graphics.GraphicsContext;
import cc.whohow.ui.graphics.GraphicsDrawable;

import java.awt.*;

public class Java2DRect implements GraphicsDrawable<Java2DGraphicsBuffer> {
    private final Offset offset;
    private final Rect rect;

    public Java2DRect(Offset offset, Rect rect) {
        this.offset = offset;
        this.rect = rect;
    }

    @Override
    public void apply(GraphicsContext<Java2DGraphicsBuffer> context, Java2DGraphicsBuffer buffer) {
        int x = (int) (offset.getX() + rect.getLeft());
        int y = (int) (offset.getY() + rect.getTop());
        int width = (int) rect.getWidth();
        int height = (int) rect.getHeight();

        Graphics2D graphics = buffer.getGraphics();
        graphics.setColor(Color.WHITE);
        graphics.fillRect(x, y, width, height);
        graphics.setColor(Color.BLACK);
        graphics.drawRect(x, y, width, height);
    }
}

package cc.whohow.ui.provider.java2d;

import cc.whohow.ui.Offset;
import cc.whohow.ui.geom.Line;
import cc.whohow.ui.geom.Path;
import cc.whohow.ui.geom.Rect;
import cc.whohow.ui.graphics.GraphicsContext;
import cc.whohow.ui.graphics.GraphicsDrawable;
import cc.whohow.ui.image.Image;
import cc.whohow.ui.text.Text;

public class Java2DGraphicsContext implements GraphicsContext<Java2DGraphicsBuffer> {
    @Override
    public Java2DGraphicsBuffer allocateGraphicsBuffer() {
        return new Java2DGraphicsBuffer();
    }

    @Override
    public GraphicsDrawable<Java2DGraphicsBuffer> drawLine(Offset offset, Line line) {
        return new Java2DLine(offset, line);
    }

    @Override
    public GraphicsDrawable<Java2DGraphicsBuffer> drawRect(Offset offset, Rect rect) {
        return new Java2DRect(offset, rect);
    }

    @Override
    public GraphicsDrawable<Java2DGraphicsBuffer> drawPath(Offset offset, Path path) {
        return null;
    }

    @Override
    public GraphicsDrawable<Java2DGraphicsBuffer> drawImage(Offset offset, Image image) {
        return null;
    }

    @Override
    public GraphicsDrawable<Java2DGraphicsBuffer> drawText(Offset offset, Text text) {
        return new Java2DText(offset, text);
    }
}

package cc.whohow.ui.graphics;

import cc.whohow.ui.Offset;
import cc.whohow.ui.geom.Line;
import cc.whohow.ui.geom.Path;
import cc.whohow.ui.geom.Rect;
import cc.whohow.ui.image.Image;
import cc.whohow.ui.text.Text;

public interface GraphicsContext<B extends GraphicsBuffer> {
    B allocateGraphicsBuffer();
    GraphicsDrawable<B> drawLine(Offset offset, Line line);
    GraphicsDrawable<B> drawRect(Offset offset, Rect rect);
    GraphicsDrawable<B> drawPath(Offset offset, Path path);
    GraphicsDrawable<B> drawImage(Offset offset, Image image);
    GraphicsDrawable<B> drawText(Offset offset, Text text);
}

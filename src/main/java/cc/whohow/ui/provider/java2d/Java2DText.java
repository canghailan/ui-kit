package cc.whohow.ui.provider.java2d;

import cc.whohow.ui.Offset;
import cc.whohow.ui.graphics.GraphicsContext;
import cc.whohow.ui.graphics.GraphicsDrawable;
import cc.whohow.ui.text.Text;

import java.awt.*;

public class Java2DText implements GraphicsDrawable<Java2DGraphicsBuffer> {
    private final Offset offset;
    private final Text text;

    public Java2DText(Offset offset, Text text) {
        this.offset = offset;
        this.text = text;
    }

    @Override
    public void apply(GraphicsContext<Java2DGraphicsBuffer> context, Java2DGraphicsBuffer buffer) {
        Graphics2D graphics = buffer.getGraphics();
        graphics.setColor(java.awt.Color.BLACK);
        graphics.drawString(
                new PlainCharacterIterator(text.getText()),
                (float) offset.getX(), (float) offset.getY()
        );
    }
}

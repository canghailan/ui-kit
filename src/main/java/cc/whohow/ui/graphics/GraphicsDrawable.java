package cc.whohow.ui.graphics;

import cc.whohow.ui.view.View;

public interface GraphicsDrawable<B extends GraphicsBuffer> extends View {
    void apply(GraphicsContext<B> context, B buffer);
}

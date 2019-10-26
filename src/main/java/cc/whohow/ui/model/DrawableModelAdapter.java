package cc.whohow.ui.model;

import cc.whohow.ui.graphics.GraphicsBuffer;
import cc.whohow.ui.graphics.GraphicsContext;
import cc.whohow.ui.view.View;

public class DrawableModelAdapter<B extends GraphicsBuffer, V extends View> extends DrawableModel {
    protected V view;

    public DrawableModelAdapter(V view) {
        this.view = view;
    }

    @Override
    public Key getKey() {
        return null;
    }

    @Override
    public V createView(BuildContext context) {
        GraphicsContext<B> graphicsContext = context.getGraphicsContext();
        graphicsContext.allocateGraphicsBuffer();
        return view;
    }
}

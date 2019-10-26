package cc.whohow.ui.model;

import cc.whohow.ui.graphics.GraphicsBuffer;
import cc.whohow.ui.graphics.GraphicsContext;

public interface BuildContext {
    <B extends GraphicsBuffer> GraphicsContext<B> getGraphicsContext();
}

package cc.whohow.ui.model;

import cc.whohow.ui.component.DrawableComponent;
import cc.whohow.ui.view.View;

public abstract class DrawableModel implements Model {
    @Override
    public DrawableComponent createComponent() {
        return new DrawableComponent(this);
    }

    public abstract View createView(BuildContext context);
}

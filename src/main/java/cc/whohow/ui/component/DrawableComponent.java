package cc.whohow.ui.component;

import cc.whohow.ui.model.DrawableModel;
import cc.whohow.ui.view.View;

public class DrawableComponent implements Component {
    protected Component parent;
    protected DrawableModel model;
    protected View view;

    public DrawableComponent(DrawableModel model) {
        this.model = model;
    }

    @Override
    public Component getParent() {
        return parent;
    }

    @Override
    public DrawableModel getModel() {
        return model;
    }

    public View getView() {
        return view;
    }
}

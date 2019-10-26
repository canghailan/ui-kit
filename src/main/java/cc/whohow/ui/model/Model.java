package cc.whohow.ui.model;

import cc.whohow.ui.component.Component;

public interface Model {
    Key getKey();

    Component createComponent();
}

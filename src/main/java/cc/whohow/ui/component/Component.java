package cc.whohow.ui.component;

import cc.whohow.ui.model.Model;

public interface Component {
    Component getParent();

    Model getModel();

//    void build();
//
//    void layout();
//
//    void paint();

//    void mount();
//
//    void update();
//
//    void unmount();
}

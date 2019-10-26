package cc.whohow.ui.core;

import cc.whohow.ui.Pixels;

public class Px implements Pixels {
    private final double px;

    public Px(double px) {
        this.px = px;
    }

    @Override
    public double get(double context) {
        return px;
    }
}

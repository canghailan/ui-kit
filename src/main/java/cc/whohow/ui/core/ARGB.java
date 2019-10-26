package cc.whohow.ui.core;

import cc.whohow.ui.Color;

public class ARGB implements Color {
    private int value;

    public ARGB(int value) {
        this.value = value;
    }

    public ARGB(int a, int r, int g, int b) {
        this(((a & 0xFF) << 24) |
                ((r & 0xFF) << 16) |
                ((g & 0xFF) << 8) |
                (b & 0xFF));
    }

    @Override
    public int getAlpha() {
        return (value >> 24) & 0xFF;
    }

    @Override
    public int getRed() {
        return (value >> 16) & 0xFF;
    }

    @Override
    public int getGreen() {
        return (value >> 8) & 0xFF;
    }

    @Override
    public int getBlue() {
        return (value) & 0xFF;
    }

    @Override
    public int value() {
        return value;
    }
}

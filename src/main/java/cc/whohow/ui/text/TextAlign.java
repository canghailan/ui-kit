package cc.whohow.ui.text;

public enum TextAlign {
    START("start"),
    END("end"),
    LEFT("left"),
    RIGHT("right"),
    CENTER("center"),
    JUSTIFY("justify");

    private final String symbol;

    TextAlign(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
}

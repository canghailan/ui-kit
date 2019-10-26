package cc.whohow.ui.style;

public class DoubleStyle implements Style<Double> {
    private final String name;

    public DoubleStyle(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Double getValue(String text) {
        return getDoubleValue(text);
    }

    public double getDoubleValue(String text) {
        return Double.parseDouble(text);
    }
}

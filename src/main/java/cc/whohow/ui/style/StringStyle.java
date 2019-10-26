package cc.whohow.ui.style;

public class StringStyle implements Style<String> {
    private final String name;

    public StringStyle(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getValue(String text) {
        return text;
    }
}

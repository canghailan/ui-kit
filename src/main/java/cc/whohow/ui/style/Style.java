package cc.whohow.ui.style;

public interface Style<V> {
    String getName();
    V getValue(String text);
}
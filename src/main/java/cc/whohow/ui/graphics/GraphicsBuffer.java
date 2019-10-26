package cc.whohow.ui.graphics;

public interface GraphicsBuffer extends AutoCloseable {
    int getWidth();
    int getHeight();
    GraphicsBuffer reset();
    GraphicsBuffer flush();
    void close();
}

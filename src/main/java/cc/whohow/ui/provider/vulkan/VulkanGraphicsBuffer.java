package cc.whohow.ui.provider.vulkan;

import cc.whohow.ui.graphics.GraphicsBuffer;

public class VulkanGraphicsBuffer implements GraphicsBuffer {
    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public GraphicsBuffer reset() {
        return this;
    }

    @Override
    public GraphicsBuffer flush() {
        return this;
    }

    @Override
    public void close() {

    }
}

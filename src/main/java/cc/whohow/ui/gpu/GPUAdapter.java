package cc.whohow.ui.gpu;

import java.util.concurrent.CompletableFuture;

public interface GPUAdapter {
    String getName();
    Object getExtensions();
    CompletableFuture<GPUDevice>  requestDevice(GPUDeviceDescriptor descriptor);
}

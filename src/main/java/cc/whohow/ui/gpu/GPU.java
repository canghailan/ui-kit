package cc.whohow.ui.gpu;

import java.util.concurrent.CompletableFuture;

/**
 * https://webkit.org/demos/webgpu/
 */
public interface GPU {
    CompletableFuture<GPUAdapter> requestAdapter(GPURequestAdapterOptions options);
}

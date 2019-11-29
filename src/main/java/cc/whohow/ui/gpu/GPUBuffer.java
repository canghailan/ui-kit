package cc.whohow.ui.gpu;

import cc.whohow.ui.ArrayBuffer;

import java.util.concurrent.CompletableFuture;

public interface GPUBuffer {
    CompletableFuture<ArrayBuffer> mapReadAsync();
    CompletableFuture<ArrayBuffer> mapWriteAsync();
    void unmap();
    void destroy();
}

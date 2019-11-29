package cc.whohow.ui.gpu;

public interface GPUDevice {
    GPUAdapter getAdapter();
    Object getExtensions();
    Object getLimits();

}

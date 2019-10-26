package cc.whohow.ui.application;

public interface ApplicationContext {
    <T> T getService(Class<T> serviceType);
}

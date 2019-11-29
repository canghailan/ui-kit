package cc.whohow.ui.gpu;

public enum GPUPowerPreference {
    LOW_POWER("low-power"),
    HIGH_PERFORMANCE("high-performance");

    private final String name;

    GPUPowerPreference(String name) {
        this.name = name;
    }
}

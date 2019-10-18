public abstract class TVDevice implements Volume,Device {
    boolean isOn = false;
    int volumeLevel = 0;
    boolean mute = false;
    int channelNumber = 0;
    String modelName;
}

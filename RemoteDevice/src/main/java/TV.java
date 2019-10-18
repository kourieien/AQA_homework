public class TV extends TVDevice {

    public TV (String model) {
        this.modelName = model;
    }

    public void powerOn() {
        isOn = true;
    }

    public void powerOff() {
        isOn = false;
    }

    public void setChannel (int channel) {
        this.channelNumber = channel;
    }

    public int currentChannel() {
        return channelNumber;
    }

    public void upVolume() {
        this.volumeLevel += 10;
    }

    public void downVolume() {
        this.volumeLevel -= 10;
    }

    public void mute() {
        if (mute) mute=false;
        else mute=true;
    }
}

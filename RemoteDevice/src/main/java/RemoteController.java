interface Device {
    public void powerOn();

    public void powerOff();

    public void setChannel (int channel);

    public int currentChannel();

}

interface Volume {

    public void upVolume();

    public void downVolume();

    public void mute();
}

public class RemoteController {

    public void powerOn(TV tv1) {
        tv1.powerOn();
    }

    public void powerOff(TV tv1) {
        tv1.powerOff();
    }

    public void setChannel (TV tv1, int channel) {
        tv1.setChannel(channel);
    }

    public int currentChannel(TV tv1) {
        return tv1.currentChannel();
    }

    public void upVolume(TV tv1) {
        tv1.upVolume();
    }

    public void downVolume(TV tv1) {
        tv1.downVolume();
    }

    public void mute(TV tv1) {
        tv1.mute();
    }

}

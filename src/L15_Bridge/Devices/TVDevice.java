package L15_Bridge.Devices;

// Concrete Implementor

// Here is an implementation of the EntertainmentDevice
// abstract class. I'm specifying what makes it different
// from other devices

public class TVDevice extends EntertainmentDevice {
    public TVDevice(int deviceState, int maxSetting) {
        this.deviceState = deviceState;
        this.maxSetting = maxSetting;
    }

    public void buttonFivePressed() {
        System.out.println("Channel Down");
        deviceState--;
    }

    public void buttonSixPressed() {
        System.out.println("Channel Up");
        deviceState++;
    }
}
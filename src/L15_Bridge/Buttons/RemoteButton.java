package L15_Bridge.Buttons;

// Abstraction

// This is an abstract class that will represent numerous
// ways to work with each device

import L15_Bridge.Devices.EntertainmentDevice;

public abstract class RemoteButton {
    // A reference to a generic device using aggregation
    private EntertainmentDevice theDevice;

    public RemoteButton(EntertainmentDevice theDevice) {
        this.theDevice = theDevice;
    }

    public void buttonFivePressed() {
        theDevice.buttonFivePressed();
    }

    public void buttonSixPressed() {
        theDevice.buttonSixPressed();
    }

    public void deviceFeedback() {
        theDevice.deviceFeedback();
    }

    public abstract void buttonNinePressed();
}
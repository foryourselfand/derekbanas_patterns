package L15_Bridge.Buttons;

// Refined Abstraction

// If I decide I want to further extend the remote I can

import L15_Bridge.Buttons.RemoteButton;
import L15_Bridge.Devices.EntertainmentDevice;

public class DVDRemote extends RemoteButton {
    private boolean play = true;

    public DVDRemote(EntertainmentDevice newDevice) {
        super(newDevice);
    }

    public void buttonNinePressed() {
        play = !play;
        System.out.println("DVD is Playing: " + play);
    }
}

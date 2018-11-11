package L15_Bridge.Buttons;

// Refined Abstraction

// If I decide I want to further extend the remote I can

import L15_Bridge.Devices.EntertainmentDevice;

public class TVRemoteMute extends RemoteButton{
    public TVRemoteMute(EntertainmentDevice newDevice) {
        super(newDevice);
    }

    public void buttonNinePressed() {
        System.out.println("TV was Muted");
    }
}
package L15_Bridge;

// Refined Abstraction

// If I decide I want to further extend the remote I can

import L15_Bridge.Buttons.DVDRemote;
import L15_Bridge.Buttons.RemoteButton;
import L15_Bridge.Buttons.TVRemoteMute;
import L15_Bridge.Buttons.TVRemotePause;
import L15_Bridge.Devices.DVDDevice;
import L15_Bridge.Devices.TVDevice;

public class TestTheRemote {
    public static void main(String[] args) {
        RemoteButton theTV = new TVRemoteMute(new TVDevice(1, 200));
        RemoteButton theTV2 = new TVRemotePause(new TVDevice(1, 200));

        // HOMEWORK --------------
        RemoteButton theDVD = new DVDRemote(new DVDDevice(1, 14));

        // -----------------------
        System.out.println("Test TV with Mute");

        theTV.buttonFivePressed();
        theTV.buttonSixPressed();
        theTV.buttonNinePressed();

        System.out.println("\nTest TV with Pause");

        theTV2.buttonFivePressed();
        theTV2.buttonSixPressed();
        theTV2.buttonNinePressed();
        theTV2.deviceFeedback();

        // HOMEWORK
        System.out.println("\nTest DVD");

        theDVD.buttonFivePressed();
        theDVD.buttonSixPressed();
        theDVD.buttonNinePressed();
        theDVD.buttonNinePressed();
    }
}

package L12_Command.Commands;

import L12_Command.Receivers.ElectronicDevice;

public class TurnTVOn implements Command {

    ElectronicDevice theDevice;

    public TurnTVOn(ElectronicDevice theDevice){
        this.theDevice = theDevice;
    }

    public void execute() {
        theDevice.on();
    }

    public void undo() {
        theDevice.off();
    }

}

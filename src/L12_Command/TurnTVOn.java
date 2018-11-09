package L12_Command;

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

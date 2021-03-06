public class GarageDoorOpenCommand implements Command {
    Garage garage;

    public GarageDoorOpenCommand(Garage garage) {
        this.garage = garage;
    }

    @Override
    public void execute() {
        garage.doorOpen();
    }

    @Override
    public void undo() {
        garage.doorClose();
    }
}

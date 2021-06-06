public class GarageDoorCloseCommand implements Command {
    Garage garage;

    public GarageDoorCloseCommand(Garage garage) {
        this.garage = garage;
    }

    @Override
    public void execute() {
        garage.doorClose();
    }

    @Override
    public void undo() {
        garage.doorOpen();
    }
}

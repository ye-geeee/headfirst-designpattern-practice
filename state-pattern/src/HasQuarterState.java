public class HasQuarterState implements State {
    GumballMachine machine;

    public HasQuarterState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please insert only one quarter");
    }

    @Override
    public void ejectQuarter() {
        machine.setState(machine.getNoQuarterState());
        System.out.println("Returning quarter");
    }

    @Override
    public void turnCrank() {
        machine.setState(machine.getSoldState());
        System.out.println("You turned the crank");
        dispense();
    }

    @Override
    public void dispense() {
        System.out.println("Cannot dispense the ball");
    }
}

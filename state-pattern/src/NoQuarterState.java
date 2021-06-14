public class NoQuarterState implements State {
    GumballMachine machine;

    public NoQuarterState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Inserted quarter");
        machine.setState(machine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Please insert quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("Please insert quarter");
    }

    @Override
    public void dispense() {
        System.out.println("Please insert quarter");
    }
}

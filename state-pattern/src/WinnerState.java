public class WinnerState implements State {
    GumballMachine machine;

    public WinnerState(GumballMachine gumballMachine) {
        machine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Wrong access");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Wrong access");
    }

    @Override
    public void turnCrank() {
        System.out.println("Wrong access");
    }

    @Override
    public void dispense() {
        System.out.println("Congratulations! You can get one more ball.");
        machine.releaseBall();
        if (machine.getCount() > 0) {
            machine.releaseBall();
            if (machine.getCount() > 0) {
                machine.setState(machine.getNoQuarterState());
            } else {
                System.out.println("There is no ball anymore");
                machine.setState(machine.getSoldOutState());
            }
        } else {
            machine.setState(machine.getSoldOutState());
        }
    }
}

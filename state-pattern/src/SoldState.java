public class SoldState implements State {
    GumballMachine machine;

    public SoldState(GumballMachine gumballMachine) {
        machine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait for a second. The gumball is going out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You already picked the ball");
    }

    @Override
    public void turnCrank() {
        System.out.println("Please turn crank once");
    }

    @Override
    public void dispense() {
        machine.releaseBall();
        System.out.println("Gumball is going out");
        if (machine.getCount() > 0) {
            machine.setState(machine.getNoQuarterState());
        } else {
            System.out.println("There is no gumball anymore");
            machine.setState(machine.getSoldState());
        }
    }
}

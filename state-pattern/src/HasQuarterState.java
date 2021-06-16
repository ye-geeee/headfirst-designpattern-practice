import java.util.Random;

public class HasQuarterState implements State {
    Random randomWinner = new Random(System.currentTimeMillis());
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
        int winner = randomWinner.nextInt(10);
        if ((winner == 0) && (machine.getCount() > 1)) {
            machine.setState(machine.getWinnerState());
        } else {
            machine.setState(machine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("Cannot dispense the ball");
    }
}

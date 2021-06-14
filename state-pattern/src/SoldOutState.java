public class SoldOutState implements State {
    GumballMachine machine;

    public SoldOutState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("SOLD OUT");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("No quarter. Cannot return quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("Already sold out");
    }

    @Override
    public void dispense() {
        System.out.println("Already sold out");
    }
}

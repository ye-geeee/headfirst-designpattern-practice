public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachine machine = new GumballMachine(5);
        System.out.println(machine);

        machine.insertQuarter();
        machine.turnCrank();

        System.out.println("\n" + machine);

        machine.insertQuarter();
        machine.ejectQuarter();
        machine.turnCrank();

        System.out.println("\n" + machine);

        machine.insertQuarter();
        machine.turnCrank();
        machine.insertQuarter();
        machine.turnCrank();
        machine.ejectQuarter();

        System.out.println("\n" + machine);

        machine.insertQuarter();
        machine.insertQuarter();
        machine.turnCrank();
        machine.insertQuarter();
        machine.turnCrank();
        machine.insertQuarter();
        machine.turnCrank();

        System.out.println("\n" + machine);
    }
}

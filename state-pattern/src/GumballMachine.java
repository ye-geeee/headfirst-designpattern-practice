public class GumballMachine {

    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    public void insertQuarter() {
        switch (state) {
            case SOLD_OUT:
                System.out.println("SOLD OUT");
                break;
            case NO_QUARTER:
                state = HAS_QUARTER;
                System.out.println("Inserted quarter");
                break;
            case HAS_QUARTER:
                System.out.println("Please insert only one quarter");
                break;
            case SOLD:
                System.out.println("Please wait for a second. The gumball is going out");
                break;
        }
    }

    public void ejectQuarter() {
        switch (state) {
            case SOLD_OUT:
                System.out.println("No quarter. Cannot return quarter");
                break;
            case NO_QUARTER:
                System.out.println("Please insert quarter");
                break;
            case HAS_QUARTER:
                state = NO_QUARTER;
                System.out.println("Returning quarter");
                break;
            case SOLD:
                System.out.println("You already picked the ball");
                break;
        }
    }

    public void turnCrank() {
        switch (state) {
            case SOLD_OUT:
                System.out.println("Already sold out");
                break;
            case NO_QUARTER:
                System.out.println("Please insert quarter");
                break;
            case HAS_QUARTER:
                state = SOLD;
                System.out.println("You turned the crank");
                dispense();
                break;
            case SOLD:
                System.out.println("Please turn crank once");
                break;
        }
    }

    public void dispense() {
        switch (state) {
            case SOLD_OUT:
                System.out.println("Already sold out");
                break;
            case NO_QUARTER:
                System.out.println("Please insert quarter");
                break;
            case HAS_QUARTER:
                System.out.println("You turned the crank");
                state = SOLD;
                break;
            case SOLD:
                System.out.println("Gumball is going out");
                count = count - 1;
                if (count > 0) {
                    state = NO_QUARTER;
                } else {
                    System.out.println("There is no gumball anymore");
                    state = SOLD_OUT;
                }
                break;
        }
    }

    @Override
    public String toString() {
        return "state : " + state + " count : " + count;
    }
}

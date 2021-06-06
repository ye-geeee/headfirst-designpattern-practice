public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    String room;
    int speed;

    public CeilingFan(String room) {
        this.room = room;
        speed = 0;
    }

    public void on() {
        System.out.println("Turn on the fan!!! The speed is " + getSpeed());
    }

    public void off() {
        System.out.println("Turn off the fan!!!");
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
        System.out.println("Turn on the fan!!! The speed is " + getSpeed());
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println("Turn on the fan!!! The speed is " + getSpeed());
    }

    public void low() {
        speed = LOW;
        System.out.println("Turn on the fan!!! The speed is " + getSpeed());
    }

    public int getSpeed() {
        return speed;
    }
}

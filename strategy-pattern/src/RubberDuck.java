public class RubberDuck extends Duck {
    @Override
    void display() {
        System.out.println("I'm toy rubber duck");
    }

    @Override
    void fly() {
        System.out.println("Do nothing");
    }
}

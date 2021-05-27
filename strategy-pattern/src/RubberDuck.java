public class RubberDuck extends Duck {

    public RubberDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    void display() {
        System.out.println("I'm toy rubber duck");
    }
}

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("I'm special RedheadDuck!");
    }
}

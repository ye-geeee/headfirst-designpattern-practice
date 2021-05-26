public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Duck redheadDuck = new RedheadDuck();

        mallardDuck.quack();
        mallardDuck.swim();
        mallardDuck.display();

        redheadDuck.quack();
        redheadDuck.swim();
        redheadDuck.display();
    }
}

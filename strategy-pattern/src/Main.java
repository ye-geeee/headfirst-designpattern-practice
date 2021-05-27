public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Duck redheadDuck = new RedheadDuck();
        Duck rubberDuck = new RubberDuck();
        Duck modelDuck = new ModelDuck();

        mallardDuck.swim();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        redheadDuck.swim();
        redheadDuck.display();
        redheadDuck.performFly();
        redheadDuck.performQuack();

        rubberDuck.swim();
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();

        modelDuck.swim();
        modelDuck.display();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
        modelDuck.performQuack();
    }
}

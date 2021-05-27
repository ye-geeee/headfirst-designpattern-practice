abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    void swim() {
        System.out.println("All ducks can swimming");
    }

    abstract void display(); // 모든 오리의 생김새는 다르다

    void performFly() {
        flyBehavior.fly();
    }

    void performQuack() {
        quackBehavior.quark();
    }
}

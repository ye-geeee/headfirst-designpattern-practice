public class QuackCounter implements Quackable {
    static int numberOfQuacks;
    Quackable duck;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    public static int getQuacks() {
        return numberOfQuacks;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        // duck.notifyObservers();
    }
}

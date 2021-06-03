public class SingletonNoSynchronized {
    private static final SingletonNoSynchronized uniqueInstance = new SingletonNoSynchronized();

    private SingletonNoSynchronized() {
    }

    private static SingletonNoSynchronized getInstance() {
        return uniqueInstance;
    }
}

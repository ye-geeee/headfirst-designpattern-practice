public class DoubleCheckLock {
    private volatile static DoubleCheckLock uniqueInstance;

    private DoubleCheckLock() {}

    public static DoubleCheckLock getInstance() {
        if (uniqueInstance == null) {
            synchronized (DoubleCheckLock.class) {
                if (uniqueInstance == null) {
                    return new DoubleCheckLock();
                }
            }
        }

        return uniqueInstance;
    }
}

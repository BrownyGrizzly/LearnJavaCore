package ThreadAndMultiThread;

class MySynchronizedThread extends Thread {
    private final SynchronizedCounter counter;

    public MySynchronizedThread(String name, SynchronizedCounter counter) {
        super(name);
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            counter.increment();
        }
    }
}
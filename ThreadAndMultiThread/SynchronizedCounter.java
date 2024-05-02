package ThreadAndMultiThread;

class SynchronizedCounter {
    private int value = 0;

    public synchronized void increment() {
        value++;
        System.out.println(Thread.currentThread().getName() + ": Counter value: " + value);
    }
}
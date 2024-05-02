package ThreadAndMultiThread;

public class IsAliveDemo {
    public static void main(String[] args) {
        Thread thread1 = new MyThread("Thread 1");
        Thread thread2 = new MyThread("Thread 2");

        thread1.start();
        thread2.start();

        while (thread1.isAlive() || thread2.isAlive()) {
            // Chờ đợi cho đến khi cả hai thread đều hoàn thành
            System.out.println("Threads are still running...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Both threads have finished.");
    }
}

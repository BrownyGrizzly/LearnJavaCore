package ThreadAndMultiThread;

public class JoinDemo {
    public static void main(String[] args) {
        Thread thread1 = new MyThread("Thread 1");
        Thread thread2 = new MyThread("Thread 2");

        thread1.start();
        thread2.start();

        try {
            thread1.join(); // Chờ đợi cho đến khi thread1 kết thúc
            thread2.join(); // Chờ đợi cho đến khi thread2 kết thúc
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread finished.");
    }
}

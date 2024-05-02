package ThreadAndMultiThread;

public class ThreadDemo {
    public static void main(String[] args) {
        // Demo tạo thread thông qua lớp Thread
        Thread thread1 = new CreateThreadExtend("Thread 1");
        thread1.start();

        // Demo tạo thread thông qua giao diện Runnable
        Thread thread2 = new Thread(new CreateThreadImplement(), "Thread 2");
        thread2.start();

        // Demo sử dụng synchronized
        SynchronizedCounter counter = new SynchronizedCounter();
        Thread thread3 = new MySynchronizedThread("Thread 3", counter);
        Thread thread4 = new MySynchronizedThread("Thread 4", counter);
        thread3.start();
        thread4.start();
    }
}

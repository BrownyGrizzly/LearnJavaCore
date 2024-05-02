package ThreadAndMultiThread;

public class CreateThreadImplement implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello from CreateThreadImplement " + Thread.currentThread().getName());
    }
}

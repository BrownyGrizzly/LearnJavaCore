package ThreadAndMultiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<String> future = executor.submit(() -> {
            Thread.sleep(2000); // Giả lập công việc mất thời gian
            return "Task completed";
        });

        while (!future.isDone()) {
            System.out.println("Task is not yet completed...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        try {
            String result = future.get();
            System.out.println("Result: " + result); // Hiển thị kết quả trả về
        } catch (Exception e) {
            e.printStackTrace();
        }

        executor.shutdown();
    }
}


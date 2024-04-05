package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolExample {

    static int sum = 0;

    public static void main(String[] args){

        // Tạo ThreadPool với 5 luồng
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        // Tạo các nhiệm vụ (task)
        Runnable task1 = () -> {
            for(int i = 0; i < 100; i++) {
                sum += i;
            }
            System.out.println("Thread 1: " + sum);
        };
        Runnable task2 = () -> {
            for(int i = 0; i < 100; i++) {
                sum += i;
            }
            System.out.println("Thread 2: " + sum);
        };

        // Gửi các nhiệm vụ đến ThreadPool
        executorService.submit(task1);
        executorService.submit(task2);

        // Đợi cho tất cả các nhiệm vụ hoàn thành
        executorService.shutdown();
        while (!executorService.isTerminated()) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Tất cả các nhiệm vụ đã hoàn thành!");
    }
}

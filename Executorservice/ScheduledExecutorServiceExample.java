package Executorservice;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceExample {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService se = Executors.newSingleThreadScheduledExecutor();
        String word = "asc";
        Runnable r1 = () -> System.out.println("From the Scheduled Executor Service :)");

        se.scheduleAtFixedRate(r1 , 3 ,5,TimeUnit.SECONDS);

        Thread.sleep(40000);
        System.out.println("Shutting down.");
        se.shutdown();
    }
}

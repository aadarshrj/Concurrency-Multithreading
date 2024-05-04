package Executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Program2 {
    public static void mainc(String[] args) {
        int n = Runtime.getRuntime().availableProcessors();
        ExecutorService ev = Executors.newFixedThreadPool(n);

        ExecutorService ev2 = Executors.newCachedThreadPool();

        ExecutorService ev3 = Executors.newSingleThreadExecutor();

        ExecutorService ev4 = Executors.newWorkStealingPool();
    }
}

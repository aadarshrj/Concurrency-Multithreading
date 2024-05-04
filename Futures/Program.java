package Futures;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Program {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(4);
        Runnable r = () -> System.out.println("  :) ");

        service.execute(r);

        Future<?> future = service.submit(r);

        try {
            future.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

    }
}

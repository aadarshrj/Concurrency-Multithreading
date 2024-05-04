package Futures;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        SummingNumberCallable sc = new SummingNumberCallable();
        sc.setA(23);
        sc.setB(27);
        ExecutorService service = Executors.newSingleThreadExecutor();

        Future<Integer> f = service.submit(sc);

        try {
            int val = f.get();
            System.out.println(val);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}

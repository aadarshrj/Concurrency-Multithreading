package Futures;

import java.util.concurrent.*;

public class ProgramCallable {
    public static void main(String[] args) {
        ExecutorService ev = Executors.newFixedThreadPool(4);

        Callable<String> c = () -> "Hello";

        Future<String> f = ev.submit(c);

        //do some stuff before getting the value from the callable;

        try {
           String val =  f.get();
           System.out.println(val);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}

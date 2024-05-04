package Executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Program1 {
    public static void main(String[] args) {
        ExecutorService ev = null;

        try{
           int n = Runtime.getRuntime().availableProcessors();
           System.out.println("Available Processor:"+n);
            ev = Executors.newFixedThreadPool(n);
           Runnable r = () -> System.out.println(" :) ");
           ev.execute(r);
       } finally {
            ev.shutdown();
        }
    }
}

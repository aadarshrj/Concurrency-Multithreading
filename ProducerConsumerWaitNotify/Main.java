package ProducerConsumerWaitNotify;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Integer> bucket = new ArrayList<>();
    public static void main(String[] args) {
    Thread t1 = new OddNumberProducer();
    Thread t2 = new OddNumberProducer();

        Thread c1 = new Consumer();
        Thread c2 = new Consumer();

    t1.start();
    t2.start();

    c1.start();
    c2.start();



    }
}

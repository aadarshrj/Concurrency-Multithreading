package ProducerConsumer;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Integer> bucket = new ArrayList<>();
    public static void main(String[] args) {
        Producer p1 = new Producer("p1");
        Producer p2 = new Producer("p2");
        Consumer c1 = new Consumer("c1");
        Consumer c2 = new Consumer("c2");

        p1.start();
        p2.start();
        c1.start();
        c2.start();
    }
}

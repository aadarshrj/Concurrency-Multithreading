package ProducerConsumerWaitNotify;

import java.util.Random;

public class OddNumberProducer extends Thread{
    @Override
    public void run(){
        for (int i = 1; i < 1000; i += 2) {
            synchronized (Main.bucket) {
                if (Main.bucket.size() < 100) {
                    Main.bucket.add(i);
                    Main.bucket.notifyAll();
                    System.out.println(Thread.currentThread().getName() + " added value:" + i +
                            " to the bucket");
                } else {
                    try {
                        Main.bucket.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}

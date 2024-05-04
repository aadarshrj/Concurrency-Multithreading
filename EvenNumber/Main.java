package EvenNumber;

import RunnableInterface.OddNumber;

public class Main {
    public static void main(String[] args) {
        EvenNumberThread t1 = new EvenNumberThread();
        t1.start();

        Runnable r = new OddNumber();

        Thread t2 = new Thread(r);


        System.out.println("End!");
    }
}

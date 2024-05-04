package Join;

public class Main {
    public static void main(String[] args) {
        Runnable r1 = new DB1Runnable();
        Runnable r2 = new DB2Runnable();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start(); t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Processing...");
    }
}

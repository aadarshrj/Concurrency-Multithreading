package Join;

public class DB1Runnable implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.println("DB1 querying has ended.");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

package Join;


public class DB2Runnable implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.println("DB2 querying has ended.");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

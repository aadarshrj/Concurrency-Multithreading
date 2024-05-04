package EvenNumber;

public class EvenNumberThread extends Thread{
    //Main method of the thread.
    @Override
    public void run() {
        for (int i = 0; i < 10; i+=2) {
            System.out.println(i);
        }
    }
}

package Synchronized;

public class Program1 {
    private Object monitor = new Object();

    public void a(){
        synchronized(monitor){

        }
    }
    public static synchronized void b(){
        /*
         *This will be same as synchronized(Program1.class).
         * */
    }

}

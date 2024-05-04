package Deadlock;

public class Program {
    private Object a = new Object();
    private Object b = new Object();

    public void m1(){
        synchronized(a){
            synchronized(b){

            }
        }
    }

    public void m2(){
        synchronized(b){
            synchronized (a){

            }
        }
    }
}

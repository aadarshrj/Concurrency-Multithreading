package ProducerConsumerWaitNotify;

public class Consumer extends Thread {

    @Override
    public void run(){
        while (true){
            synchronized (Main.bucket){
                if(!Main.bucket.isEmpty()){
                    int n = Main.bucket.get(0);
                    Main.bucket.remove(0);
                    if(n == 999){
                        System.out.println("Ending");
                        System.out.println(Thread.currentThread().getName()+" removed the value:"+n+" from the bucket.");

                        break;
                    }
                    Main.bucket.notifyAll();
                    System.out.println(Thread.currentThread().getName()+" removed the value:"+n+" from the bucket.");
                }else {
                    try {
                        Main.bucket.wait(5000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }

    }
}

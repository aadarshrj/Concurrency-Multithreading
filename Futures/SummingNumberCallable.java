package Futures;

import java.util.concurrent.Callable;

public class SummingNumberCallable implements Callable<Integer> {
    private int a , b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public Integer call() {
        return (a+b);
    }
}

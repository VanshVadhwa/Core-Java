class Counter 
{
    int count;
    public synchronized void increment() {
        count++;
    }
}

class A implements Runnable
{
    Counter c;
    A(Counter c) {
        this.c = c;
    }
    @Override
    public void run() {
        for(int i=1;i<=1000;i++) {
           c.increment();
        }
    }
}

class B implements Runnable
{
    Counter c;
    B(Counter c) {
        this.c = c;
    }
    @Override
    public void run() {
        for(int i=1;i<=1000;i++) {
            c.increment();
        }
    }
}



public class MultiThreading {
    public static void main(String[] args) {
        Counter c = new Counter();
        Runnable obj1 = new A(c);
        Runnable obj2 = new B(c);

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.getStackTrace();
        }

        System.out.println(c.count);
    }
}

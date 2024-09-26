class A extends Thread
{
    @Override
    public void run()
    {
        for(int i=1;i<=100;i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(500);
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
        } 
    }
}

class B extends Thread
{
    @Override
    public void run()
    {
        for(int i=1;i<=100;i++) {
            System.out.println("Hello"); 
            try {
                Thread.sleep(100);
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
        } 
    }
}

public class Threading {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();
    }   
}

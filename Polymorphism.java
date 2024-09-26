

class A 
{
    public void show() {
        System.out.println("it's show in A");
    }
}

class B extends A
{
    @Override
    public void show() {
        System.out.println("it's show in B");
    }
}

class C extends A 
{
    @Override
    public void show() {
        System.out.println("it's show in C");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();

        obj = new A();
        obj.show();

        obj = new C();
        obj.show();
    }
}

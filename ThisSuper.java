class A extends Object
{
    public A() {
        System.out.println("in A");
    }
    public A(int age) {
        System.out.println("in int A");
    }
}

class B extends A 
{
    public B() {
        System.out.println("in B");
    }
    public B(int age) {
        this();
        System.out.println("in int B");
    }
}

public class ThisSuper {
    public static void main(String[] args) {
        // B obj1 = new B(5);
    }
}
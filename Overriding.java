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
        System.out.println("it's a show in B");
    }
}

public class Overriding {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}

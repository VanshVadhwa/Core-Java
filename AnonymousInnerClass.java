class A 
{
    public void show() {
        System.out.println("it's A show");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        A obj1 = new A()
        {
            @Override
            public void show() {
                System.out.println("It's a new show");
            }
        };
        obj1.show();
    }
}

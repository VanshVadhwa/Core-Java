class A 
{
    // private int age;
    
    public void show() {
        System.out.println("it's show in A");
    }

    static class B {
        public void config() {
            System.out.println("it's config in B");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A.B obj1 = new A.B(); 
        obj1.config();
    }
}

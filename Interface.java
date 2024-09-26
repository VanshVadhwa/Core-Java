// abstract class A
// {
//     public abstract void show();
//     public abstract void config();
// } 

interface A
{
    void show();
    void config();
}

class B implements A
{
    @Override
    public void show() {
        System.out.println("It's a show");
    }
    @Override
    public void config() {
        System.out.println("It's a config");
    }
}

public class Interface {
    public static void main(String[] args) {
        B obj1 = new B();
        obj1.show();
        obj1.config();
    }

}

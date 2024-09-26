class Human
{
    private int age;
    private String name;

    //default constructor
    public Human()
    {
        age = 12;
        name = "John";
        System.out.println("in constructor");
    }

    //parameterized Constructor
    public Human(String name, int age) 
    {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
}

public class Constructors {
    public static void main(String[] args) {
        // Human obj1 = new Human();
        // obj1.setName("Vansh");
        // obj1.setAge(20);
        // System.out.println(obj1.getName() + " : " + obj1.getAge());

        Human obj2 = new Human("Vansh", 20);
        System.out.println(obj2.getName() + " : " + obj2.getAge());
    }
}

class Human
{
    private int age;
    private String name;

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

public class Encapsulation {
    public static void main(String[] args) {
        Human obj1 = new Human();
        obj1.setName("Vansh");
        obj1.setAge(20);
        System.out.println(obj1.getName() + " : " + obj1.getAge());
    }
}

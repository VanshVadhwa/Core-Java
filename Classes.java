class Mobile {

    String brand;
    int price;
    static String name;

    Mobile() {
        System.out.println("Hello");
    }
    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class Classes {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Samsung";
        obj1.price = 20000;
        Mobile.name = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Apple";
        obj2.price = 50000;
        Mobile.name = "iPhone";

        obj1.show();
        obj2.show();
    }
}
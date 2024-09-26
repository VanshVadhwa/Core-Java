class Mobile {
    String brand;
    int price;
    String name;

    void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class MobileClass {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        Mobile obj2 = new Mobile();

        obj1.brand = "Samsung";
        obj1.price = 16000;
        obj1.name = "SmartPhone";

        obj2.brand = "Apple";
        obj2.price = 50000;
        obj2.name = "iPhone";

        obj1.show();
        obj2.show();
    }
}

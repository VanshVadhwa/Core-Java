class Mobile {
    String brand;
    int price;
    static String name;
    
    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1(Mobile obj) {
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        Mobile obj2 = new Mobile();

        obj1.brand = "Samsung";
        obj1.price = 16000;
        Mobile.name = "SmartPhone";

        obj2.brand = "Apple";
        obj2.price = 50000;
        Mobile.name = "iPhone";

        obj1.show();
        obj2.show();

        Mobile.show1(obj1);
    }
}

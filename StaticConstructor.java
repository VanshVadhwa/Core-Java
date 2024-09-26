class Mobile {
    String brand;
    int price;
    static String name;

    static {
        name = "phone";
        System.out.println("in static");
    }

    public Mobile() {
        brand = "";
        price = 200;
        System.out.println("in constrcutor");
    }
    void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class StaticConstructor {
    public static void main(String[] args) throws ClassNotFoundException {
        //it only loads the class
        Class.forName("Mobile");

        // Mobile obj1 = new Mobile();
        // Mobile obj2 = new Mobile();

        // obj1.brand = "Samsung";
        // obj1.price = 16000;
        // Mobile.name = "SmartPhone";

        // obj2.brand = "Apple";
        // obj2.price = 50000;
        // Mobile.name = "iPhone";

        // obj1.show();
        // obj2.show();
    }
}

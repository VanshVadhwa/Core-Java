abstract class Car
{
    public abstract void drive();
    public abstract void fly();

    public void playMusic() {
        System.out.println("Music Playing..");
    }
}

abstract class WagonR extends Car {
    @Override 
    public void drive() {
        System.out.println("Driving a Car..");
    }
}

class AdvancedWagonR extends WagonR {
    @Override
    public void fly() {
        System.out.println("Car Flying..");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Car obj1 = new AdvancedWagonR();
        obj1.drive();
        obj1.playMusic();
        obj1.fly();
    }
}

interface Computer
{
    void code();
}

class Laptop implements Computer
{
    @Override
    public void code() {
        System.out.println("Code, Compile, and Run");
    }
}

class Desktop implements Computer
{
    @Override
    public void code() {
        System.out.println("Code, Compile, and Run : Faster");
    }
}

class Developer
{
    public void devApp(Computer lap) {
        lap.code();
    }
}

public class InterfaceNeed {
    public static void main(String[] args) {
        // Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer dev = new Developer();
        dev.devApp(desk);
    }
}

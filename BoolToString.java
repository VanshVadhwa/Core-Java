class Laptop
{
    private String model;
    private int price;

    public void setPrice(int price) {
        this.price = price;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getPrice() {
        return price;
    }
    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return model + " : " + price;
    }

    public boolean equals(Laptop that) //that here means other object(only a variable though, give any name :) )
    {
        return this.model.equals(that.model) && this.price == that.price;
    }

}

public class BoolToString {
    public static void main(String[] args) {
        Laptop obj1 = new Laptop();
        obj1.setPrice(10_00_00);
        obj1.setModel("MacBook");
        // System.out.println(obj1.getPrice() + " : " + obj1.getModel());

        Laptop obj2 = new Laptop();
        obj2.setPrice(10_00_000);
        obj2.setModel("MacBook");

        boolean isSame = obj1.equals(obj2); //obj1 == obj2 also valid
        System.out.println(isSame);
    }
}

class Calculator 
{
    public int add(int n1, int n2) {
        return n1 + n2;
    }
    public int sub(int n1, int n2) {
        return n1-n2;
    }
}

class AdvanceCalculator extends Calculator 
{
    public int mul(int n1, int n2) {
        return n1*n2;
    }
    public int div(int n1, int n2) {
        return n1/n2;
    } 
}

class VeryAdvanceCalculator extends AdvanceCalculator 
{
    public double power(int n1, int n2) {
        return Math.pow(n1,n2);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        VeryAdvanceCalculator obj1 = new VeryAdvanceCalculator();
        double r1 = obj1.power(3,5);
        int r2 = obj1.div(15, 3);
        int r3 = obj1.mul(3,5);
        int r4 = obj1.add(10,15);
        int r5 = obj1.sub(15,3);
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);
    }
}

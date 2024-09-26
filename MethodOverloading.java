class Calculator
{
    public int add(int n1, int n2) {
        return n1+n2;
    }
    public int add(int n1, int n2, int n3) {
        return n1+n2+n3;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        int result = obj.add(10,12,32);
        System.err.println(result);
    }
}

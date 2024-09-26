class Calculator {
    // int a=0; //this a is only a property, if we define a function, then that is a behavior
    Calculator() {
        System.out.println("You creator a object, you got me as a default constructor!");
    }
    public int add(int n1, int n2) { //this is a method/behavior
        int result = n1+n2;
        return result;
    }
}

public class CalculatorClass {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int num1 = 10;
        int num2 = 5;
        int result = calc.add(num1,num2);
        System.out.println(result);
    }
}
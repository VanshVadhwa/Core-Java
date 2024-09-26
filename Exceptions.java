public class Exceptions {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int[] arr = new int[5];

        try 
        {
            j = 18/4;
            System.out.println(arr[5]);
        }
        catch(ArithmeticException e) {
            System.out.println("Denominator is zero");
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound");
        }
        catch(Exception e) 
        {
            System.out.println("Error catched " + e);
        }

        System.out.println(j);
        System.out.println("Bye bye :)");

    }
}

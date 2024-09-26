class MyException extends Throwable
{
    public MyException(String string) {
        System.out.println(string);
    }
}

public class ThrowException {
    public static void main(String[] args) {
        int i = 20;
        int j = 18;

        try {
            j = j/i;
            if(j==0) {
                throw new MyException("I don't want to print zero");
            }
        }
        catch (MyException e) {
            System.out.println("How do you came here you idiot :)" + e);
        }

        System.out.println(j);
        System.out.println("Bye bye :)");
    }
}

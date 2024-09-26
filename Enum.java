enum Status {
    Running, Failed, Pending, Success; //Status is a class, and these 4 written are objects known as named constants :)
}

public class Enum {
    public static void main(String[] args) {
        // Status s = Status.Running;   
        // System.out.println(s.ordinal()); ordinal will give the index number starting from 0

        //print all now
        Status ss[] = Status.values();
        for(int i=0;i<4;i++) {
            System.out.print(ss[i] + " ");
        }
    }
}

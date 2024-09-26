public class JaggedArray {
    public static void main(String[] args) {
        int arr[][] = new int[3][];

        arr[0] = new int[4];
        arr[1] = new int[2];
        arr[2] = new int[3];

        for (int[] arr1 : arr) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print((int)(Math.random()*10) + " ");
            }
            System.out.println();
        }
    }
}

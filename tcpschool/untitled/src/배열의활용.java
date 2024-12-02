import java.util.Arrays;

public class 배열의활용 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4,5};
        int newLen = 10;

        int[] arr2 = new int[newLen];
        System.arraycopy(arr1, 0, arr2, 0, arr1.length);

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        int[] arr3 = Arrays.copyOf(arr1, 10);

            for(int i = 0 ; i < arr3.length; i++) {
                System.out.print(arr3[i] + " ");
            }
        System.out.println();

        int[] arr4 = (int[])arr1.clone();
            for(int i = 0; i < arr4.length; i++) {
                System.out.print(arr4[i] + " ");
            }
        System.out.println();

            int[] arr5 = new int[newLen];
            for(int i = 0 ; i < arr1.length; i++) {
                arr5[i] = arr1[i];
            }
            for(int i = 0; i < arr5.length; i++) {
                System.out.print(arr5[i] + " ");
            }
    }
}

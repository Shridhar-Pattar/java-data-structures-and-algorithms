import java.util.Arrays;

public class negativeElementLeftside {

    public static int[] AllNegativeLeftSide(int[] a) {

        int leftIndex = 0;

        for (int i = 0; i <= a.length - 1; i++) {

            if (a[i] < 0) {

                int temp = a[i];
                a[i] = a[leftIndex];
                a[leftIndex] = temp;
                leftIndex++;

            }
        }

        return a;

    }

    public static void main(String[] args) {

        int[] arr = { -1, 4, 5, -8, 6, 3, -2, -9 };

        System.out.println(Arrays.toString(AllNegativeLeftSide(arr)));

    }

}
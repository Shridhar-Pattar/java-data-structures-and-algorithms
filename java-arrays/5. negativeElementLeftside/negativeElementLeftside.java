import java.util.Arrays;

public class negativeElementLeftside {
    // First method is done by partition technique
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

    //Second method is using Two pointer technique
     public static int[] AllNegativeLeftSideByTwoPointer(int[] a){
          
        int low = 0;
        int high = a.length-1; 

        while (low<high) {
            
           if (a[low]<0) {
             low++;
            
           }
           else if(a[high]>0){
            high--;
           }
           else
           {
            int temp = a[low];
            a[low] = a[high];
            a[high] = temp;
            low++;
            high--;
           }

            
        }
             return a;
        
     }

    public static void main(String[] args) {

        int[] arr = { -1, 4, 5, -8, 6, 3, -2, -9 };

        System.out.println(Arrays.toString(AllNegativeLeftSideByTwoPointer(arr)));

    }

}
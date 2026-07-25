//package java;

import java.util.Arrays;

//-arrays.reverse_an_array;

public class ReverseArray {
         
    public static int[] reverse_an_array(int[] a){

             int n = a.length;
             int left = 0;
             int right = n-1;

             while (left<=right) {
                 
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;


             }
            return a;

    }

   public static void main(String[] args) {
    
     int[] a = {3,5,6,1,4,9};
     System.out.println(Arrays.toString(reverse_an_array(a)));

   }


}

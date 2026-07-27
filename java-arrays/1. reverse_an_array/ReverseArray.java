//package java;

import java.util.Arrays;
import java.util.Collections;

//-arrays.reverse_an_array;

public class ReverseArray {

   // reverse an array by using two pointer technique
   public static int[] reverse_an_array(int[] a) {

      int n = a.length;
      int left = 0;
      int right = n - 1;

      while (left <= right) {

         int temp = a[left];
         a[left] = a[right];
         a[right] = temp;
         left++;
         right--;

      }
      return a;

   }

   // reverse an array by creating new array
   public static int[] ReverseArrayByNewArray(int[] a) {

      int n = a.length;
      int[] b = new int[n];

      for (int i = 0; i <= n - 1; i++) {

         b[i] = a[n - 1 - i];

      }

      return b;

   }

   // Reverse an by using recursion
   public static void ReverseArrayByRecursion(int[] a, int left, int right) {

      if (left >= right) {

         return;
      }

      int temp = a[left];
      a[left] = a[right];
      a[right] = temp;

      ReverseArrayByRecursion(a, left + 1, right - 1);

   }




   public static void main(String[] args) {

      int[] a = { 3, 5, 6, 1, 4, 9 };
      // System.out.println(Arrays.toString(reverse_an_array(a)));
      int left = 0;
      int right = a.length - 1;

      ReverseArrayByRecursion(a, left, right);
      System.out.println(Arrays.toString(a));


         //One more method

         Integer[] arr = {10,20,30,40};

         Collections.reverse(Arrays.asList(arr));
         System.out.println(Arrays.toString(arr));

   }

}

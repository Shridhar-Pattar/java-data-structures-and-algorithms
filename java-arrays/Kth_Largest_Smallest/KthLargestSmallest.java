import java.util.Arrays;


public class KthLargestSmallest {

    //Simple sorting approach using java.util.Arrays
    public static void Kth_Largest_Smallest(int[] a, int KS, int KL){
          
        Arrays.sort(a);

        System.out.println("The " + KS + "th smallest element :" + a[KS-1] );
        System.out.println("The " + KL + "th largest element :" + a[a.length - KL]);
    }

    //Using QuickSelect technique which is based on QuickSort algorithm

          
     public static int partitionIndex(int[] arr, int low, int high){

        int pivot = arr[high];
        int i = low -1;

       for(int j = low; j<high; j++){
        
               if (arr[j]<pivot) {
                  
                  i++;
                  int temp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = temp;

               }      
           

       }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
          


        return i+1;
     }



    public static int quickSelectKthSmallest(int[] a, int low, int high, int k){
                 
            if (low<=high) {
                 
                int pivotIndex = partitionIndex(a, low, high);

                if (pivotIndex == k) {
                     return a[pivotIndex];
                }

                if (pivotIndex>k) {

                    return quickSelectKthSmallest(a, low, pivotIndex-1, k);

                }
                 if (pivotIndex<k) {

                    return quickSelectKthSmallest(a, pivotIndex+1, high, k);
                    
                }
            }
                 return -1;
    }
    

    public static void main(String[] args) {

      /* int[] a  = {3,2,5,8,1,67,34,64,21,9}; 
         Arrays.sort(a);
         System.out.println(Arrays.toString(a));
         Kth_Largest_Smallest(a, 2, 4);  */ 
           

         int[] a = {3,1,6,2,4,5};
         int k = 3;
         int low =0;
         int high = a.length-1;

         System.out.println(quickSelectKthSmallest(a, low, high, k-1));
         System.out.println(Arrays.toString(a));
       
         // for kth largest element if k = 3, pass a.length-k
         System.out.println(quickSelectKthSmallest(a, low, high, a.length-k));
         System.out.println(Arrays.toString(a));


    }
    
}

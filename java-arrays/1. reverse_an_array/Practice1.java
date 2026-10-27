import java.util.Arrays;

public class Practice1 {

  public static void swapArrayelements(int[] a, int left, int right){
             int temp = a[left];
             a[left] = a[right];
             a[right] = temp;
} 

  public static int[] reverse_an_array(int[] a, int left, int right){
      
        while (left<right) {
             swapArrayelements(a, left, right);
             left++;
             right--;

        }
     
    return a;

  }

 
    public static void main(String[] args) {
    
        int[] a = {1,2,3,4,5,6};
        System.err.println(Arrays.toString(reverse_an_array(a,0, a.length-1)));

 


 }

    
}

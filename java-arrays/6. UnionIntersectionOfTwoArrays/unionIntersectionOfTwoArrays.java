import java.util.HashSet;

public class unionIntersectionOfTwoArrays {
    
   public static void unionOfUnsortedArrays(int[] a, int[] b){
        
      
    HashSet<Integer> set = new HashSet<>();
       
    for(int i=0; i <= a.length-1; i++){
       
        set.add(a[i]);

    }

    for (int num : b) {
          set.add(num);
}
      

    System.out.println(set);

   }
    
  public static void main(String[] args) {
     
    int[] a = {3, 2, 2, 3, 3, 2};
    int [] b = {3,2,1};
    unionOfUnsortedArrays(a, b);


  }

}

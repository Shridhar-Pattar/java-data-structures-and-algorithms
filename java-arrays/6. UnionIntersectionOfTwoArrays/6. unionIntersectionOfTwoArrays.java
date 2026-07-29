public class unionIntersectionOfTwoArrays {
    public static int unique_elements(int[] k){
         
         int uniqueElement = k[0];
         int uniqueElementCount = 1;

         for(int i =1; i<=k.length-1;i++){
            
            if (k[i]!=uniqueElement) {
                 
                uniqueElement = k[i];
                uniqueElementCount++;
                
            }
                
         }
        return uniqueElementCount;
          }

    public static void unionOfTwoArrays(int[] a, int[] b){
       int uniqueA = unique_elements(a);
       int uniqueB = unique_elements(b);

       int[] result = new int[uniqueA+uniqueB];
       int index =0;

       for(int i =0; i<=result.length-1;i++){
            
    

       }
    
   
    } 
    
  public static void main(String[] args) {
    

  }

}

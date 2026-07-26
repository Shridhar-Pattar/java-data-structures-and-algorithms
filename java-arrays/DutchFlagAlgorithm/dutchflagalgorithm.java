import java.util.Arrays;

public class dutchflagalgorithm {

     
    //first method is to sort the given array using java.util.arrays
    public static int[] sortmethodDFA(int[] a){
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        return a;


    }
    
    //second method is calledd Counting method
    public static int[] CountingMethodDFA(int[] a) {
          
        int countZero = 0;
        int countOne = 0;
        int countTwo = 0;

        for(int i =0; i<=a.length-1;i++){
          
            if (a[i]==0) {
                countZero++;
                
            }
               if (a[i]==1) {
                countOne++;
                
            }
            if (a[i]==2) {
                countTwo++;
                
            }
        }

        int index = 0;

        while (countZero-- >0) {
            a[index++] = 0;
             
        }
        
        while (countOne-- >0) {
            a[index++] = 1;
             
        }
        
        while (countTwo-- >0) {
            a[index++] = 2;
             
        }

           return a;
    }

     //Third method is called Dutch National Flag Algorithm
      
     public static int[] DNFA(int[] a){
         
        int low =0;
        int mid =0;
        int high = a.length-1;

         while (mid<=high) {
            
            if (a[mid]==0) {

              int temp = a[low];
              a[low] = a[mid];
              a[mid] = temp;

                low++;
                mid++;

            }
           else if(a[mid]==1){

           mid++;
              

           }
           else {


            int temp = a[mid];
            a[mid] = a[high];
            a[high] = temp;
            
            high--;

           }  

         }
         return a;
         
     }


    public static void main(String[] args) {
        
        int[] arr = {2,1,0,2,2,1,2,0,0,2,1,2,1,0,0,2,1,0,0,1};
        
        //sortmethodDFA(arr);

        //System.out.println(Arrays.toString(CountingMethodDFA(arr)));

        System.out.println(Arrays.toString(DNFA(arr)));


        


    }
    
}

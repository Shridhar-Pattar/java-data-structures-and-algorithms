public class Minmax {
  
    public static void main(String[] args) {
        

     int[] a = {80,2,7,9,3,23,56,24,78};
     
     int smallestElement = a[0];
     int greatestElement = a[0];

     for(int i = 0; i<=a.length-1; i++){

           if(smallestElement>a[i]){
                
              smallestElement = a[i];

           }

           if(greatestElement<a[i]){

                 greatestElement = a[i];

           }

     }

     System.out.println("The smallest element is :"+ smallestElement);
     System.out.println("The greatest element is :"+ greatestElement);



    }

}

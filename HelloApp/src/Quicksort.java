public class Quicksort{

    int arr[];

    public int [] sort(int []arr){
           this.arr=arr;
           
            quicksort(0, arr.length-1);

            return arr;
    }

    public void quicksort(int start, int end){
        

        int counter=0,temp;
            
        for (int i = 0; i < end ; i++) {

             if (arr[i] < arr[end]) {

                    temp = arr[i];
                    arr[i]=arr[counter];
                    arr[counter]=temp;
                    counter++;
             }
            
        }

         temp=arr[counter];
         arr[counter]=arr[end];
         arr[end]=temp;
       
         if(start < end){
         quicksort(start, counter-1);
         quicksort(counter+1, end);
       }

      return; 
    }

    public static void main(String[] args) {
        Quicksort b = new Quicksort();

        int [] arr = {9,8,1,6,2,5};

       b.sort(arr);

       for (int i = 0; i < arr.length; i++) {
           
            System.out.print(arr[i] + " ");
       }
    }
}
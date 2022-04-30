import java.util.Scanner;

public class Linear {



    public int BinaryRecusiveFunc(int arr [], int firstitem, int lastitem, int target){


          
          
        
     
        return -1;
           
    }



//binary search function start here

    public int BinaryFunc(int arr [], int target){


        int firstitem = 0, lastitem = (arr.length) - 1;


        while(firstitem <= lastitem){

             
            int miditem = (lastitem + firstitem)/2;

            if(arr[miditem]==target){

                return miditem;
            }

            else if(arr[miditem] > target){

                      lastitem = miditem - 1;
            }

            else{

                firstitem = miditem + 1;
            }


        }
        
     
        return -1;
           
    }

//binary search function ends here



//linear search 
    public int linearFunc(int [] list, int target){


        for (int i = 0; i < list.length; i++) {

              if(list[i] == target){

                   return i;
              }
            
        }

        return -1;
    }




    public static void main(String[] args) {
        
          

        int arr []  = new int[2];

         arr[0] = 0;
         arr[1] = 1;
         arr[2] = 3;

          
        for (int i = 0; i < arr.length; i++) {
              System.out.println(arr[i]);
        }

       

    } 
}

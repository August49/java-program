import java.util.Stack;

public class SelectionSort {

    public static boolean isValid(String s) {
      
        Stack<Character> set = new Stack();
        
        
        for(int i=0; i < s.length(); i++){

            char c = s.charAt(i);
            
            
                    
                if( c == '(' || c== '[' || c =='{') set.push(c);
                    
                else if(c== ')' && !(set.isEmpty()) && set.peek()=='(') set.pop();
            
                else if(c== '}' && !(set.isEmpty()) && set.peek()=='{') set.pop();
                
                else if(c== ']' && !(set.isEmpty()) && set.peek()=='[') set.pop();
            
                
           
        
        }
        
        return set.isEmpty();
        
       
        
    }

    public static int [] selectionSort(int []arr){

       int temp;

       for (int i = 0; i < arr.length - 1; i++) {
           int min=i;

            for (int j = i+1; j < arr.length; j++) {

                if(arr[min] > arr[j]){

                   min = j;
                }
                
            }

            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
           
       }
        return arr;
    }

    public static void main(String[] args) {
        
         int [] arr =  {1,9,8,2,7,3,6,4,5};

      System.out.println(isValid("[](){}"));

        
    }
    
}

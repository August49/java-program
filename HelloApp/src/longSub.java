import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class longSub {

    public static int longestSub(String s){
        int i=0, j=0, max=0;
    HashSet<Character> set = new HashSet<>();
     
    while(i < s.length()){
    
        if(!(set.contains(s.charAt(i)))){
            set.add(s.charAt(i));
            i++;
            max = Math.max(set.size(), max);
        }
        
        else{
            set.remove(s.charAt(j));
            j++;
        }
       
    }

        
   return max; 
    }
        public static void main(String[] args) {


            int x = longestSub("abcabc");

           

            System.out.println(x);
        }
    
}
    

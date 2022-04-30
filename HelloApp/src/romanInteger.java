import java.util.HashMap;



class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> ref = new HashMap<>();
        ref.put('I', 1);
        ref.put('V', 5);
        ref.put('X', 10);
        ref.put('L', 50);
        ref.put('C', 100);
        ref.put('D', 500);
        ref.put('M', 1000);
        
        int result = ref.get(s.charAt(s.length()-1));
        for(int i = s.length()-2; i >= 0; i--) {
            if(ref.get(s.charAt(i)) < ref.get(s.charAt(i+1))){
                result-=ref.get(s.charAt(i));
            }
            else {
                result+=ref.get(s.charAt(i));
            }
        } 
        return result;
    }
}
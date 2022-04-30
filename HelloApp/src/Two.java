
class Two {

    public static int[] twoSum(int nums[],int target){
    
        int i, j, ans [] = new int[2];
        ans[0] = -1;
        ans[1] = -1;
    
       for ( i = 0; i < nums.length; i++) {
    
        for (  j = 0; j <  i; j++) {
            
    
            if((nums[i] + nums[j] == target)){
             
                ans [0] = i;
                ans [1] = j;
                  

               
            }
                
        }
           
       }
    
    return ans;
        
    }
}
    
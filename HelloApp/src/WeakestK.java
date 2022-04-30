import java.util.Arrays;

class WeakestK {
    public static int[] kWeakestRows(int[][] mat, int k) {
        
        int array [] = new int[mat.length];
        int res [] = new int[k];
        int count=0;
        for(int i=0; i < mat.length ; i++){
            
            for(int j =0;  j < mat[0].length ; j++){
                
                if(mat[i][j] == 1){
                    count++;
                }
                else break;
               
            }
            
           array[i]= count * 1000 + i;
            
          
            
        }
        
       
        
         for(int i=0; i < k; i++){
            
              res[i] = array[i] % 1000;
         }
        
    return res;}


    public static void main(String[] args) {
        int arr [][] = {{1,1,0,0,0},
        {1,1,1,1,0},
        {1,0,0,0,0},
        {1,1,0,0,0},
        {1,1,1,1,1}};

       int a [] = kWeakestRows(arr, 3);

      for (int i=0; i< a.length; i++) {
          System.out.println(a[i]);
      }


    }
}
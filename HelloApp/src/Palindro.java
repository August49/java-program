import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class Palindro {


    public static Boolean palindro(int x){
           
        Boolean nega = false;

        if(x < 0){

            nega = true;
            x*=-1;
        }

        long rev=0;
        while( x != 0){


            rev = rev * 10 + x%10;
            x/=10;
        }

        if(rev == x){

            return true;
        }

        else
           return false;
    }
    
}

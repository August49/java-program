import java.beans.Customizer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MCQ {

   
    String cname, dob;
    Scanner input = new Scanner(System.in);
    

    void read(){

        System.out.print("enter customer name: ");
        cname = input.nextLine();
      
        System.out.print("enter the date in the format dd/mm/yyyy: ");
        dob = input.nextLine();


    }

    void display(){

        System.out.println("Customer Name: " + cname);

        StringTokenizer st = new StringTokenizer(dob, "/");

        while(st.hasMoreTokens()){

            System.out.print("DOB: " + st.nextToken() + ", ");
        }


    }



    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        Random r = 


        System.out.print("enter the first operand: ");
        int a = input.nextInt();

        System.out.print("enter the second operand: ");
        int b = input.nextInt();

        try {
            System.out.println(a/b);
        } catch (Exception e) {
          System.out.println("second operand: division by zero not possible");
        }
         

    }
    
}

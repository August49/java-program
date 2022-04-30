import java.util.Scanner;


public class StackImplementation {


        final int size = 5;
        int arr[] = new int[size];
        int top = -1;


        public void Push(int item) {

               
                 if (size-1 == top){

                    System.out.println("Stack is full");

                 }

                 else{

                     top++;

                     arr[top]=item;

                     System.out.println("element pushed successfully");

                 }

                 

        }



        public void Pop() {

               
            if (!(top == -1)){

               System.out.println("Stack is empty");

            }

            else{

              

    

               

            }

            

   }



   public void display() {

       for (int i = top; i >= 0; i--) {
           System.out.print(" "+arr[i]);
       }
    

}




public static void main(String[] args) {

      
    StackImplementation obj = new StackImplementation();
    Scanner input = new Scanner(System.in);
    int choice;


    do {

        System.out.println("-----------------------------------");
        System.out.println("1.Push an item");
        System.out.println("2.Pop an item");
        System.out.println("3.Dispay items");
        System.out.println("5.press 0 to exit");
        System.out.println("selet choice");
        choice = input.nextInt();

        switch (choice) {
            case 1:
                  System.out.println("enter an item");
                  int item = input.nextInt();
                  obj.Push(item); 
                break;
            case 2:
                obj.Pop(); 
              break;

            case 3:
                 obj.display();
            default:
                break;
        }
        
    } while (choice != 0);


    input.close();
    
}







        
    
}

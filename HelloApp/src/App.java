import java.util.*;
public class App{

       int data;

App(){
       this(1);
}

App(int data){

       this.data = data;
}
    


public static void main(String[] args) {
      

        App o = new App(2);

        System.out.println(o.data);
    
}


   
}




// Collection<Employer1> data = new ArrayList<Employer1>();
// Scanner input = new Scanner(System.in);
// Scanner input2 = new Scanner(System.in);
// int choice;
// Boolean found =false;


// do {

// System.out.println("-----------------------------------");
// System.out.println("1.New Employer Registration");
// System.out.println("2.Employees-list");
// System.out.println("3.Search Data");
// System.out.println("4.Delete data");
// System.out.println("5.press 0 to exit");
// System.out.println("selet choice");
// choice = input.nextInt();


// switch (choice) {
//     case 1:

//          System.out.println("-----------------------------------");
//          System.out.println("Enter registration details");
//          System.out.print("full names: ");
//          String name = input2.nextLine();

//          System.out.print("ID Number: ");
//          long EmployeeID = input.nextInt();

//          System.out.print("Phone number: ");
//          String phoneNumber = input2.nextLine();
         
//          System.out.print("Estimated salary: ");
//          double salary =input.nextDouble();

//          data.add(new Employer1(name, EmployeeID, salary, phoneNumber));
//          System.out.println("-----------------------------------");
//         break;

//     case 2:
    
//         System.out.println("-----------------------------------");
//         Iterator<Employer1> i = data.iterator();
         
//          while(i.hasNext()){
          
//              Employer1 e = i.next();

//              System.out.println(e);
        
//          }
//          System.out.println("-----------------------------------");
//          break;

//     case 3:
//        System.out.println("-----------------------------------");
      

//        System.out.println("enter search item: ");
//        int search = input2.nextInt();
//        System.out.println("-----------------------------------");
//        i = data.iterator();

//        while(i.hasNext()){

//           Employer1 e = i.next();

//           if(e.getSalary() >= search){

//                System.out.println(e.getName()+ " "+ e.getSalary() + " " + e.getEmployeeID());
//                found=true;
//           }

          
//        }

//        if(!found){
//         System.out.println("Search not found");
//     }

//        System.out.println("-----------------------------------");
    
//     case 4:
//     System.out.println("-----------------------------------");

//     System.out.println("enter delete item: ");
//     int delete = input2.nextInt();
//     System.out.println("-----------------------------------");
//     i = data.iterator();

//     while(i.hasNext()){

//        Employer1 e = i.next();

//        if(e.getEmployeeID() >= delete){

//             i.remove();
//             found=true;
//        }

       
//     }

//     if(!found){
//      System.out.println("item not found");
//  }

//  else{
//      System.out.println("item deleted successfully");
//  }

//     System.out.println("-----------------------------------");


//     default:
//         break;
// }

   
// } while (choice != 0);






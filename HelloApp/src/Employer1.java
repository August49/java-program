public class Employer1 {

   private String name;
   private long employeeID;
   private double salary;
   private String phoneNumber;
   
   public Employer1(String name, long employeeID, double salary, String phoneNumber) {
    this.name = name;
    this.employeeID = employeeID;
    this.salary = salary;
    this.phoneNumber = phoneNumber;
}



public String getName() {
    return name;
}

public long getEmployeeID() {
    return employeeID;
}

public double getSalary() {
    return salary;
}

public String getPhoneNumber() {
    return phoneNumber;
}



@Override
public String toString() {
    return (name + " " + employeeID + " " + salary + " " + phoneNumber);

}

   
    
}

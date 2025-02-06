package task1_4;

import java.util.Scanner;


public class Main {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

    
     System.out.print("Enter Employee Name: ");
     String name = scanner.nextLine();

     System.out.print("Enter Employee Age: ");
     int age = scanner.nextInt();
     scanner.nextLine(); 

     System.out.print("Enter Employee ID: ");
     String employeeID = scanner.nextLine();

     System.out.print("Enter Employee Salary: ");
     double salary = scanner.nextDouble();

     // Creating an Employee object
     Employee employee = new Employee(name, age, employeeID, salary);

     // Display Person details
     employee.displayPerson();

     // Display Employee-specific details
     employee.displayEmployee();

    
 }
}

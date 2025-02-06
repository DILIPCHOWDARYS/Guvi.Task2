package task1_1;

import java.util.Scanner;

public class PersonMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter name:");
        String name = scanner.nextLine();

        System.out.print("Enter age (or press Enter to use default 18): ");
        String ageInput = scanner.nextLine().trim(); // Trim to avoid extra spaces
        Person person;
        if (ageInput.isEmpty()) {
            person = new Person(name); // Default age 18
        } else {
            int age = Integer.parseInt(ageInput); // Convert to integer
            person = new Person(name, age); // Custom age
        }

        // Displaying details
        person.display();

        scanner.close();
    }
}

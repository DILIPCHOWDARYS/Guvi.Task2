package task1_3;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter initial balance: ");
        String balanceInput = scanner.nextLine();

        Account account;
        
        
        if (balanceInput.isEmpty()) {
            account = new Account(); // default balance of 0
        } else {
            account = new Account(Double.parseDouble(balanceInput)); // user input balance
        }

        System.out.print("Enter deposit amount: ");
        account.deposit(scanner.nextDouble());

        System.out.print("Enter withdrawal amount: ");
        account.withdraw(scanner.nextDouble());

        account.displayBalance();
        scanner.close();
    }
}



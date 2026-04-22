import java.util.Scanner;
class BankAccount{
    double balance;
// A1: Constructor here
    BankAccount(double balance) {
        this.balance = balance;
        // Class field
    }
    void withdraw(double amount) {
        if (amount <= balance) {
           balance = balance - amount;
            System.out.println("Withdrew $" + amount + "Balance = $" + balance);
    }
        else {
            System.out.println("Not enough funds!");
        }

    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting balance: ");
        double startingBalance = sc.nextDouble();

        BankAccount account = new BankAccount(startingBalance);

        System.out.print("Enter amount to withdraw (0 to exit): ");
        double amount = sc.nextDouble();

        while (amount != 0) {
            account.withdraw(amount);  // call withdraw loop
            System.out.print("Enter amount to withdraw (0 to exit): ");
            amount = sc.nextDouble();
        }
        System.out.println("Goodbye!");

    }
}
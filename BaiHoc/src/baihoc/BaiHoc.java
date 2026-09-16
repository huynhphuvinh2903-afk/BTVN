
package baihoc;
import java.util.Scanner;

class BankAccount {
    private String accountName;
    private double balance;

    public BankAccount(String accountName, double balance) {
        this.accountName = accountName;
        this.balance = balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
        }
    }

    public void displayInfo() {
        System.out.println("Account Name: " + this.accountName);
        if (this.balance == (long) this.balance) {
            System.out.println("Balance: " + (long) this.balance);
        } else {
            System.out.println("Balance: " + this.balance);
        }
    }
}
public class BaiHoc {

    
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextLine()) return;
        String name = scanner.nextLine().trim();

        if (!scanner.hasNextDouble()) return;
        double initialBalance = scanner.nextDouble();

        BankAccount account = new BankAccount(name, initialBalance);

        while (scanner.hasNext()) {
            String command = scanner.next();
            if (command.equalsIgnoreCase("deposit")) {
                double amount = scanner.nextDouble();
                account.deposit(amount);
            } else if (command.equalsIgnoreCase("withdraw")) {
                double amount = scanner.nextDouble();
                account.withdraw(amount);
            } else if (command.equalsIgnoreCase("display")) {
                account.displayInfo();
            }
        }

        scanner.close();
    }
    
}

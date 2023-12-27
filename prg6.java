import java.util.Scanner;

class Bank {
    String name;
    long accountNumber;
    double balance;

    void readDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        this.name = scanner.nextLine();
        System.out.println("Enter account number: ");
        this.accountNumber = scanner.nextLong();
        System.out.println("Enter balance: ");
        this.balance = scanner.nextDouble();
    }

    void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Balance: " + this.balance);
    }

    void calculateInterest() {

    };
}

class CityBank extends Bank {
    @Override
    void calculateInterest() {
        double rate = 8.5; // Specific interest rate for City Bank
        double interest = (balance * rate) / 100;
        System.out.println("Interest earned at City Bank: " + interest);
    }
}

class SBIBank extends Bank {
    @Override
    void calculateInterest() {
        double rate = 7.5; // Specific interest rate for SBI Bank
        double interest = (balance * rate) / 100;
        System.out.println("Interest earned at SBI Bank: " + interest);
    }
}

class CanaraBank extends Bank {
    @Override
    void calculateInterest() {
        double rate = 6.5; // Specific interest rate for Canara Bank
        double interest = (balance * rate) / 100;
        System.out.println("Interest earned at Canara Bank: " + interest);
    }
}

public class prg6 {
    public static void main(String[] args) {
        Bank cityBank = new CityBank();
        Bank sbiBank = new SBIBank();
        Bank canaraBank = new CanaraBank();

        System.out.println("Enter City Bank details:");
        cityBank.readDetails();
        cityBank.displayDetails();
        cityBank.calculateInterest();

        System.out.println("\nEnter SBI Bank details:");
        sbiBank.readDetails();
        sbiBank.displayDetails();
        sbiBank.calculateInterest();

        System.out.println("\nEnter Canara Bank details:");
        canaraBank.readDetails();
        canaraBank.displayDetails();
        canaraBank.calculateInterest();
    }
}

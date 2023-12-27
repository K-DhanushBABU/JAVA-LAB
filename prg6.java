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
        System.out.println("Account Number" + this.accountNumber);
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
        SBIBank[] sbi = new SBIBank[2];
        CityBank[] citi = new CityBank[2];
        CanaraBank[] canara = new CanaraBank[2];

        System.out.println("Enter SBI Bank details:");
        for (int i = 0; i < 2; i++) {
            sbi[i] = new SBIBank();
            System.out.println("Account:" + (i + 1));
            sbi[i].readDetails();
            sbi[i].displayDetails();
            sbi[i].calculateInterest();

        }

        System.out.println("\nEnter canara Bank details:");
        for (int i = 0; i < 2; i++) {
            canara[i] = new CanaraBank();
            System.out.println("Account:" + (i + 1));
            canara[i].readDetails();
            canara[i].displayDetails();
            canara[i].calculateInterest();

        }

        System.out.println("\nEnter Canara Bank details:");
        for (int i = 0; i < 2; i++) {
            citi[i] = new CityBank();
            System.out.println("Account:" + (i + 1));
            citi[i].readDetails();
            citi[i].displayDetails();
            citi[i].calculateInterest();

        }
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = input.nextLine();

        System.out.print("Enter deposit amount: ");
        int deposit = input.nextInt();

        System.out.print("Enter interest rate: ");
        double rate = input.nextDouble();

        CustomerSavingsInterest customer =
                new CustomerSavingsInterest(name, deposit, rate);

        SavingsInterest savings = new SavingsInterest();

        double interest = savings.calculateInterest(
                customer.deposit, customer.interestRate
        );

        double convertedDeposit = savings.convertDeposit(deposit);

        int truncatedInterest = savings.convertInterest(interest);

        long roundedInterest = savings.roundInterest(interest);

        System.out.println("\n===== SAVINGS INTEREST REPORT =====");

        System.out.println("Customer Name: " + name);

        System.out.println("Original Deposit: " + deposit);

        System.out.println("Converted Deposit: " + convertedDeposit);

        System.out.println("Interest Rate: " + rate + "%");

        System.out.println("Calculated Interest: " + interest);

        System.out.println("Interest After Manual Conversion: " + truncatedInterest);

        System.out.println("Rounded Interest: " + roundedInterest);

        System.out.println("Total Deposit: " + deposit);

        System.out.println("Total Interest: " + roundedInterest);

        System.out.println("Total Savings: " + (deposit + roundedInterest));

        input.close();
    }
}
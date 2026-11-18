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

    }
}
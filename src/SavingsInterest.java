public class SavingsInterest {

    public double calculateInterest(int deposit, double rate) {

        return deposit * (rate / 100);
    }

    public long roundInterest(double interest) {

        return Math.round(interest);
    }
    public double convertDeposit(int deposit) {

        double convertedDeposit = deposit;

        return convertedDeposit;
    }
    public int convertInterest(double interest) {

        int convertedInterest = (int) interest;

        return convertedInterest;
    }

}
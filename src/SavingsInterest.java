public class SavingsInterest {

    public double calculateInterest(int deposit, double rate) {

        return deposit * (rate / 100);
    }

    public long roundInterest(double interest) {

        return Math.round(interest);
    }

}
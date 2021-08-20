public class Main {

    static Loan[] loans = new Loan[100];

    static int loansCount = 0;

    public static void addLoan(String borrower, int amount, double interestRate) {
        borrowers[loansCount] = borrower;
        amounts[loansCount] = amount;
        interestRates[loansCount] = interestRate;
        loansCount++;
    }

    public static void setAsPaid(String borrower) {
        for (int i = 0; i < loansCount; i++) {
            if (loans[i].getBorrower().equals(borrower)) {
                loans[i].setPaid();
            }
        }
    }

    public static void listLoans() {
        for (int i = 0; i < loansCount; i++) {
            if (!isPaid[i]) {
                System.out.println(borrowers[i] + ": " + amounts[i]);
            }
        }
    }

    public static double calculateProfitEarned() {
        double profit = 0;
        for (int i = 0; i < loansCount; i++) {
            // if the loan was repaid, add the interest to profit
            if (isPaid[i]) {
                profit = profit + (amounts[i] * interestRates[i]);
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        addLoan("Alice Betsy", 10, 0.1);
        addLoan("Ben Chee", 20, 0.2);
        addLoan("Chris Davis", 30, 0.3);
        setAsPaid("Ben Chee");
        listLoans();
        System.out.println("profit: " + calculateProfitEarned());
    }
}

public class Loanable {
    private boolean loanable;
    private int daysLoanable;

    public Loanable(boolean loanable, int daysLoanable) {
        this.loanable = loanable;
        this.daysLoanable = daysLoanable;
    }

    @Override
    public String toString() {
        if (this.loanable) {
            return this.loanable + ", can be loaned for " + this.daysLoanable + ". Please return by or before then.";
        } else {
            return this.loanable + ", can not be loaned.";
        }

    }

}
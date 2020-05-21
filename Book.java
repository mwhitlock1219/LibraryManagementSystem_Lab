public class Book extends LibraryItem implements Loanable {
    private int numOfPages;
    private boolean canBeLoaned;

    public Book(String author, String title, String genre, int yearReleased, int numOfPages, boolean canBeLoaned) {
        super(author, title, genre, yearReleased);
        this.numOfPages = numOfPages;
        this.canBeLoaned = canBeLoaned;
    }

    // Getters
    public int getNumOfPages() {
        return this.numOfPages;
    }

    public boolean getCanBeLoaned() {
        return this.canBeLoaned;
    }

    // Setters
    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public void setCanBeLoaned(boolean canBeLoaned) {
        this.canBeLoaned = canBeLoaned;
    }

    @Override
    // loanable abstract methods
    public void lateCharge(int charge) {
        int lateCharges;
        lateCharges = charge; // * daysOverDue; // fix later by calculating late charge
    };

    public boolean isLoanable(boolean canBeLoaned) {
        if (this.canBeLoaned) {
            return true;
        } else {
            return false;
        }
    }
}
public class Book extends LibraryItem {
    private int numOfPages;

    public Book(String author, String title, String genre, int yearReleased, boolean loanable, int daysLoanable,
            double lateCharges, boolean reservable, int daysReservable, int numOfPages) {
        super(author, title, genre, yearReleased, loanable, daysLoanable, lateCharges, reservable, daysReservable);
        this.numOfPages = numOfPages;

    }

    // Getters
    public int getNumOfPages() {
        return this.numOfPages;
    }

    // Setters
    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

}
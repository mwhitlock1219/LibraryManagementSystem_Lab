public class GeneralBook extends Book {
    public GeneralBook(String author, String title, String genre, String publisher, int yearReleased, boolean loanable,
            int daysLoanable, double lateCharges, boolean reservable, int daysReservable, int numOfPages) {
        super(author, title, genre, publisher, yearReleased, loanable, daysLoanable, lateCharges, reservable,
                daysReservable, numOfPages);
    }
}
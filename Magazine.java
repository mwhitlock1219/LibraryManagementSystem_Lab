public class Magazine extends Periodical {
    private String monthReleased;

    public Magazine(String author, String title, String genre, String publisher, int yearReleased, boolean loanable,
            int daysLoanable, double lateCharges, boolean reservable, int daysReservable, String monthReleased,
            IssueRelease issueReleased) {
        super(author, title, genre, publisher, yearReleased, loanable, daysLoanable, lateCharges, reservable,
                daysReservable, issueReleased);
        this.monthReleased = monthReleased;
    }

    // Getters
    public String getMonthReleased() {
        return monthReleased;
    }

    // Setters
    public void setMonthReleased(String monthReleased) {
        this.monthReleased = monthReleased;
    }
}
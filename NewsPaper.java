public class NewsPaper extends Periodical {
    private String dayReleased;

    public NewsPaper(String author, String title, String genre, String publisher, int yearReleased, boolean loanable,
            int daysLoanable, double lateCharges, boolean reservable, int daysReservable, String dayReleased,
            IssueRelease issueReleased) {
        super(author, title, genre, publisher, yearReleased, loanable, daysLoanable, lateCharges, reservable,
                daysReservable, issueReleased);
        this.dayReleased = dayReleased;
    }

    // Getters
    public String getDayReleased() {
        return dayReleased;
    }

    // Setters
    public void setDayReleased(String dayReleased) {
        this.dayReleased = dayReleased;
    }
}
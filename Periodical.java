public class Periodical extends LibraryItem {

    private IssueRelease issueReleased;

    public Periodical(String author, String title, String genre, String publisher, int yearReleased, boolean loanable,
            int daysLoanable, double lateCharges, boolean reservable, int daysReservable, IssueRelease issueReleased) {
        super(author, title, genre, publisher, yearReleased, loanable, daysLoanable, lateCharges, reservable,
                daysReservable);

        this.issueReleased = issueReleased;
    }

    // Getters
    public IssueRelease getIssueReleased() {
        return issueReleased = issueReleased;
    }

    // Setters
    public void setIssueReleased(IssueRelease issueReleased) {
        this.issueReleased = issueReleased;
    }

}
public class Periodical extends LibraryItem implements Reservable {

    private IssueRelease issueReleased;
    private boolean canBeReserved;

    public Periodical(String author, String title, String genre, int yearReleased, IssueRelease issueReleased,
            boolean canBeReserved) {
        super(author, title, genre, yearReleased);

        this.issueReleased = issueReleased;
        this.canBeReserved = canBeReserved;
    }

    // Getters
    public IssueRelease getIssueReleased() {
        return issueReleased = issueReleased;
    }

    public boolean getCanBeReserved() {
        return canBeReserved;
    }

    // Setters
    public void setIssueReleased(IssueRelease issueReleased) {
        this.issueReleased = issueReleased;
    }

    public void setCanBeReserved(boolean canBeReserved) {
        this.canBeReserved = canBeReserved;
    }

    @Override
    public boolean isReservable(boolean canBeReserved) {
        if (this.canBeReserved) {
            return true;
        } else {
            return false;
        }
    }

    public void printIssueRelease() {
        String released = "NOT RELEASED";
        switch (this.issueReleased) {
            case DAILY:
                released = "Released Daily";
                break;
            case WEEKLY:
                released = "Released Weekly";
                break;
            case BIWEEKLY:
                released = "Released Bi-Weekly";
                break;
            case MONTHLY:
                released = "Released Monthly";
                break;
            case ANNUALLY:
                released = "Released Annually";
                break;
        }
    }

}
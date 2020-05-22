public class Periodical extends LibraryItem implements Reservable {
    private PublishingCompany publisher;
    private IssueRelease issueReleased;
    private boolean canBeReserved;

    public Periodical(String title, IssueRelease issueReleased, PublishingCompany publisher, boolean canBeReserved) {
        super(title);

        this.issueReleased = issueReleased;
        this.canBeReserved = canBeReserved;
        this.publisher = publisher;

    }

    // Getting and Setting PublishingCompany publish
    public PublishingCompany getPublisher() {
        return publisher;
    }

    public void setPublisher(PublishingCompany publisher) {
        this.publisher = publisher;
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
                released = "released Daily";
                break;
            case WEEKLY:
                released = "released Weekly";
                break;
            case BIWEEKLY:
                released = "released Bi-Weekly";
                break;
            case MONTHLY:
                released = "released Monthly";
                break;
            case ANNUALLY:
                released = "released Annually";
                break;
        }
    }
}
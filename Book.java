public class Book extends LibraryItem implements Loanable {
    private Author authorName;
    private int numOfPages;
    private boolean canBeLoaned;

    public Book(String title, Author authorName, int numOfPages, boolean canBeLoaned) {
        super(title);
        this.numOfPages = numOfPages;
        this.canBeLoaned = canBeLoaned;
        this.authorName = authorName;
    }

    // Getting and Setting Author author
    public Author getAuthorName() {
        return authorName;
    }

    public void setAuthorName(Author authorName) {
        this.authorName = authorName;
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
    // Implementing loanable abstract methods
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

    // public class Author {
    // private String authorName;

    // public Author() {
    // this.authorName = null;
    // }

    // public Author(String authorName) {
    // this.authorName = authorName;
    // }

    // public String getAuthorName() {
    // return authorName;
    // }
    // }

    // public Author author;
}
public class LibraryItem implements Loanable, Reservable {
    // Abstraction of Properties
    private String author, title, genre, publisher;
    private int yearReleased, daysLoanable, daysReservable;
    private boolean loanable, reservable;
    private double lateCharges;

    // Constructor (properties)
    public LibraryItem(String author, String title, String genre, String publisher, int yearReleased, boolean loanable,
            int daysLoanable, double lateCharges, boolean reservable, int daysReservable) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.yearReleased = yearReleased;
        this.loanable = loanable;
        this.daysLoanable = daysLoanable;
        this.lateCharges = lateCharges;
        this.reservable = reservable;
        this.daysReservable = daysReservable;
        this.publisher = publisher;
    }

    // Getters - use keyword return
    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public boolean getLoanable() {
        return loanable;
    }

    public int getDaysLoanable() {
        return daysLoanable;
    }

    public double getlateCharges() {
        return lateCharges;
    }

    public boolean getReservable() {
        return reservable;
    }

    public int getDaysReservable() {
        return daysReservable;
    }

    public String getPublisher() {
        return publisher;
    }

    // Setters - use keyword this
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }

    public void setLoanable(boolean loanable) {
        this.loanable = loanable;
    }

    public void setDaysLoanable(int daysLoanable) {
        this.daysLoanable = daysLoanable;
    }

    public void setlateCharges(double lateCharges) {
        this.lateCharges = lateCharges;
    }

    public void setReservable(boolean reservable) {
        this.reservable = reservable;
    }

    public void setDaysReservable(int daysReservable) {
        this.daysReservable = daysReservable;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    // loanable abstract methods
    public void lateCharge(int charge) {
        lateCharges = charge; // fix later by calculating late charge
    };

    public boolean isLoanable(boolean loanable) {
        if (this.loanable) {
            return this.loanable + ", can be loaned for " + this.daysLoanable + "days.";
        } else {
            return this.loanable + ", can not be loaned.";
        }
    }

    public boolean isReservable(boolean reservable) {
        if (this.reservable) {
            return this.title + " can be reserved for " + this.daysLoanable + "days.";
        } else {
            return this.title + " can not be reserved.";
        }
    }

    @Override
    public String toString() {
        return this.getTitle() + " by " + this.getAuthor() + " was released in " + this.getYearReleased();
    }

}
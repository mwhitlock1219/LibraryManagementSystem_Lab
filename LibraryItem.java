public class LibraryItem implements Loanable, Reservable {
    // Abstraction of Properties
    private String author;
    private String title;
    private String genre;
    private int yearReleased;
    private boolean loanable;
    private int daysLoanable;
    private double lateCharges;
    private boolean reservable;
    private int daysReservable;

    // Constructor (properties)
    public LibraryItem(String author, String title, String genre, int yearReleased, boolean loanable, int daysLoanable,
            double lateCharges, boolean reservable, int daysReservable) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.yearReleased = yearReleased;
        this.loanable = loanable;
        this.daysLoanable = daysLoanable;
        this.lateCharges = lateCharges;
        this.reservable = reservable;
        this.daysReservable = daysReservable;
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

    // loanable abstract method
    public void lateCharge(int charge) {
        lateCharges = charge; // fix later by calculating late charge
    };

    @Override
    public String toString() {
        return this.getTitle() + " by " + this.getAuthor() + " was released in " + this.getYearReleased();
    }

}
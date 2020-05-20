public class Magazine extends Periodical {
    private String monthReleased;

    public Magazine(String author, String title, String genre, int yearReleased, boolean loanable, int daysLoanable,
            double lateCharges, boolean reservable, int daysReservable, String monthReleased) {
        super(author, title, genre, yearReleased, loanable, daysLoanable, lateCharges, reservable, daysReservable);
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
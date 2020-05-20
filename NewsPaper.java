public class NewsPaper extends Periodical {
    private String dayReleased;

    public NewsPaper(String author, String title, String genre, int yearReleased, boolean loanable, int daysLoanable,
            double lateCharges, boolean reservable, int daysReservable, String dayReleased) {
        super(author, title, genre, yearReleased, loanable, daysLoanable, lateCharges, reservable, daysReservable);
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
public class Magazine extends Periodical {
    private String monthReleased;

    public Magazine(String author, String title, String genre, String indexLocation, int yearReleased,
            String monthReleased) {
        super(author, title, genre, indexLocation, yearReleased);
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
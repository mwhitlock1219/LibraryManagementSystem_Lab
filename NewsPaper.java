public class NewsPaper extends Periodical {
    private String dayReleased;

    public NewsPaper(String author, String title, String genre, String indexLocation, int yearReleased,
            String dayReleased) {
        super(author, title, genre, indexLocation, yearReleased);
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
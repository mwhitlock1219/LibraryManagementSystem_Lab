public class LibraryItem {
    // Abstraction of Properties
    private String author, title, genre;
    private int yearReleased;

    // Constructor (properties)
    public LibraryItem(String author, String title, String genre, int yearReleased) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.yearReleased = yearReleased;
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

    @Override
    public String toString() {
        return this.getTitle() + " by " + this.getAuthor() + " was released in " + this.getYearReleased();
    }

}
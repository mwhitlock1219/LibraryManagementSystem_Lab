public class LibraryItem {
    // Abstraction of Properties
    private String author;
    private String title;
    private String genre;
    private String indexLocation;
    private int yearReleased;

    // Constructor (properties){
    // referring to properties using this
    // }
    public LibraryItem(String author, String title, String genre, String indexLocation, int yearReleased) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.indexLocation = indexLocation;
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

    public String getIndexLocation() {
        return indexLocation;
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

    public void setIndexLocation(String indexLocation) {
        this.indexLocation = indexLocation;
    }

    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }

}
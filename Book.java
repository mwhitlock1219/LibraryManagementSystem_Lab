public class Book extends LibraryItem {
    private int numOfPages;

    public Book(String author, String title, String genre, String indexLocation, int yearReleased, int numOfPages) {
        super(author, title, genre, indexLocation, yearReleased);
        this.numOfPages = numOfPages;

    }

    // Getters
    public int getNumOfPages() {
        return this.numOfPages;
    }

    // Setters
    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

}
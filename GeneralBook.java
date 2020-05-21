public class GeneralBook extends Book {
    public GeneralBook(String author, String title, String genre, int yearReleased, int numOfPages,
            boolean canBeLoaned) {
        super(author, title, genre, yearReleased, numOfPages, canBeLoaned);
    }

    public boolean hasAuthor(Author x) {
        if (x != null) {
            return true;
        } else {
            return false;
        }
    }
}
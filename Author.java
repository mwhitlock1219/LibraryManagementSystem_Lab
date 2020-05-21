public class Author {
    String authorName;

    public Author() {
        this.authorName = "Author Name";
    }

    public Author(String authorName) {
        this.authorName = authorName;
    }

    // Getter
    public String getAuthorName() {
        return authorName;
    }

    // Setters
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
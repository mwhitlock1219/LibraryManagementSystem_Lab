public class LibraryItem {
    // Abstraction of Properties
    protected String title;

    // Constructor (properties)
    public LibraryItem(String title) {
        this.title = title;
    }

    // Getters - use keyword return
    public String getTitle() {
        return title;
    }

    // Setters - use keyword this
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return this.getTitle();
    }

}
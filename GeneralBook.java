import java.util.List;

public class GeneralBook extends Book {
    private GenreType genre;

    public GeneralBook(String title, Author authorName, int numOfPages, GenreType genre, boolean canBeLoaned) {
        super(title, authorName, numOfPages, canBeLoaned);
        this.genre = genre;
    }

    // Getter
    public GenreType getGenre() {
        return genre;
    }

    // Setter
    public void setGenre(GenreType genre) {
        this.genre = genre;
    }

    public void printGenre() {
        String type = "UNKNOWN";
        switch (this.genre) {
            case FICTION:
                type = "FICTION";
                break;
            case NONFICTION:
                type = "NON-FICTION";
                break;
            case THRILLLER:
                type = "THRILLER";
                break;
            case MYSTERY:
                type = "MYSTERY";
                break;
            case ROMANCE:
                type = "ROMANCE";
                break;
            case AUTOBIOGRAPHY:
                type = "AUTOBIOGRAPHY";
                break;
            case FANTASY:
                type = "FANSTASY";
                break;
            case SCIENCEFICTION:
                type = "SCIENCE FICTION";
                break;
            default:
                break;
        }
    }

    public static void display(List<GeneralBook> gbooks) {
        for (GeneralBook g : gbooks) {
            System.out.println(g.toString() + " is a book");
        }

    }
}
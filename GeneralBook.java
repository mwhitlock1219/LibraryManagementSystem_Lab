import java.util.List;

public class GeneralBook extends Book {
    public GeneralBook(String title, Author authorName, int numOfPages, boolean canBeLoaned) {
        super(title, authorName, numOfPages, canBeLoaned);
    }

    public static void display(List<GeneralBook> gbooks) {
        for (GeneralBook g : gbooks) {
            System.out.println(g.toString() + " is a book");
        }

    }
}
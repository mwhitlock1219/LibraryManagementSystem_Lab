import java.util.List;

public class ReferenceBook extends Book {
    public ReferenceBook(String title, Author authorName, int numOfPages, boolean canBeLoaned) {
        super(title, authorName, numOfPages, canBeLoaned);
    }

    public static void display(List<ReferenceBook> rbooks) {
        for (ReferenceBook r : rbooks) {
            System.out.println(r.toString() + " is a reference book");
        }

    }
}
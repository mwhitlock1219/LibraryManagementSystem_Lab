import java.util.ArrayList;
import java.util.List;

public class Library {
    public static void main(String[] args) {
        Author newAuthor = new Author("Sarah Lee");
        System.out.println(newAuthor.getAuthorName());

        PublishingCompany newPublisher = new PublishingCompany("Sesame St");
        System.out.println(newPublisher.getPublisher());

        // // Instantiate new Object for each LibraryItem
        // GeneralBook gb = new GeneralBook("title1", newAuthor, 100, true);
        // GeneralBook gb2 = new GeneralBook("title1", newAuthor, 100, true);
        // ReferenceBook rb = new ReferenceBook("Title2", newAuthor, 200, true);
        // NewsPaper np = new NewsPaper("title3", IssueRelease.DAILY, newPublisher,
        // true);
        // Magazine mg = new Magazine("title4", IssueRelease.MONTHLY, newPublisher,
        // true);

        // Using Factory Design
        LibraryItem gb = LibraryItemFactory.CreateLibraryItem(LibraryItemType.GENERALBOOK);
        LibraryItem rb = LibraryItemFactory.CreateLibraryItem(LibraryItemType.REFERENCEBOOK);
        LibraryItem np = LibraryItemFactory.CreateLibraryItem(LibraryItemType.NEWSPAPER);
        LibraryItem mg = LibraryItemFactory.CreateLibraryItem(LibraryItemType.MAGAZINE);

        List<GeneralBook> gbooks = new ArrayList<>();
        List<ReferenceBook> rbooks = new ArrayList<>();
        List<NewsPaper> news = new ArrayList<>();
        List<Magazine> mags = new ArrayList<>();
        gbooks.add((GeneralBook) gb);
        rbooks.add((ReferenceBook) rb);
        news.add((NewsPaper) np);
        mags.add((Magazine) mg);

        GeneralBook.display(gbooks);
        ReferenceBook.display(rbooks);
        NewsPaper.display(news);
        Magazine.display(mags);
    }
}

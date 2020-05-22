//Depending on the type of Library Item given it will create a new instance of that item

public class LibraryItemFactory {
    public static LibraryItem CreateLibraryItem(LibraryItemType type) {
        LibraryItem d = null;
        Author newAuthor = new Author("Sarah Lee");
        PublishingCompany newPublisher = new PublishingCompany("Sesame St");

        if (type == null) {
            return null;
        }
        switch (type) {
            case GENERALBOOK:
                d = new GeneralBook("Free Time", newAuthor, 10, GenreType.FANTASY, true);
                break;
            case REFERENCEBOOK:
                d = new ReferenceBook("Java for Dummies", newAuthor, 100, true);
                break;
            case NEWSPAPER:
                d = new NewsPaper("New York Times", IssueRelease.DAILY, newPublisher, true);
                break;
            case MAGAZINE:
                d = new Magazine("Better Homes & Gardens", IssueRelease.MONTHLY, newPublisher, true);
                break;
            default:
        }

        return d;
    }
}
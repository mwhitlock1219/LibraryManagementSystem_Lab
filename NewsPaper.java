import java.util.List;

public class NewsPaper extends Periodical {

    public NewsPaper(String title, IssueRelease issueReleased, PublishingCompany publisher, boolean canBeReserved) {
        super(title, issueReleased, publisher, canBeReserved);
    }

    public static void display(List<NewsPaper> news) {
        for (NewsPaper n : news) {
            System.out.println(n.toString() + " is a newspaper");
        }

    }
}
import java.util.List;

public class Magazine extends Periodical {

    public Magazine(String title, IssueRelease issueReleased, PublishingCompany publisher, boolean canBeReserved) {
        super(title, issueReleased, publisher, canBeReserved);
    }

    public static void display(List<Magazine> mags) {
        for (Magazine m : mags) {
            System.out.println(m.toString() + " is a magazine.");
        }

    }
}
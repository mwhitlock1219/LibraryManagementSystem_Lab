import java.sql.Date;
import java.text.DateFormat;
import java.time.LocalDate;

public class OverdueList<E extends Book> {
    private E overDueItem;

    public OverdueList(E overDueItem) {
        this.overDueItem = overDueItem;
    }

    // Getter
    public E getOverdueItem() {
        return this.overDueItem;
    }

}
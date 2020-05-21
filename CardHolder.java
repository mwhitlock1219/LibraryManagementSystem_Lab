import java.util.ArrayList;
import java.util.List;

public class CardHolder {
    private String name;
    private boolean canCheckout;
    private boolean canReserve;
    private List<String> loanedOverdue;
    private ArrayList<Periodical> reservedOverdue;

    public CardHolder(String name, boolean canCheckout, boolean canReserve) {
        this.name = name;
        this.canCheckout = canCheckout;
        this.canReserve = canReserve;
    }

    // Getters
    public String getName() {
        return name;
    }

    public boolean getCanCheckout() {
        return canCheckout;
    }

    public boolean getCanReserve() {
        return canReserve;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCanCheckout(boolean canCheckout) {
        this.canCheckout = canCheckout;
    }

    public void setCanReserve(boolean canReserve) {
        this.canReserve = canReserve;
    }

}
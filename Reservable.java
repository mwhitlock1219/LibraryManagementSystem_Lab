public class Reservable {
    private boolean reservable;
    private int daysReservable;

    public Reservable(boolean reservable, int daysReservable) {
        this.reservable = reservable;
        this.daysReservable = daysReservable;
    }

    @Override
    public String toString() {
        if (this.reservable) {
            return this.reservable + ", can be loaned for " + this.daysReservable
                    + ". Please return by or before then.";
        } else {
            return this.reservable + ", can not be loaned.";
        }

    }
}

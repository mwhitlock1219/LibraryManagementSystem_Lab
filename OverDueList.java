public class OverDueList<E extends Book> {
    private E overDueItem;

    public OverDueList(E overDueItem) {
        this.overDueItem = overDueItem;
    }

    public E getOverDueItem() {
        return this.overDueItem;
    }

}
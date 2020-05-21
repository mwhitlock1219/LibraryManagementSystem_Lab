public class OverdueList<E extends Book> {
    private E overDueItem;

    public OverdueList(E overDueItem) {
        this.overDueItem = overDueItem;
    }

    public E getOverdueItem() {
        return this.overDueItem;
    }

}
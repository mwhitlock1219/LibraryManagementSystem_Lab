public class CardHolder {
    private String firstName;
    private String lastName;
    private int age;
    private int yearJoined;
    private boolean canCheckout;
    private boolean canReserve;

    public CardHolder(String firstName, String lastName, int age, int yearJoined, boolean canCheckout,
            boolean canReserve) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.yearJoined = yearJoined;
        this.canCheckout = canCheckout;
        this.canReserve = canReserve;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getYearJoined() {
        return yearJoined;
    }

    public boolean getCanCheckout() {
        return canCheckout;
    }

    public boolean getCanReserve() {
        return canReserve;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setYearJoined(int yearJoined) {
        this.yearJoined = yearJoined;
    }

    public void setCanCheckout(boolean canCheckout) {
        this.canCheckout = canCheckout;
    }

    public void setCanReserve(boolean canReserve) {
        this.canReserve = canReserve;
    }

}
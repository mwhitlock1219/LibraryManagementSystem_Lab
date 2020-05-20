public class CardHolder {
    private String firstName;
    private String lastName;
    private int yearJoined;
    private String checkout;
    private String reserve;

    public CardHolder(String firstName, String lastName, int yearJoined, String checkout, String reserve) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearJoined = yearJoined;
        this.checkout = checkout;
        this.reserve = reserve;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYearJoined() {
        return yearJoined;
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

}
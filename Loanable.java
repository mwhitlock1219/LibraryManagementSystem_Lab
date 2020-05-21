interface Loanable {
    public boolean isLoanable(boolean canBeLoaned);

    public void lateCharge(int charge);
}
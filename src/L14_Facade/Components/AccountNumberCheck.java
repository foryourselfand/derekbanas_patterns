package L14_Facade.Components;

public class AccountNumberCheck {
    private int accountNumber = 12345678;

    public int getAccountNumber() {
        return accountNumber;
    }

    public boolean accountActive(int acctNumToCheck) {
        return acctNumToCheck == getAccountNumber();
    }
}

package UTS;

public class account {
    private String accountNumber, accountName, phoneNumber, emailAddress;
    private int balance;

    public account(String accountNumber, String accountName, String phoneNumber, String emailAddress, int balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "%-10s | %-10s | %-20s | %-40s | %d".formatted(accountNumber, accountName, phoneNumber, emailAddress, balance);
    }
}

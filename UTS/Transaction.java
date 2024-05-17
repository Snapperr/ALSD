package UTS;

public class Transaction {

    account[] accounts = new account[12];

    void addAccount(account account) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = account;
                break;
            }
        }
    }

    void displayAccounts() {
        for (int i = 0; i < accounts.length; i++) {
            System.out.println(accounts[i].toString());
        }
    }

    void sortAccounts() {
        int n = accounts.length;
        for (int i = 0; i < n; i++) {
            int large = i;
            for (int j = i + 1; j < n; j++) {
                if (accounts[j].getBalance() > accounts[large].getBalance()) {
                    large = j;
                }
            }

            account temp = accounts[i];
            accounts[i] = accounts[large];
            accounts[large] = temp;
        }
    }

    void displayZeroBalance() {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getBalance() == 0) {
                System.out.println(accounts[i].toString());
            }
        }
    }

    void withdrawAccounts(String accountNumber, int amount) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                accounts[i].setBalance(accounts[i].getBalance() - amount);
            }
        }   
    }

    void searchAccounts(String accountName) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getAccountName().equalsIgnoreCase(accountName)) {
                System.out.println(accounts[i].toString());
            }
        }
    }

    void depositAccounts(String accountNumber, int amount) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                accounts[i].setBalance(accounts[i].getBalance() + amount);
            }
        }
    }

}

package UTS;

import java.util.*;

public class BankingMain {
    static Scanner sc = new Scanner(System.in);
    static Transaction data = new Transaction();

    public static void main(String[] args) {
        

        inputAccount("16030927 3084", "Wallace", "1-458-264-3263", "ligula.Nullam@tacitisociosqu.edu", 10000);
        inputAccount("16100617 0573", "Darius", "1-357-843-0547", "nec@lectusjusto.org", 7000);
        inputAccount("16240401 2243", "Fuller", "571-7062", "convallis@Vestibulumanteipsum.org", 5000);
        inputAccount("16270525 0112", "Malcolm", "623-0234", "porttitor.tellus.non@Curabitur.ca", 44000);
        inputAccount("16971204 2416", "Geoffrey", "1-683-416-8323", "ut.pellentesque@luctusutpellentesque.com", 50000);
        inputAccount("16100727 8862", "Rudyard", "650-5379", "Proin.eget@velitegestaslacinia.ca", 123000);
        inputAccount("16460329 4259", "Troy", "897-7608", "pede.Suspendisse.dui@a.ca", 100000);
        inputAccount("16320421 3437", "Alec", "792-4447", "non@mus.com", 34000);
        inputAccount("16180729 7229", "Walter", "863-8209", "Pellentesque.ut.ipsum@neque.ca", 334544);
        inputAccount("16950313 6823", "Simon", "592-6919", "tellus.justo.sit@commodoauctor.net", 23444);
        inputAccount("16850708 3528", "Kamal", "1-115-339-7678", "dictum@nec.edu", 567770);
        inputAccount("16696969 3420", "Kevin", "1-115-369-7420", "bramasta.com", 0);

        menu();
    }

    static void menu() {
        int choice = 0;
        do {
            System.out.println(" 1. Display Accounts    ");
            System.out.println(" 2. Search Account      ");
            System.out.println(" 3. Deposit Account     ");
            System.out.println(" 4. Withdraw Account    ");
            System.out.println(" 5. Display Zero Balance");
            System.out.println(" 6. Sort Accounts       ");
            System.out.println(" 7. Exit                ");
            System.out.print("Choose :  ");

            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    data.displayAccounts();
                    break;
                case 2:
                    System.out.print("Enter Account Name: ");
                    String accountName = sc.nextLine();
                    data.searchAccounts(accountName);
                    break;
                case 3:
                    System.out.print("Enter Account Number: ");
                    String accountNumber = sc.nextLine();
                    System.out.println("Enter Amount: ");
                    int amount = sc.nextInt();
                    data.depositAccounts(accountNumber, amount);
                    break;
                case 4:
                    System.out.print("Enter Account Number: ");
                    String accountNumber2 = sc.nextLine();
                    System.out.print("Enter Amount: ");
                    int amount2 = sc.nextInt();
                    sc.nextLine();
                    data.withdrawAccounts(accountNumber2, amount2);
                    break;
                case 5:
                    data.displayZeroBalance();
                    break;
                case 6:
                    data.sortAccounts();
                    break;
            }
        } while (choice != 7);

    }

    static void inputAccount(String accountNumber, String accountName, String phoneNumber, String emailAddress,
            int balance) {
        account account = new account(accountNumber, accountName, phoneNumber, emailAddress, balance);
        data.addAccount(account);
    }
}

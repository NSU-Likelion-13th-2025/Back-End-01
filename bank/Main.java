package bank;

public class Main {
    public static void main(String[] args) {
        System.out.println("21101837 윤지환");
        CheckingAccount checkingAccount = new CheckingAccount("123-4567890", 100000);
        System.out.println();
        checkingAccount.withdraw(100000);
        System.out.println();
        checkingAccount.deposit(50000);
        System.out.println();
        checkingAccount.addInterest();
        System.out.println();
        checkingAccount.displayAccountInfo();
    }
}

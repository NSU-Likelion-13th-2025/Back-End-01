package bank;

abstract class BankAccount {
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}

public class CheckingAccount extends BankAccount implements Bankinterest {
    private String accountNumber;
    private double balance;

    public CheckingAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        displayAccountInfo();
    }

    @Override
    public void deposit(double amount) { // 입금
        balance += amount;
        System.out.println(amount + "원이 입금됐습니다.");
        System.out.println("잔액" + balance + "원");
    }

    @Override
    public void withdraw(double amount) { // 출금
        balance -= amount;
        System.out.println(amount + "원이 출금됐습니다.");
        System.out.println("현재 잔액" + balance + "원");
    }

    public void addInterest(){
        int rate = (int)((int)balance * interestRate); // balance를 int형으로 형변환 해주지 않을시 이자가 999원이 됨
        balance += rate;
        System.out.println("이자 " + rate + "원이 추가됐습니다.");
    }

    public void displayAccountInfo() {
        System.out.println("계좌 번호: " + accountNumber);
        System.out.println("잔액: " + balance + "원");
        System.out.println("이자율: " + interestRate*100 + "%");
    }
}

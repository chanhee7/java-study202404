package day07.encap.practice;

public class BankAccount {

    private String accountNumber;
    private String accountHolder;
    private long balance;

    public BankAccount(String accountNumber, String accountHolder, long balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    public void deposit(int balance) {
        if (balance < 0) {
            System.out.println("입금액은 음수일 수 없습니다.");
            return;
        }
        this.balance += balance;
    }

    public void withdraw(int balance) {
        if (balance < 0 || balance > this.balance) {
            System.out.println("잔액이 부족하거나 잘못된 출금액입니다.");
            return;
        }
        this.balance -= balance;
    }

}

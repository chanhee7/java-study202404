package day07.encap.practice;

public class Main {

    public static void main(String[] args) {

        // BankAccount 클래스 테스트
        BankAccount myAccount = new BankAccount("123-456-789", "김철수", 10000);
        System.out.println("현재 잔액: " + myAccount.getBalance());
        myAccount.deposit(50000);
        System.out.println("입금 후 잔액: " + myAccount.getBalance()); // 60000 출력
        myAccount.withdraw(20000);
        System.out.println("출금 후 잔액: " + myAccount.getBalance()); // 40000 출력


        // PasswordManager 클래스 테스트
        PasswordManager pm = new PasswordManager("oldPassword123");
        boolean isChanged = pm.changePassword("oldPassword123", "newPassword123");
        System.out.println("Password changed: " + isChanged); // true
    }
}

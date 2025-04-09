
package chapterThree;

public class TestAccount {
    public static void main(String[] args) {
        Account myAccount = new Account(12000.0);
        myAccount.withdraw(500.0);
        System.out.println("Balance " + myAccount.getAccountBalance());

        myAccount.withdraw(40.0);
        System.out.println("Balance " + myAccount.getAccountBalance());
    }
}
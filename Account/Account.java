package chapterThree;

public class Account{
    private double accountBalance;


public Account(double initialBalance){
    if(initialBalance > 0.0){
        accountBalance = initialBalance;
    }
}
public void deposit(double amount){

    System.out.println("deposit amount " + amount);
    accountBalance += amount;
}
public void withdraw(double amount){
    java.util.Scanner input = new java.util.Scanner(System.in);
    double withdrawAmount = input.nextDouble();
    System.out.println("withdraw amount " + amount);
    if(accountBalance >= amount){
        accountBalance -= amount;
    }else {
        System.out.println("Insufficient balance");
    }
}
public double getAccountBalance(){
    return accountBalance;
}

}
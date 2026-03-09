
public class Main
{
public static void main(String args[]){
    BankAccount account=new BankAccount(200);
    account.deposit(300);
    account.withdraw(200);
    account.balance();
    account=new SavingsAccount(500);
    account.deposit(300);
    account.withdraw(200);
    account.balance();
    account.withdraw(700);
}
}
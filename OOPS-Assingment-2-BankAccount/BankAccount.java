
public class BankAccount
{
    public int balance;
    BankAccount(int balance){
    this.balance=balance;
    }
     public void deposit(int d_amount){
    System.out.println("Amount Deposited : "+d_amount);
    balance+=d_amount;
    }
    public void withdraw(int w_amount){
    System.out.println("Amount Withdrawn : "+w_amount);
    balance-=w_amount;
    }
    public void balance(){
    System.out.println("Bank Account balance : "+balance);
    }
}
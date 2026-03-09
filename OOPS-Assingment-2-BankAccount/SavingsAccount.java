
public class SavingsAccount extends BankAccount
{
    SavingsAccount(int balance){
    super(balance);
    }
    public void withdraw(int w_amount){
    if(balance-w_amount<100) System.out.println("Your Balance too low");
    else {
    System.out.println("Amount Withdrawn from Savings: "+w_amount);
    balance-=w_amount;
    }
    }
    public void balance(){
    System.out.println("Savings Account balance : "+balance);
    }
}
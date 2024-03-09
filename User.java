import java.lang.*;
import java.util.*;
class ATM 
{
    float store=0;
    public void checkbalance()
    {
        System.out.println("Available Balance in the account is "+store);
    }
    public void deposit(float amount)
    {
        store+=amount;
    }
    public void withdraw(float amount)
    {
        if(store<amount)
             System.out.println("Insufficient Balance to withdraw");
        else store-=amount;
    }
}
class User 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        ATM atm=new ATM();
        System.out.println("1.checkbalance");
        System.out.println("3.deposit");
        System.out.println("2.withdraw");
        int repeat=1;
        while(repeat>0){
        System.out.println("Enter your choice:");
        int ch=s.nextInt();
        switch(ch){
        case 1:
            atm.checkbalance();
            break;
        case 2:
            System.out.println("Enter the amount to be deposit");
            atm.deposit(s.nextFloat());
            break;
        case 3:
            System.out.println("Enter the amount to be withdraw");
            atm.withdraw(s.nextFloat());
            break;
        default:System.out.println("Enter your choice correctly");
               break;
        }
        System.out.println("Do you want to continue? Enter 1/0:");
        repeat=s.nextInt();
        }
    }
}

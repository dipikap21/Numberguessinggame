import java.util.Scanner;
class Atm
{
	float balance;
    int PIN=5674;
    public void checkpin()
	{
		System.out.println("Enter your pin::");
		Scanner sc=new Scanner(System.in);
		int enteredpin=sc.nextInt();
		if(enteredpin==PIN)
		{
			menu();
		}
		else
		{
			System.out.println("Enter valid PIN!!!");
			menu();
		}
		
	}	
   public void menu()
   {
	System.out.println();
	System.out.println();
	System.out.println("Enter your choice::");
	System.out.println("1: Check account balance::");
	System.out.println("2: Withdraw money::");
	System.out.println("3: Deposit money::");
	System.out.println("4: Exit");
	Scanner sc=new Scanner(System.in);
	int opt=sc.nextInt();
	
	if(opt==1)
	{
		checkBalance();
	}
	else if(opt==2)
	{
		withrowMoney();
	}
	else if(opt==3)
	{
		depositMoney();
	}
	else if(opt==4)
	{
		return;
	}
	else
	{
		System.out.println("Enter the valid choice");
	}
   }
   public void checkBalance()
   {
	   System.out.println("Your Balance is::" +balance);
	   menu();
   }
   public void withrowMoney()
   {
	   System.out.println("Enter the amount to withrow::");
	   Scanner sc=new Scanner(System.in);
	   float amount=sc.nextInt();
	   if(amount>balance)
	   {
		   System.out.println("Insuffient Balance");
	   }
	   else
	   {
	   balance=balance-amount;
	   System.out.println("Money withdrawl successful");
	   menu();
	   }
   }
   public void depositMoney()
   {
	System.out.println("Enter the amount you want to deposit::");
    Scanner sc=new Scanner(System.in);
    float amount=sc.nextInt();
    balance=balance+amount;
	System.out.println("Money Deposited Successful");
    menu();	
   }
}
class AtmMachine
{
	public static void main(String args[])
	{
		Atm obj=new Atm();
		obj.checkpin();
	}
}
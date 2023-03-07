package ATM;

import java.util.Scanner;

public class ATM 
{
	int balance = 100000, withdraw, deposite;
	Scanner sc = new Scanner(System.in);
	
	void withdraw()
	{
		if(balance >= deposite)
		{
			System.out.print("Enter Your Your Withdraw Money : ");
			withdraw = sc.nextInt();
			balance = balance - withdraw;
			System.out.print("Please Collect Your Money : "+withdraw);
			System.out.print("\n");
		}
		else
		{
			System.out.println("Insufficient Balance");
			System.out.print("\n");
		}
	}
	void deposite()
	{
		System.out.println("Enter Your Deposite : ");
		deposite = sc.nextInt();
		balance = balance + deposite;
		System.out.print("Your Money Succsessfully Deposite : " + deposite);
		System.out.print("\n");
	}
	void balance()
	{
		System.out.print("Your Balance Is : " + balance);
		System.out.print("\n");
	}
	void exit()
	{
		System.exit(0);
		System.out.print("\n");
	}

	public static void main(String[] args) 
	{
		ATM A = new ATM();
		
		Scanner sc = new Scanner(System.in);
		
		
	}
	
}

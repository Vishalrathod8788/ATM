package ATM;

import java.util.Scanner;

public class ATM 
{
	public ATM() 
	{
		int balance = 100000, withdraw, deposite;
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Automated Taller Machine");
			System.out.println("Choice 1 for withdraw");
			System.out.println("Choice 2 for Deposit");
			System.out.println("Choice 3 for Check Balance");
			System.out.println("Choice 4 for Exit");
			System.out.println("Choice the operation you want to perform :");
			System.out.println("\n###################################################################");
			
			int choice = sc.nextInt();
			switch (choice) {
			case 1: 
				System.out.println("Enter Money to be withdrawn :");
				withdraw = sc.nextInt();
				if(balance >= withdraw)
				{
					balance = balance - withdraw;
					System.out.println("Please Collact Your Money");
					System.out.println("\n###################################################################");
				}
				else
				{
					System.out.println("Insufficient Balance");
					System.out.println("\n###################################################################");
				}
				System.out.println(" ");
			break;
			case 2:
				System.out.println("Enter Money To Be deposited");
				deposite = sc.nextInt();
				balance = balance + deposite;
				System.out.println("Your Money Has Been Successfully Deposited");
				System.out.println("\n###################################################################");
				break;
				
			case 3:
				System.out.println("Balance : "+ balance);
				System.out.println("\n###################################################################");
				break;
			default:
			}
		}
		
	}
	public static void main(String[] args) 
	{
		new ATM();
	}
	
}

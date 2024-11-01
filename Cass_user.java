package com.atm;

import java.util.Scanner;

public class Cass_user {
	private static int status;

	public static void main(String[] args) {
		Atm_operation op=new Atm_operation();
		int atmpin=1234;
		Scanner sc=new Scanner(System.in);
		System.out.println("welcome to ATM Machine!");
		System.out.print("enter pin: ");
		int atmpin1=sc.nextInt();
		if(atmpin==atmpin1)
		{
			while(true)
			{
				System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit amount\n4.View MiniStatement\n5.exit");
				System.out.println("enter choice :");
				int ch=sc.nextInt();
				if(ch==1)
				{
					//System.out.println("View Available Balance");
					op.viewBalence();
				}
				else if(ch==2)
				{
					System.out.println(" Enter amount to withdrawn");
					double withdrawAmounnt=sc.nextDouble();
					op.withdrawAmounnt(withdrawAmounnt);
				}
				else if(ch==3)
				{
					System.out.println("Enter Amount to Deposit:");
					double depositAmount=sc.nextDouble();//5000
					op.depositeAmount(depositAmount);
				}
				else if(ch==4)
				{
					op.viewMiniStatement();
					//System.out.println("View MiniStatement");
				}
				else if(ch==5)
				{
					System.out.println("Collect your ATM Card\n Thank you for choosing ATM Machine");
					System.exit(status);
				}
				else
				{
					System.out.println("Please enter correct choice");
				}
			}
		}
		else
		{
			System.out.println("incorrect ATM  pin");
			System.exit(status);
		}

	}

}

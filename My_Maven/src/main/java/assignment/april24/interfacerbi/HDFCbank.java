package assignment.april24.interfacerbi;

import java.util.Scanner;

public class HDFCbank implements RBI
{
	float amount;
	int period;
	float addedAmount;
	float accountBalance;
public void recurringDeposit()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the amount to be deposited:");
	amount=sc.nextFloat();
	System.out.println("Enter the period to be deposited in years: ");
	period=sc.nextInt();
	System.out.println("Amount to be deposited: "+amount);
	System.out.println("Period to be deposited: "+period);
	addedAmount=(amount*INTEREST_RATE*period)/100;
	System.out.println("Interest Received: "+addedAmount);
	accountBalance=amount+addedAmount;
	System.out.println("ACCOUNT BALANCE: "+accountBalance);
}
	public static void main(String[] args)
	{
		
		HDFCbank obj= new HDFCbank ();
		obj.recurringDeposit();
		
	}

}

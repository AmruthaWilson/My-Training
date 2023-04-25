package assignment.april21.abstraction;

import java.util.Scanner;

public class Contractor extends Employee
{
	int paymentperhour=800;
	public void calculateSalary()
	{
		
		
		totalpayment=paymentperhour*empHour;
		System.out.println("Payment Received in total :"+totalpayment);
	}
	public static void main(String[] args)
	{
		Contractor obj1=new Contractor();
		obj1.input();
		obj1.Employee();
		obj1.calculateSalary();
		
	}

}

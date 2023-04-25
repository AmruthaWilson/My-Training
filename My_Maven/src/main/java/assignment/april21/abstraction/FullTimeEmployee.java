package assignment.april21.abstraction;

public class FullTimeEmployee extends Employee
{
	final int WORK_HOUR=8;
	int paymentperhour=1500;
	public void calculateSalary()
	{
		
		totalpayment=paymentperhour*WORK_HOUR;
		System.out.println("Payment Received in total :"+totalpayment);
	}
	public static void main(String[] args)
	{
		FullTimeEmployee obj2=new FullTimeEmployee();
		obj2.input();
		obj2.Employee();
		obj2.calculateSalary();

	}

}

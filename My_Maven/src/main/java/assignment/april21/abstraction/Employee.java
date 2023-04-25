package assignment.april21.abstraction;

import java.util.Scanner;

public  abstract class Employee
{
	String empName;
	int empId;
	int empHour;
	int totalpayment;
public void Employee()
{
	System.out.println("Name of Employee :"+empName);
	System.out.println("ID of Employee :"+empId);
	System.out.println("Working Hour of Employee :"+empHour);
}
public void input()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Name of Employee :");
	empName=sc.nextLine();
	System.out.println("Enter Id of Employee :");
	empId=sc.nextInt();
	System.out.println("Enter Working Hours :");
	empHour=sc.nextInt();
}
public abstract void calculateSalary();
}

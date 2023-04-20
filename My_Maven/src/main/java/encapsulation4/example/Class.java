package encapsulation4.example;

import java.util.Scanner;

import encapsulation3.example.Bank;

public class Class
{

	public static void main(String[] args)
	{
		String name;
		int upin;
		Bank obj=new Bank();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Name:");
		name=sc.nextLine();
		obj.setName(name);
		System.out.println("Enter Your Pin:");
		upin=sc.nextInt();
		obj.setPin1(1001);
		obj.setPin2(1234);
		obj.setPin3(1212);
		obj.valid(upin);

	}

}

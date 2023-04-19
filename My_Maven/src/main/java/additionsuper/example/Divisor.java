package additionsuper.example;

import java.util.Scanner;

public class Divisor extends Addition
{
	
	
	public Divisor(int num1, int num2) 
	{
		super.num1=num1;
		super.num2=num2;
	}

	public void input1()
	{
		if(super.sum%10==0)
		{
			System.out.println("Divisible");
		}
		else
		{
			System.out.println("Not Divisible");
		}
	}

	public static void main(String[] args)
	{
		  int result,n1,n2;
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter your first number: ");
	      n1=sc.nextInt();
	      System.out.println("Enter your second number: ");
	      n2=sc.nextInt();
	      Divisor obj=new Divisor(n1,n2);
		  result=obj.input();
		  obj.output();
		  obj.input1();

	}

}

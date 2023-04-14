package test.program;
import java.util.*;
public class Reverse
{
	public static void main(String[] args)
	{
		int num1;
		int reverse=0;
		int remainder;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		num1=sc.nextInt();
		while(num1!=0)
		{
			remainder=num1%10;
			reverse=reverse*10+remainder;
			num1=num1/10;
		}
			
		System.out.println("Reverse Of The Number:"+reverse);

	}

}

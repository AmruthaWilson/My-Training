package methodOverriding.example;

import java.util.Scanner;
public class Offseason extends Onseason
{

public Offseason(float item1, float item2, float item3)
    {
	bAmount=item1+item2+item3;
	System.out.println("Bill Total :"+bAmount);
		
	}
public void discount()
{
	
	dCount=(bAmount*15)/100;
	System.out.println("Discount on Offseason :"+dCount);
	amountTopay=bAmount-dCount;
	System.out.println("Amount To Pay on Offseason :"+amountTopay);
	
}
public void onOroff(int n1)
{
	if(n1==1)
	{
		super.discount();
	}
	else
	{
		discount();
	}
}


public static void main(String[] args)
	{
		int b1;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the option");
		System.out.println("1.On Season");
		System.out.println("Or");
		System.out.println("2.Off Season");
		b1=sc.nextInt();
		
		Offseason obj=new Offseason(4500.05f,2300.0f,6000.50f);
		obj.onOroff(b1);
	}

}

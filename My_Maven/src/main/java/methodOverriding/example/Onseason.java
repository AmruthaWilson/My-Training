package methodOverriding.example;

public class Onseason
{
	float bAmount;
	float dCount;
	float amountTopay;
	
	public void discount()
	{
		dCount= (bAmount*40)/100;
		System.out.println("Discount on Onseason :"+dCount);
		amountTopay=bAmount-dCount;
		System.out.println("Amount To Pay on Onseason :"+amountTopay);
	}
}


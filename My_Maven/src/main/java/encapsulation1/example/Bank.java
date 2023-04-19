package encapsulation1.example;

public class Bank 
{
	private String custname;
	private float amount;
	public String getCustname() 
	{
		return custname;
	}
	public void setCustname(String custname)
	{
		this.custname = custname;
	}
	public float getAmount()
	{
		return amount;
	}
	public void setAmount(float amount) 
	{
		this.amount = amount;
	}
	public void calculate()
	{
		float i;
		i=((amount*5*7.6f)/100);
		amount+=i;
		
	}

	

}

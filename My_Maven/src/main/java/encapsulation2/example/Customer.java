package encapsulation2.example;

import encapsulation1.example.Bank;

public class Customer {

	public static void main(String[] args)
	{
		Bank obj=new Bank();
		obj.setCustname("Amrutha Midhun");
		obj.setAmount(20000);
		obj.calculate();
		System.out.println("Name of Customer: "+obj.getCustname());
		float balance;
		balance=obj.getAmount();
		System.out.println("Avaialble Balance :"+balance);
		
		

	}

}

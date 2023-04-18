package multilevelinheritance.example;

public class CarOwner extends CarModel
{
	String ownerName;
	
	public void input2(String oName)
	{
		ownerName=oName;
		
	}
	public void display()
	{
		System.out.println("ShowRoom Name :"+shwRoomName);
		System.out.println("ShowRoom Id :"+shwRoomId);
		System.out.println("Car Model :"+carModel);
		System.out.println("Car Type :"+carType);
		System.out.println("Car Owner :"+ownerName);
	}

	public static void main(String[] args) 
	{
		CarOwner obj=new CarOwner ();
		obj.input("Popular Hyundai",10054);
		obj.input1("Hyndai Venue","Compact Suv");
		obj.input2("Midhun Jose");
		obj.display();
		
	}
}

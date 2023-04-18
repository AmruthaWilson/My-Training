package hierarchicalinheritance.example;



public class Player3 extends Cricket
{
	String playerName2;
	int playerNo2;
	String playrole2;
	
	public void input3(String pName2,int pNo2,String pRole2)
	{
		playerName2=pName2;
		playerNo2=pNo2;
		playrole2=pRole2;
	}
	public void display()
	{
		System.out.println("Team :"+team);
		System.out.println("Name of the Player :"+playerName2);
		System.out.println("Number of the Player :"+playerNo2);
		System.out.println("Playing Role :"+playrole2);


	}

	public static void main(String[] args)
	{
		Player3 obj3=new Player3();
		obj3.input("India");
		obj3.input3("Ishan Kishan",18,"Wicket Keeper");
		obj3.display();
		
	}
}

package hierarchicalinheritance.example;



public class Player2 extends Cricket
{
	String playerName1;
	int playerNo1;
	String playrole1;
	
	public void input2(String pName1,int pNo1,String pRole1)
	{
		playerName1=pName1;
		playerNo1=pNo1;
		playrole1=pRole1;
	}
	public void display()
	{
		System.out.println("Team :"+team);
		System.out.println("Name of the Player :"+playerName1);
		System.out.println("Number of the Player :"+playerNo1);
		System.out.println("Playing Role :"+playrole1);


	}
	public static void main(String[] args)
	{
		Player2 obj2=new Player2();
		obj2.input("India");
		obj2.input2("Umesh Yadhav",12,"Bowler");
		obj2.display();
		
	}

}

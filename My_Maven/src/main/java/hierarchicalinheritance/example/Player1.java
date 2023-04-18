package hierarchicalinheritance.example;

public class Player1 extends Cricket
{
	String playerName;
	int playerNo;
	String playrole;
	
	public void input1(String pName,int pNo,String pRole)
	{
		playerName=pName;
		playerNo=pNo;
		playrole=pRole;
	}
	public void display()
	{
		System.out.println("Team :"+team);
		System.out.println("Name of the Player :"+playerName);
		System.out.println("Number of the Player :"+playerNo);
		System.out.println("Playing Role :"+playrole);


	}
	public static void main(String[] args)
	{
		Player1 obj1=new Player1();
		obj1.input("India");
		obj1.input1("Virat Kohli",10,"Batsman");
		obj1.display();
	}

}



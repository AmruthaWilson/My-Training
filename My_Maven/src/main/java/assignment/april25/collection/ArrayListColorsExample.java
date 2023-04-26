package assignment.april25.collection;

import java.util.*;

public class ArrayListColorsExample 
{
	ArrayList<String> obj=new ArrayList<String>();
	Scanner sc=new Scanner(System.in);
	
	public void colors()
	{
    obj.add("Violet");
	obj.add("Red");
	obj.add("Blue");
	obj.add("Green");
	obj.add("Yellow");
	obj.add("Orange");
	obj.add("Black");
	obj.add("Indigo");
	obj.add("White");
	System.out.println("List OF Colours :"+obj);
	}
	
	public void retrieve()
	{
		System.out.println("Enter Index Number Of The Color To Be Retrieved :");
		int num1= sc.nextInt();
		System.out.println("Retrieved color at 5th index from list of colors:"+obj.get(num1));
		
	}
	public void iteration()
	{
		Iterator<String> it=obj.iterator();
		while(it.hasNext())
		{
			
			System.out.print(it.next()+" ");
		}
	}
	public void remove()
	{
		System.out.println("Enter Index Number Of The Color To Be Removed :");
		int num2=sc.nextInt();
		obj.remove(num2);
		System.out.println("List OF Colors After Deletion :"+obj);
		
	}
	public void search()
	{
		System.out.println("Enter A Color To Search:");
		sc.nextLine();
		String color=sc.nextLine();
		for(int i=0;i<obj.size();i++)
		{
			String list=obj.get(i);
		}
		if(color.equalsIgnoreCase(color))
		{
			System.out.println("Searched element is Present in Array");
			
		}
		else
		{
			System.out.println("Searched element is Absent in Array");
			
		}
		
		
	}
	public static void main(String[] args)
	{
		ArrayListColorsExample obj1=new ArrayListColorsExample ();
		System.out.println("> Printing Colors :");
		obj1.colors();
		System.out.println("> Retrieveing A Color");
		obj1.retrieve();
		System.out.println("> Iterating Through Colors");
		obj1.iteration();
		System.out.println();
		System.out.println("> Removing A Color");
		obj1.remove();
		System.out.println(" > Searching A Color");
		obj1.search();
		
	
	
	
	}
}
package collectionexample;
import java.util.*;
public class ArraylistExample
{
	
public static void main(String[] args)
	{
		ArrayList<String> ls=new ArrayList<String>();
		ls.add("Amrutha");
		ls.add("Sabitha");
		ls.add("Sangeetha");
		ls.add("Reeja");
		ls.add("Dithya");
		ls.add("Ryan");
		System.out.println("List OF Students :"+ls);
		System.out.println("Length OF Array :"+ls.size());
		ls.remove(5);
		System.out.println("List OF Students After Deletion :"+ls);
		Collections.sort(ls);//class is collections and method is sort
		System.out.println("Sorted List OF Students :"+ls);
		ArrayList<Integer> ls1=new ArrayList<Integer>();
		ls1.add(10);
		ls1.add(15);
		ls1.add(12);
		System.out.println("List OF Numbers :"+ls1);
		Collections.sort(ls1);
		System.out.println("Sorted List OF Numbers :"+ls1);
		/*
		System.out.println("For Loop");
		for(int i=0;i<ls.size();i++)//for loop
		{
			String value=ls.get(i);
			
			System.out.println(value);
		}
		
		System.out.println("For Each loop  :String");
		for (String e:ls)//for each loop
		{
			System.out.println(e);
		}
		System.out.println("For Each loop  :Integers");
		for(int a:ls1)
		{
			System.out.println(a);
		}
*/
		System.out.println("Using Iterator: String");
		Iterator<String> it=ls.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		System.out.println();
		System.out.println("Using Iterator: Integers");
		Iterator<Integer> it1=ls1.iterator();
		while(it1.hasNext())
		{
			System.out.print(it1.next()+" ");
		}
		
	}

}

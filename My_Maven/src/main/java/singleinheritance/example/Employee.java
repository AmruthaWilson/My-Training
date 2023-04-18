package singleinheritance.example;

public class Employee extends Company 
{
	String empName;
	int empId;
	
	public void input1(String empName,int empId)
	{
		this.empName=empName;
		this.empId=empId;
		
	}
	public void display()
	{
		System.out.println("Company Name: "+cmpName);
		System.out.println("Company ID: "+cmpId);
		System.out.println("Company Department: "+deptName);
		System.out.println("Employee Name :"+empName);
		System.out.println("Employee ID :"+empId);
		
	}

public static void main(String[] args)
{
	Employee obj1=new Employee();
	Employee obj2=new Employee();
	obj1.input(568,"Software Testing");
	obj1.input1("Amrutha Midhun",1465);
	obj2.input(568,"Software Testing");
	obj2.input1("Sherin Printo",6545);
	System.out.println("Employee 1:");
	obj1.display();
	System.out.println("Employee 2:");
	obj2.display();
	
}

}

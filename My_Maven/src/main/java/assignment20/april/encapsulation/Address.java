package assignment20.april.encapsulation;

public class Address 
{

	private String houseName;
	private int houseNo;
	private String placeName;
	private String districtName;
	private int pinNo;
	private Student std;
	
	public String getHouseName()
	{
		return houseName;
	}
	public void setHouseName(String houseName)
	{
		this.houseName = houseName;
	}
	public int getHouseNo() 
	{
		return houseNo;
	}
	public void setHouseNo(int houseNo)
	{
		this.houseNo = houseNo;
	}
	public String getPlaceName()
	{
		return placeName;
	}
	public void setPlaceName(String placeName)
	{
		this.placeName = placeName;
	}
	public String getDistrictName()
	{
		return districtName;
	}
	public void setDistrictName(String districtName) 
	{
		this.districtName = districtName;
	}
	public int getPinNo() 
	{
		return pinNo;
	}
	public void setPinNo(int pinNo)
	{
		this.pinNo = pinNo;
	}
	public Student getStd()
	{
		return std;
	}
	public void setStd(Student std) 
	{
		this.std = std;
	}
	
	public void print()
	{
		System.out.println("Name of the Student :"+std.getStdName());// variable.getter()
		System.out.println("Roll Number of the Student :"+getStd().getStdRollno());// getter vatiable. getter method
		System.out.println("Address of the Student :");
		System.out.println(getHouseName());
		System.out.println("House No:"+getHouseNo());
		System.out.println(getPlaceName());
		System.out.println(districtName);//since districtname declared private direct districtName can be called in this class
		System.out.println(getPinNo());
		
	}
	

}

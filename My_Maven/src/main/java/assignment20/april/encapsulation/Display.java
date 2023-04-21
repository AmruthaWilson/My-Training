package assignment20.april.encapsulation;

public class Display
{

	public static void main(String[] args)
	{
	  Student objstd=new Student();
	  Address objaddr=new Address();
	  objstd.setStdName("Amrutha Wilson");
	  objstd.setStdRollno(102);
	  objaddr.setHouseName("Maliakkel Mulakken House");
	  objaddr.setHouseNo(53);
	  objaddr.setPlaceName("Kuriachira P O");
	  objaddr.setDistrictName("Thrissur");
	  objaddr.setPinNo(680006);
	  objaddr.setStd( objstd);
	  objaddr.print();
	}

}

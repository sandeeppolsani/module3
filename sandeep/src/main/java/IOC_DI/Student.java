package IOC_DI;

public class Student {

	private int regNO;
	private String name;
	private Address address;
	
	Student()
	{
		
	}
	
	
	
	public Student(int regNO, String name, Address address) {
		super();
		this.regNO = regNO;
		this.name = name;
		this.address = address;
		
	}


	

	public Student(int regNO, String name) {
		super();
		this.regNO = regNO;
		this.name = name;
	}

	


	public Student(String name) {
		super();
		this.name = name;
	}



	public String toString()
	{
		return "RegNo : "+regNO+"\n"
				+ "Name : "+name+"\n"
						+ "Address : "+"uhygtfrd";
	}

	public int getRegNO() {
		return regNO;
	}

	public void setRegNO(int regNO) {
		this.regNO = regNO;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("heiiii");
		this.address = address;
	}
	
	
}

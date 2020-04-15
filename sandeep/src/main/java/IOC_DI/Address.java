package IOC_DI;

public class Address {
	
	private int Houseno;
	private String village;
	private String district;
	private int pincode;
	
	public String toString()
	{
		return "HouseNo : "+Houseno+"\n"
				+ "\tVillage :"+village+"\n"
						+ "\tDistric :"+district+"\n";
	}

	
	public Address(int houseno, String village, String district, int pincode) {
		super();
		System.out.println("hello");
		Houseno = houseno;
		this.village = village;
		this.district = district;
		this.pincode = pincode;
	}
	


	public Address(int houseno, String village, String district) {
		super();
		Houseno = houseno;
		this.village = village;
		this.district = district;
	}
	


	public Address(int houseno) {
		super();
		Houseno = houseno;
	}


	public Address() {
		super();
	}


	public Address(int houseno, String village) {
		super();
		Houseno = houseno;
		this.village = village;
	}


	public int getHouseno() {
		return Houseno;
	}

	public void setHouseno(int houseno) {
		Houseno = houseno;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	

}

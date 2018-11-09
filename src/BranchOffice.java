
public class BranchOffice {
	private String location;
	private String adress;
	private int phoneNumber;

	public BranchOffice(String location, String adress, int phoneNumber) {
		this.location = location;
		this.adress = adress;
		this.phoneNumber = phoneNumber;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "BranchOffice: location= " + location + ", adress= " + adress + ", phoneNumber= " + phoneNumber ;
	}

}

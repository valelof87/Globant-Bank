import java.util.Date;

public abstract class Employee {
	private int DNI;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	protected double salary;
	protected int bonusSalaried;
	protected int bonusContracted;
	protected boolean isSalaried = true;
	protected double baseSalary;
	protected double ratePerHour;
	
	public Employee(int dni, String firstName, String lastName, Date dateOfBirth, boolean isSalaried) {
		this.DNI = dni;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.isSalaried =isSalaried;
	}
	
	public abstract double getSalary();
	

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public boolean isSalaried() {	
		return true;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getDNI() {
		return DNI;
	}

	public void setDNI(int dNI) {
		DNI = dNI;
	}

	
	public double getRatePerHour() {
		return ratePerHour;
	}


	public void setRatePerHour(double ratePerHour) {
		this.ratePerHour = ratePerHour;
	}

	public void setIsSalaried(boolean isSalaried) {
		this.isSalaried = isSalaried;
	}

	public int getBonussalaried() {
		return bonusSalaried;
	}

	public void setBonusSalaried(int bonusSalaried) {
		this.bonusSalaried = bonusSalaried;
	}

	public int getBonusContracted() {
		return bonusContracted;
	}

	public void setBonusContracted(int bonusContracted) {
		this.bonusContracted = bonusContracted;
	}

	@Override
	public String toString() {
		return "Employee: DNI= " + DNI + ", firstName= " + firstName + ", lastName= " + lastName + ", dateOfBirth= "
				+ dateOfBirth + ", isSalaried= " + isSalaried ;
	}

}

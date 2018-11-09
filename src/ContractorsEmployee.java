import java.util.Date;

public class ContractorsEmployee extends Employee {
	private int workHours;
	private double extraPayment;
	

	public ContractorsEmployee(int dni, String firstName, String lastName, Date dateOfBirth,boolean isSalaried,int workHour) {
		super(dni, firstName, lastName, dateOfBirth, isSalaried = false);
		this.workHours = workHour;
	}
	public int getWorkHours() {
		return workHours;
	}

	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}

	public double getExtraPayment() {
		if (workHours > 40) {
			return extraPayment = (workHours - 40) * getBonusContracted() / 100;
		}
		return extraPayment;
	}

	public void setExtraPayment(double extraPayment) {
		this.extraPayment = extraPayment;
	}

	@Override
	public double getSalary() {
		salary = workHours * ratePerHour + (workHours - 40)* 150 * bonusContracted/100;
		return salary;
	}

}

import java.util.Date;

public class SalariedEmployee extends Employee {
	private int antiquity;
	private int challenge;
	private int extraBonus; 
	
	
public SalariedEmployee(int dni, String firstName, String lastName, Date dateOfBirth, 
			boolean isSalaried,int antiquity, int challenge,int extraBonus) {
		super(dni, firstName, lastName, dateOfBirth, isSalaried);
		this.antiquity = antiquity;
		this.challenge = challenge;
		this.extraBonus = extraBonus;

	}
	
	public int getExtraBonus() {
		return extraBonus ;
	}

	public void setExtraBonus(int extraBonus) {
		this.extraBonus = extraBonus;
	}


	public int getAntiquity() {
		return antiquity;
	}

	public void setAntiquity(int antiquity) {

		this.antiquity = antiquity;
	}

	public int getChallenge() {
		return challenge;
	}

	public void setChallenge(int challenge) {
		this.challenge = challenge;
	}

	@Override
	public double getSalary() {
		salary = baseSalary + baseSalary * antiquity * bonusSalaried / 100 + extraBonus * challenge;
		return salary;
		
	}

	

	
	

}

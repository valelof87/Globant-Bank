import java.util.ArrayList;
import java.util.List;

public class Bank {
	private List<BranchOffice> branchOffices;
	private  List<Employee> employees;
	
	
	public Bank(List<BranchOffice> branchOffices, List<Employee> employees) {
		this.branchOffices = new ArrayList<BranchOffice>();
		this.employees = new ArrayList<Employee>();
	}

	public List<BranchOffice> getBranchOffices() {
		return branchOffices;
	}

	public void setBranchOffices(List<BranchOffice> branchOffices) {
		this.branchOffices = branchOffices;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public void addBranchOffice(BranchOffice office) {// ADD BRANCH OFFICE

		branchOffices.add(office);
	}

	public void addEmployee(Employee employee) {//ADD EMPLOYEE
		employees.add(employee);
	}

	public void paySalary() {// PAY SALARY
		for (Employee emp : employees) {
			if(emp.isSalaried = true) {
			System.out.println(emp.getSalary());}
				
			else {
				System.out.println(emp.getSalary());
			}
		}
	}
	
	
	public int updateBonusSalaried(int bonusSalaried) {//UPDATE BONUS FOR SALARIED EMPLOYEES
		for (Employee emp : employees) {
			if (emp.isSalaried = true) {
				emp.setBonusSalaried(bonusSalaried);;
			}
		}
		return bonusSalaried;
	}
	
	public int updateBonusContractors(int bonusContracted) {//UPDATE BONUS FOR CONTRACTOR EMPLOYEES
		for(Employee contractors: employees) {
			contractors.setBonusContracted(bonusContracted);
		}
		return bonusContracted;
	}
	
	public double updateBaseSalary(double baseSalary) {// UPDATE BASE SALARY
		for (Employee emp : employees) {
			if (emp.isSalaried = true) {
				emp.setBaseSalary(baseSalary);
			}
		}
		return baseSalary;
	}
	
	public double updateRatePerHour(double ratePerHour) {// UPDATE RATE PER HOUR
		for (Employee emp : employees) {
				emp.setRatePerHour(ratePerHour);
			}
		return ratePerHour;
	}
}

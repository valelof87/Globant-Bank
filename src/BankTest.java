import java.util.ArrayList;
//import java.util.List;

public class BankTest {

	public static void main(String[] args) {
		
	//	List<BranchOffice> barnachOffices  = new ArrayList<BranchOffice>();
 		BranchOffice newBranchOff1 = new BranchOffice ("Tandil", "Pinto 123", 2494444);
		BranchOffice newBranchOff2 = new BranchOffice ("Tandil", "Rodriguez 123", 2494333);
		
		//ArrayList<Employee> employees = new ArrayList<Employee>();
		Employee emp1 = new SalariedEmployee(3333, "Juan", "Lopez", null,true,2,2, 150);
		Employee emp2 = new SalariedEmployee(3444, "Jose", "Herrera", null,true,3,2,150);
		Employee emp3 = new ContractorsEmployee(3555, "Joaquin", "perez", null, false,40);
		Employee emp4 = new ContractorsEmployee(3666, "Raul", "Lopez", null,false,60);

		
		
		Bank globantBank = new Bank( new ArrayList<BranchOffice>(), new ArrayList<Employee>());
		
		globantBank.addBranchOffice(newBranchOff1);
		globantBank.addBranchOffice(newBranchOff2);
		
		globantBank.addEmployee(emp1);
		globantBank.addEmployee(emp2);
		globantBank.addEmployee(emp3);
		globantBank.addEmployee(emp4);
		
		globantBank.updateBaseSalary(20000);
		globantBank.updateRatePerHour(150);
		
		globantBank.updateBonusSalaried(5);
		globantBank.updateBonusContractors(1);
		
		globantBank.paySalary();
		
		System.out.println(globantBank.getBranchOffices());
		System.out.println(globantBank.getEmployees());
		
		
		
		
		
		
	
		
		
		
	}

}

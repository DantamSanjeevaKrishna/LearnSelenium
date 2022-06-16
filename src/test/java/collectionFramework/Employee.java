package collectionFramework;

public class Employee {
	int employeeId;
	String employeeName;
	String employeeRole;
	
	public Employee(int employeeId, String employeeName, String employeeRole) {
		super();
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.employeeRole=employeeRole;
	}
	@Override
	public String toString() {
		
		return "Employee[employeeId=" +employeeId+ ",employeeName="+employeeName+", EmployeeRole"+employeeRole+"]";
	}
}

package beans;

import java.util.List;

public interface EmployeeDao {
	public void insert(EmployeeInfo employee);
	public void update(EmployeeInfo employee);
	public void update(List<EmployeeInfo>employees);
	public void delete(long employeeId);
	public EmployeeInfo find(long employeeId);
	public List<EmployeeInfo>find(List<Long>employeeId);
	public List<EmployeeInfo>find(String employeeName);

}

package beans;

import    java.util.ArrayList;
import    java.util.HashMap;
import    java.util.List;
import    java.util.Map;

public class EmployeeDaoInMemoryImpl implements EmployeeDao{
	private Map<Long,EmployeeInfo> employeeMap = new HashMap<Long,EmployeeInfo>();
	{
		EmployeeInfo mark = new EmployeeInfo(123456, "Mark", 23.00, "11/24/2006");
		EmployeeInfo todd = new EmployeeInfo(98765,"Todd", 15, "12/10/2017");
		
		employeeMap.put(mark.getId(), mark);
		employeeMap.put(todd.getId(), todd);
	}
	public void insert(EmployeeInfo employee) {
		employeeMap.put(employee.getId(), employee);
		
	}
	public void update(EmployeeInfo employee) {
		employeeMap.put(employee.getId(), employee);
		
	}
	public void update(List<EmployeeInfo> employees) {
		for(EmployeeInfo employee: employees) {
			update(employee);
		}
		
	}
	public void delete(long employeeId) {
		employeeMap.remove(employeeId);
		
	}
	public EmployeeInfo find(long employeeId) {
		return employeeMap.get(employeeId);
	}
	public List<EmployeeInfo> find(List<Long> employeeId) {
		List<EmployeeInfo> employees = new ArrayList<EmployeeInfo>();
		for(Long id: employeeId) {
			employees.add(employeeMap.get(id));
		}
		return employees;
	}
	public List<EmployeeInfo> find(String employeeName) {
		List<EmployeeInfo> employees = new ArrayList<EmployeeInfo>();
		for(EmployeeInfo employee: employeeMap.values()) {
			if (employeeName.equals(employee.getEmployeeName())) {
				employees.add(employee);
			}
		}
		return employees;
	}

}

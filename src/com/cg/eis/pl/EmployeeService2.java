package com.cg.eis.pl;
import java.util.List;
import com.cg.eis.bean.Employee7;

public class EmployeeService2 {


	public interface EmployeeService {
		
		public boolean insertEmployee(Employee7 e);
		public List<Employee7> getAllEmployees7();
		public List<Employee7> getAllEmployees7byInsurance(String insurance);
		public List<Employee7> getEmployee7ById(int id, String name);

	}

}

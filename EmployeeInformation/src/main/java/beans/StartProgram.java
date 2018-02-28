package beans;

import java.util.Arrays;

import org.omg.CORBA.Context;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartProgram {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new
				AnnotationConfigApplicationContext("BeanConfiguration.class");

		//ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans/BeanConfig.java");
		
		EmployeeService employeeService = context.getBean("employeeService", EmployeeService.class);

		System.out.println(employeeService.getEmployee("mark"));
		employeeService.changePayRate("mark", 20);
		System.out.println(employeeService.getEmployee("mark"));
	
		/*System.out.println("Bean names: " + 
				   Arrays.toString(context.getBeanNamesForType(EmployeeDao.class)));
		*/
	
	}

}

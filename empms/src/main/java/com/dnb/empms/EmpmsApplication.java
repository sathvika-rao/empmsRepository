package com.dnb.empms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.dnb.empms.dto.Employee;
import com.dnb.empms.repo.EmployeeRepository;

@SpringBootApplication
public class EmpmsApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(EmpmsApplication.class, args);
		EmployeeRepository employeeRepository = applicationContext.getBean(EmployeeRepository.class);
		
		Employee emp1 = new Employee("Sathvika", "VBO", 10000);
		Employee emp2 = new Employee("Akhila", "VBO", 20000);
		Employee emp3 = new Employee("Sravya", "VBO", 30000);
		
		employeeRepository.save(emp1);
//		employeeRepository.save(emp2);
//		employeeRepository.save(emp3);
		
//		List<Employee> emps = new ArrayList<Employee>();
//		emps = employeeRepository.findByNameLike("S%");
//		emps.forEach(e->System.out.println(e));
//		
		/*Employee emp = employeeRepository.findTopByOrderBySalaryDesc();
		System.out.println(emp);*/
		
		
//		List<Object[]> list = employeeRepository.findMaxSalaryByDept();
//		list.forEach(e-> {
//			//System.out.println(e[0]+" "+e[1]);
//			System.out.println(Arrays.toString(e));
//			
//		});
		
		
		
		
	}

}

package com.dnb.empms.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dnb.empms.dto.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>{
	//select * from employee where dept = "" - to retrieve details based on dept name
	List<Employee> findByDept(String deptName);
	
	//select * from employee where salary>?
	List<Employee> findBySalaryGreaterThan(int salary);
	
	//retriever records from particular dept whose salary is less than something
	//select * from employee where dept=? and salary<?
	List<Employee> findByDeptAndSalaryLessThan(String deptName, int salary);
	
	//select * from employee where MAX(salary) - sort salary in descending order and get the top one
	//select top 1 * from employee order by salary desc
	Employee findTopByOrderBySalaryDesc();
	//getting top 3
	List<Employee> findTop3ByOrderBySalaryDesc();
	List<Employee> findTop3ByOrderBySalaryAsc();
	
	//first
	List<Employee> findFirst2BySalary(int salary);
	List<Employee> findFirst2ByDeptOrderBySalaryDesc(String deptName);
	
	//prints all
	List<Employee> findBy();
	
	//range
	List<Employee> findBySalaryBetween(int min, int max);
	
	//groupBy
	
	//Pattern
	List<Employee> findByNameLike(String likeString);
	List<Employee> findByDeptLike(String likeString);
	
	//count
	long countByDept(String deptName);
	
	//max salary in respective dept
	//select dept, max(salary) from employee by dept
	
	@Query("SELECT e.dept, MAX(e.salary) FROM Employee e GROUP BY e.dept")
	List<Object[]> findMaxSalaryByDept();
	
}

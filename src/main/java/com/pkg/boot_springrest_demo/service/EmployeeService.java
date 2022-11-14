package com.pkg.boot_springrest_demo.service;

import java.util.List;

import com.pkg.boot_springrest_demo.entity.Employee;

public interface EmployeeService {
	
	public List<Employee> getAllDetail();
	
	public Employee getDetail(int id);
	
	public void add(Employee emp);
	
	public void deleteById(int id);

}

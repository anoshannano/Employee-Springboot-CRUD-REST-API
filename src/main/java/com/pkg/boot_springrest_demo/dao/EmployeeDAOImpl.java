package com.pkg.boot_springrest_demo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.pkg.boot_springrest_demo.entity.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	private EntityManager entitymanager;
	
	@Autowired
	public EmployeeDAOImpl(EntityManager entitymanager) {
		this.entitymanager = entitymanager;
	}
	
	
	@Override
	public List<Employee> getAllDetail() {
		
		Session session = entitymanager.unwrap(Session.class);
		List<Employee> resultList = session.createQuery("from Employee",Employee.class).getResultList();
		
		return resultList;
	}


	@Override
	public Employee getDetail(int id) {

		Session session  = entitymanager.unwrap(Session.class);
		Employee emp = session.get(Employee.class,id);
		return emp;
	}


	@Override
	public void add(Employee emp) {
		Session session  = entitymanager.unwrap(Session.class);
		session.saveOrUpdate(emp);
	}


	@Override
	public void deleteById(int id) {
		Session session  = entitymanager.unwrap(Session.class);
		Employee emp = session.get(Employee.class,id);
		session.delete(emp);
	}

}

package ua.lviv.lgs.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import ua.lviv.lgs.dao.DepartmentDao;
import ua.lviv.lgs.model.Department;
import ua.lviv.lgs.service.DepartmentService;

public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	public DepartmentDao dao;
		
	@Override
	@Transactional
	public void addDepartments(Department departments) {
		dao.save(departments);
	}

	@Override
	public void viewAllDepartments() {
		dao.findAll();
	}

	@Override
	@Transactional
	public void deleteDepartments(Integer id) {
		dao.delete(id);
	}

}

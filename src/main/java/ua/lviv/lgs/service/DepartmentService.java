package ua.lviv.lgs.service;

import ua.lviv.lgs.model.Department;

public interface DepartmentService {
	public void addDepartments(Department departments);
	public void viewAllDepartments();
	public void deleteDepartments(Integer id);
}

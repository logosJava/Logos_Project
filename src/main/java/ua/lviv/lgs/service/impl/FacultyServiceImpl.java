package ua.lviv.lgs.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import ua.lviv.lgs.dao.FacultyDao;
import ua.lviv.lgs.model.Faculty;
import ua.lviv.lgs.service.FacultyService;

public class FacultyServiceImpl implements FacultyService  {
	
	@Autowired
	public FacultyDao dao;
	
	@Override
	@Transactional
	public void addFaculty(Faculty faculty) {
		dao.save(faculty);
	}

	@Override
	public void viewAllFacultyies() {
		dao.findAll();
	}

	@Override
	@Transactional
	public void deleteFaculty(Integer id) {
		dao.delete(id);
	}

}

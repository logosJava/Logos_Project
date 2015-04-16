package ua.lviv.lgs.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import ua.lviv.lgs.dao.SubjectsDao;
import ua.lviv.lgs.model.Subjects;
import ua.lviv.lgs.service.SubjectsService;

public class SubjectsServiceImpl implements SubjectsService {
	
	@Autowired
	public SubjectsDao dao;
	
	@Override
	@Transactional
	public void addSubjects(Subjects subjects) {
		dao.save(subjects);
	}

	@Override
	public void viewAllSubjects() {
		dao.findAll();
	}

	@Override
	@Transactional
	public void deleteSubjects(Integer id) {
		dao.delete(id);
	}

}

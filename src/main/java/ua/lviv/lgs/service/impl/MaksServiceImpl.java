package ua.lviv.lgs.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import ua.lviv.lgs.dao.MarksDao;
import ua.lviv.lgs.model.Marks;
import ua.lviv.lgs.service.MarksService;

public class MaksServiceImpl implements MarksService {
	
	@Autowired
	public MarksDao dao;
	
	@Override
	@Transactional
	public void addMarks(Marks marks) {
		dao.save(marks);
	}

	@Override
	public void viewMarksforAllSubjects() {
		dao.findAll();
	}

	@Override
	@Transactional
	public void deleteMarks(Integer id) {
		dao.delete(id);
	}

}

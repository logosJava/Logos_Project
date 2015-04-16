package ua.lviv.lgs.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import ua.lviv.lgs.dao.SubjectAndCourseDao;
import ua.lviv.lgs.model.SubjectAndCourse;
import ua.lviv.lgs.service.SubjectAndCourseService;

public class SubjectAndCourseServiceImpl implements SubjectAndCourseService {
	@Autowired
	public SubjectAndCourseDao dao;
	
	@Override
	@Transactional
	public void addSubjectAndCourses(SubjectAndCourse subjectAndCourse) {
		dao.save(subjectAndCourse);
	}

	@Override
	public void viewAllSubjectAndCourses() {
		dao.findAll();
	}

	@Override
	@Transactional
	public void deleteSubjectAndCourses(Integer id) {
		dao.delete(id);
	}

}

package ua.lviv.lgs.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import ua.lviv.lgs.dao.TeachersDao;
import ua.lviv.lgs.model.Teachers;
import ua.lviv.lgs.service.TeachersService;

@Service("teachersService")
public class TeachersServiceImpl implements TeachersService {
	@Autowired
	private TeachersDao dao;

	@Override
	public Iterable<Teachers> viewAllTeachers() {
				return dao.findAll();
	}

	@Override
	@Transactional
	public void addTeacher(Teachers teacher) {
		dao.save(teacher);
		
	}

	@Override
	@Transactional
	public Teachers editTeacher(Integer id, Teachers teacher) {
		 Teachers newTeacher = (Teachers) dao.findOne(id);
		 newTeacher.setFirstName(teacher.getFirstName());
		 newTeacher.setLastName(teacher.getLastName());
		 newTeacher.setYearOfBirth(teacher.getYearOfBirth());
		 newTeacher.setCourse(teacher.getCourse());
		 newTeacher.setDepartments(teacher.getDepartments());
		return (Teachers) dao.save(newTeacher);
	}

	@Override
	@Transactional
	public Iterable<Teachers> sortTeacherByName(Sort firstName) {
		return dao.findAll(firstName);
	}

	@Override
	@Transactional
	public Page<Teachers> filterTeacherByName(Pageable firstName) {
		return dao.findAll(firstName);
	}

	@Override
	public Iterable<Teachers> sortTeacherByDepartment(Sort departments) {
		return dao.findAll(departments);
	}
}

package ua.lviv.lgs.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import ua.lviv.lgs.dao.StudentsDao;
import ua.lviv.lgs.model.Marks;
import ua.lviv.lgs.model.Students;
import ua.lviv.lgs.model.Subjects;
import ua.lviv.lgs.service.StudentsService;

@Service("studentsService")
public class StudentsServiceImpl implements StudentsService {

	@Autowired
	private StudentsDao dao;

	@Override
	public Iterable<Students> viewAllStudents() {
		return dao.findAll();
	}

	@Override
	@Transactional
	public void addStudent(Students student) {
		 dao.save(student);
		
	}

	@Override
	public Students editStudent(Integer id, Students student) {
		Students newStudent = (Students) dao.findOne(id);
		newStudent.setFirstName(student.getFirstName());
		newStudent.setLastName(student.getLastName());
		newStudent.setYearOfBirth(student.getYearOfBirth());
		newStudent.setCourse(student.getCourse());
		newStudent.setIdDepartment(student.getIdDepartment());
		newStudent.setMarks(student.getMarks());
		return (Students) dao.save(newStudent);
		
	}

	@Override
	@Transactional
	public Iterable<Students> sortStudentsByName(Sort firstName) {
		return dao.findAll(firstName);
	}

	@Override
	public Page<Students> filteredByName(Pageable firstName) {
		return dao.findAll(firstName);
	}

	@Override
	public void addMarkToStudent(Integer id,  Students student, List<Marks> marks) {
		Students studentWithAddedMark = (Students)dao.findOne(id);
		studentWithAddedMark.setMarks(marks);
		dao.save(studentWithAddedMark);
		}
	

}

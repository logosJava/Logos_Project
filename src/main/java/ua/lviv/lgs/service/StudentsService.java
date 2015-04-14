package ua.lviv.lgs.service;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import ua.lviv.lgs.model.Marks;
import ua.lviv.lgs.model.Students;
import ua.lviv.lgs.model.Subjects;

public interface StudentsService {
	public Iterable<Students> viewAllStudents();
	public void addStudent(Students student);
	public Students editStudent(Integer id, Students student);
	public Iterable<Students> sortStudentsByName(Sort firstName);
	public Page <Students> filteredByName(Pageable firstName); 
	public void addMarkToStudent(Integer id, Students student, List<Marks> marks);
}

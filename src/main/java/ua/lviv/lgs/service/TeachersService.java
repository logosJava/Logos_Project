package ua.lviv.lgs.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import ua.lviv.lgs.model.Teachers;

public interface TeachersService {
	
	public Iterable<Teachers> viewAllTeachers();
	public void addTeacher(Teachers teacher);
	public Teachers editTeacher(Integer id, Teachers teacher);
	public Iterable<Teachers> sortTeacherByName(Sort firstName);
	public Page<Teachers> filterTeacherByName(Pageable firstName);
	}

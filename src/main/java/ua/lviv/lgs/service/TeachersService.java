package ua.lviv.lgs.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import ua.lviv.lgs.model.Teachers;

public interface TeachersService {
	
	public Iterable<Teachers> viewAllTeachers();
	public void addTeacher(Teachers teacher);
	public void editTeacher(Integer id, Teachers teacher);
	/*public Iterable<Teachers> sortTeacherByParametr(Sort parametr);
	public Page<Teachers> filterTeacherByParametr(Pageable parametr);*/
	public void deleteTeacher(Integer id);
	}

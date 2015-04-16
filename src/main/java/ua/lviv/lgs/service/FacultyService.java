package ua.lviv.lgs.service;

import ua.lviv.lgs.model.Faculty;

public interface FacultyService {
	public void addFaculty(Faculty faculty);
	public void viewAllFacultyies();
	public void deleteFaculty(Integer id);
}

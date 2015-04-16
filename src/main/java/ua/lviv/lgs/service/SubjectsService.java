package ua.lviv.lgs.service;

import ua.lviv.lgs.model.Subjects;

public interface SubjectsService {
	public void addSubjects(Subjects subjects);
	public void viewAllSubjects();
	public void deleteSubjects(Integer id);
}

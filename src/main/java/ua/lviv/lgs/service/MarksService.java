package ua.lviv.lgs.service;

import ua.lviv.lgs.model.Marks;

public interface MarksService {
	public void addMarks(Marks marks);
	public void viewMarksforAllSubjects();
	public void deleteMarks(Integer id);
}

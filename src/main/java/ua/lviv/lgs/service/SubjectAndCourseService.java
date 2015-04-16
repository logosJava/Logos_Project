package ua.lviv.lgs.service;

import ua.lviv.lgs.model.SubjectAndCourse;

public interface SubjectAndCourseService {
	public void addSubjectAndCourses(SubjectAndCourse subjectAndCourse);
	public void viewAllSubjectAndCourses();
	public void deleteSubjectAndCourses(Integer id);
}


package ua.lviv.lgs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="subjectAndCourse")
public class SubjectAndCourse {
	
	@Id
	@GeneratedValue
	@Column(name="id_subjectAndCourse")
	private int id;
	
	@Column
	private int course;
	
	@ManyToOne
	@JoinColumn(name="id_department")
	private Department department;
	
	@ManyToOne
	@JoinColumn(name="id_subjects")
	private Subjects subjects;
	
	public SubjectAndCourse() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Subjects getSubjects() {
		return subjects;
	}

	public void setSubjects(Subjects subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "SubjectAndCourse [id=" + id + ", course=" + course
				+ ", department=" + department + ", subjects=" + subjects + "]";
	}
	
	
	
}

package ua.lviv.lgs.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department {
	
	@Id
	@GeneratedValue
	@Column(name="id_department")
	private int id;
	
	@Column
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "id_faculty")
	private Faculty faculty;
	
	@OneToMany(mappedBy="department", fetch = FetchType.EAGER)
	private Set<SubjectAndCourse> subjectAndCourse;
	
	@ManyToOne()
	@JoinColumn(name="id_Student")
	private Students student;
	
	@ManyToOne()
	@JoinColumn(name="id_Teacher")
	private Teachers teacher;
	
	public Department() {
		
	}
	
	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
	
	
	
}

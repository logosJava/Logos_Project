package ua.lviv.lgs.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Students {
	
	@Id
	@GeneratedValue
	@Column(name="id_Student")
	private int id;
	
	@Column
	private String firstName;
	
	@Column
	private String lastName;
	
	@Column
	private int yearOfBirth;
	
	@Column
	private int course;
	
	@Column
	private String urlPicture;
	
	@ManyToOne()
	@JoinColumn(name="id_department")
	private Department department;
	
	@ManyToMany()
	@JoinTable(name="Students_Marks", joinColumns={@JoinColumn(name="id_students")},inverseJoinColumns={@JoinColumn(name="id_mark")}) 
	private List<Marks> marks;
	
	
	public Students() {
		
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	
	public void setUrlPicture(String urlPicture) {
		this.urlPicture = urlPicture;
	}
	
		
	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}
	
		public List<Marks> getMarks() {
		return marks;
	}

	public void setMarks(List<Marks> marks) {
		this.marks = marks;
	}

	

	public Department getDepartments() {
		return department;
	}

	public void setDepartments(Department departments) {
		this.department = department;
	}

	public String toString() {
		return ("Detailed information about this Student: 1. Student's ID: " + id + "2. Student's First Name: "
				+ firstName + "3. Student's Last Name: " + lastName +  
				"4. Student's Year of Birth: " + yearOfBirth + "5. Student's course"+
				course + "6.Department, on which student studies: " + department + 
				 "7. Student's marks" + marks + "8. Student's photo:");
	}
}

package ua.lviv.lgs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="marks")
public class Marks {
	
	@Id
	@GeneratedValue
	@Column(name="id_marks")
	private int id;
	
	@Column
	private int value;
	
	@ManyToOne
	@JoinColumn(name="id_students")
	private Students student;
	
	@ManyToOne
	@JoinColumn(name="id_subjects")
	private Subjects subject;
	
	public Marks() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Students getStudent() {
		return student;
	}

	public void setStudent(Students student) {
		this.student = student;
	}

	public Subjects getSubject() {
		return subject;
	}

	public void setSubject(Subjects subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Marks [id=" + id + ", value=" + value + ", student=" + student
				+ ", subject=" + subject + "]";
	}
	
	
	
}

package ManyToOne.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "Student_Name", nullable=true)
	private String studentName;
	
	@Column(name = "Student_Phone", nullable=true)
	private long phone;
	
	@ManyToOne
	private College college;
	
	public Student() {
		//no argument constructor
	}

	public Student(String studentName, long phone, College college) {
		super();
		this.studentName = studentName;
		this.phone = phone;
		this.college = college;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + ", phone=" + phone + ", college=" + college + "]";
	}
	
}

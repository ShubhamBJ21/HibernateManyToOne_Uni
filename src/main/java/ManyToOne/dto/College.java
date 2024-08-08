package ManyToOne.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class College {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="College_Name", nullable = true)
	private String collegeName;
	
	@Column(name="College_Address", nullable = true)
	private String address;
	
	public College() {
		//no argument constructor
	}

	public College(String collegeName, String address) {
		super();
		this.collegeName = collegeName;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "College [id=" + id + ", collegeName=" + collegeName + ", address=" + address + "]";
	}
	
	
}

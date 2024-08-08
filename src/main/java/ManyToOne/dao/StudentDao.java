package ManyToOne.dao;

import java.util.List;

import ManyToOne.dto.College;
import ManyToOne.dto.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class StudentDao {

	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("shubham").createEntityManager();
	}

	public void saveStudent(Student student) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Student student1 = entityManager.find(Student.class, student.getId());

		if (student1 == null) {
			entityTransaction.begin();
			College college = student.getCollege();
			entityManager.persist(college);
			entityManager.persist(student);
			entityTransaction.commit();
			System.out.println("Student details saved successfully");
		} else {
			System.out.println("Student is already in college, please just update its details");
		}
	}

	public void updateStudent(Student student, int id) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Student student1 = entityManager.find(Student.class, id);

		if (student1 != null) {
			entityTransaction.begin();

			student.setId(student1.getId());
			student.setCollege(student1.getCollege());
			entityManager.merge(student);
			entityTransaction.commit();
			System.out.println("Student details updated");
		} else {
			System.out.println("Oops! Student is not from your college");
		}
	}

	public void removeStudent(int id) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Student student = entityManager.find(Student.class, id);

		if (student != null) {
			entityTransaction.begin();
			entityManager.remove(student);
			entityTransaction.commit();
			System.out.println("Student details removed from table");
		} else {
			System.out.println("Student not found");
		}
	}

	public void getStudentById(int id) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		Student student = entityManager.find(Student.class, id);
		System.out.println(student);
		entityTransaction.commit();
	}
	
	public List<Student> getAllStudent() {
		EntityManager entityManager = getEntityManager();
		Query query = (Query) entityManager.createQuery("SELECT s FROM Student s");
		List<Student> list = query.getResultList();
		return list;
	}
}

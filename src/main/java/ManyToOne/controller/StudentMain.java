package ManyToOne.controller;

import ManyToOne.dao.StudentDao;
import ManyToOne.dto.College;
import ManyToOne.dto.Student;

public class StudentMain {

    public static void main(String[] args) {
        // Create a College instance
        College college = new College();
        college.setCollegeName("SAE");
        college.setAddress("Pune");

        // Create a Student instance
        Student s1 = new Student();
       // s1.setStudentName("Shubham Jadhav");
       // s1.setPhone(8830086429L);
       // s1.setCollege(college);

        // Initialize DAO
        StudentDao dao = new StudentDao();

        // Save the student
        // dao.saveStudent(s1);

        // Remove a student by ID (example ID = 2)
        // dao.removeStudent(2);

        // Update student details
         
        Student s2 = new Student();
        
//        s2.setPhone(7894561230l);
//        //s2.setStudentName("Shubham Ghadhave");
//       // s2.setPhone(9172813479L);
//       // s2.setCollege(college);
//        
//        //dao.saveStudent(s2);
//        
////        s2.setPhone(9021864521L);
//        
//        s2.setStudentName("Prajwal");
//        dao.updateStudent(s2, 3);
        
    }
}

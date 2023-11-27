// Package declaration specifying the location of the application within the project's directory structure
package com.brogramming.cruddemo;

// Importing necessary classes
import com.brogramming.cruddemo.dao.StudentDAO;
import com.brogramming.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

// The SpringBootApplication annotation combines multiple annotations to configure the application
@SpringBootApplication
public class CruddemoApplication {

	// Main method to run the Spring Boot application
	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	// Bean annotation indicates that a method produces a bean to be managed by the Spring container
	@Bean
	// CommandLineRunner interface allows running additional code on startup
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){

		// Lambda expression representing the run method of the CommandLineRunner interface
		return runner -> {
			// Uncomment the following lines to execute specific operations

			// createStudent(studentDAO);
			// createMultipleStudents(studentDAO);
			// readStudent(studentDAO);
			// queryForStudents(studentDAO);
			// queryForStudentsByLastName(studentDAO);
			// updateStudent(studentDAO);
			// deleteStudent(studentDAO);
		};
	}

	// Method to delete a student by ID
	private void deleteStudent(StudentDAO studentDAO) {
		int studentId = 4;
		System.out.println("Deleting Student Id: " + studentId);
		studentDAO.delete(studentId);
	}

	// Method to update a student's information
	private void updateStudent(StudentDAO studentDAO) {
		int studentId = 1;
		System.out.println("Getting student with id: " + studentId);
		Student myStudent = studentDAO.findById(studentId);

		System.out.println("Updating student...");
		myStudent.setFirstName("Ömer");
		myStudent.setEmail("omercetin566@gmail.com");

		studentDAO.update(myStudent);

		System.out.println("Updated student: " + myStudent);
	}

	// Method to query and display students by last name
	private void queryForStudentsByLastName(StudentDAO studentDAO) {
		List<Student> theStudents = studentDAO.findByLastName("Demir");

		System.out.println("List of students with the last name 'Demir':");
		for (Student tempStudent : theStudents) {
			System.out.println(tempStudent);
		}
	}

	// Method to query and display all students
	private void queryForStudents(StudentDAO studentDAO) {
		List<Student> theStudents = studentDAO.findAll();

		System.out.println("List of all students:");
		for (Student tempStudent : theStudents) {
			System.out.println(tempStudent);
		}
	}

	// Method to read and display a specific student
	private void readStudent(StudentDAO studentDAO) {
		System.out.println("Creating a new student object...");
		Student tempStudent = new Student("Mehmet", "Gezer", "traveller@gmail.com");

		System.out.println("Saving the student...");
		studentDAO.save(tempStudent);

		int theId = tempStudent.getId();
		System.out.println("Saved student. Generated id: " + theId);

		System.out.println("Retrieving student with id: " + theId);
		Student myStudent = studentDAO.findById(theId);

		System.out.println("Found the student: " + myStudent);
	}

	// Method to create and save multiple students
	private void createMultipleStudents(StudentDAO studentDAO) {
		System.out.println("Creating new students objects...");
		Student tempStudent1 = new Student("Salih", "Bahtiyar", "cef@gmail.com");
		Student tempStudent2 = new Student("Ahmet", "Sevdi", "def@gmail.com");
		Student tempStudent3 = new Student("Mahmut", "Algal", "abc@gmail.com");

		System.out.println("Saving the students...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);
	}

	// Method to create and save a single student
	private void createStudent(StudentDAO studentDAO) {
		System.out.println("Creating a new student object...");
		Student tempStudent = new Student("Nihat", "Çetin", "nihatcetin0143@gmail.com");

		System.out.println("Saving the student...");
		studentDAO.save(tempStudent);

		System.out.println("Saved student. Generated id: " + tempStudent.getId());
	}
}

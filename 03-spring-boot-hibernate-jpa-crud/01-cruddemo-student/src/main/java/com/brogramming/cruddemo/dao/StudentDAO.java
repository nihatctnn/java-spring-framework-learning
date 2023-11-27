// Package declaration indicating the location of the interface within the project's directory structure
package com.brogramming.cruddemo.dao;

// Importing the Student entity class and the List interface from Java's util package
import com.brogramming.cruddemo.entity.Student;
import java.util.List;

// Definition of the StudentDAO interface
public interface StudentDAO {

    // Method signature for saving a student entity to the database
    void save(Student theStudent);

    // Method signature for finding a student by their ID in the database
    Student findById(Integer id);

    // Method signature for retrieving a list of all students from the database
    List<Student> findAll();

    // Method signature for finding a list of students by their last name in the database
    List<Student> findByLastName(String theLastName);

    // Method signature for updating a student entity in the database
    void update(Student theStudent);

    // Method signature for deleting a student by their ID from the database
    void delete(Integer id);
}

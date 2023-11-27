// Package declaration specifying the location of the interface within the project's directory structure
package com.brogramming.cruddemo.dao;

// Importing necessary classes
import com.brogramming.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

// The Repository annotation indicates that the class serves as a Data Access Object (DAO)
@Repository
public class StudentDAOImpl implements StudentDAO {

    // Define the field for the entity manager
    private EntityManager entityManager;

    // Inject the entity manager using constructor injection
    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    // Implement the save method
    @Override
    @Transactional
    public void save(Student theStudent) {
        entityManager.persist(theStudent);
    }

    // Method to find a student by a given ID in the database
    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class, id);
    }

    // Method to retrieve a list of all students from the database
    @Override
    public List<Student> findAll() {
        // Create a query
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student", Student.class);

        // Return the query results
        return theQuery.getResultList();
    }

    // Method to find a list of students by their last name in the database
    @Override
    public List<Student> findByLastName(String theLastName) {
        // Create a query
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student WHERE lastName=:theData", Student.class);

        // Set query parameters
        theQuery.setParameter("theData", theLastName);

        // Return the query results
        return theQuery.getResultList();
    }

    // Method to update a student entity in the database
    @Override
    @Transactional
    public void update(Student theStudent) {
        entityManager.merge(theStudent);
    }

    // Method to delete a student by their ID from the database
    @Override
    @Transactional
    public void delete(Integer id) {
        // Retrieve the student
        Student theStudent = entityManager.find(Student.class, id);

        // Delete the student
        entityManager.remove(theStudent);
    }
}
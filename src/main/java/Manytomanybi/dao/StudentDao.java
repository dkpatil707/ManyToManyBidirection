package Manytomanybi.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Manytomanybi.dto.Course;
import Manytomanybi.dto.Student;


public class StudentDao {

	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("vinod").createEntityManager();
		
	}
	
	public void updateStudent(int id,Student student)
	{
		EntityManager entityManager= getEntityManager();
		Student  dbStudent = entityManager.find(Student.class,id);
		
		if(dbStudent != null) {
			
			EntityTransaction entityTransaction =entityManager.getTransaction();
			entityTransaction.begin();
			student.setId(id);
			student.setCourse(dbStudent.getCourse());
			entityManager.merge(student);
			entityTransaction.commit();
		}else {
			System.out.println("Id Not Match in update");
		}
	}
	
	public void findStudent(int id) {
		EntityManager entityManager= getEntityManager();
		Student dbStudent  = entityManager.find(Student.class,id);
		if(dbStudent !=null) {
			System.out.println(dbStudent);
		}
		else
		{
			System.out.println("Sorry id is not Present");
		}
			
	}
	
	public void deleteStudent(int id) {
		EntityManager entityManager= getEntityManager();
		 Student dbStudent  = entityManager.find(Student.class,id);
		if(dbStudent !=null) {
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(dbStudent);
			entityTransaction.commit();
		}else
		{
			System.out.println("Soory id not prisent");
		}
		
	}
		
		
	}
	
	


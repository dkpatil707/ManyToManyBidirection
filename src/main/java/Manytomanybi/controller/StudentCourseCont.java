package Manytomanybi.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Manytomanybi.dao.CourseDao;
import Manytomanybi.dao.StudentDao;
import Manytomanybi.dto.Course;
import Manytomanybi.dto.Student;

public class StudentCourseCont {

	public static void main(String[] args) {

//		Student student3 = new Student();
//		student3.setId(3);
//		student3.setName("Harshada");
//		student3.setAddress("Pune");
		
//		Student student4 = new Student();
//		student4.setId(4);
//		student4.setName("	Manoj");
//		student4.setAddress("jalgaon");
//		
//		
//		Course course2=new Course();
//		course2.setId(2);
//		course2.setName("React");
//		course2.setFees(3202);

//		Course course4=new Course();
//		course4.setId(4);
//		course4.setName("Web technology");
//		course4.setFees(29000);
//		
//		
//		List<Course> courses= new ArrayList<Course>();
//		courses.add(course2);
//		courses.add(course4);
		
//		student3.setCourse(courses);
//		student4.setCourse(courses);
		
//		
//		List<Student>students = new ArrayList<Student>();	
//		students.add(student3);
//		students.add(student4);
//
//		course2.setStudents(students);
//		course4.setStudents(students);
//		
//		
//		
//		
//		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
//		EntityManager entityManager= entityManagerFactory.createEntityManager();
//		EntityTransaction entityTransaction=entityManager.getTransaction();
//		
//    	entityTransaction.begin();
//    	entityManager.persist(course2);
//    	entityManager.persist(course4);
//    	entityManager.persist(student3);
//    	entityManager.persist(student4);
//
//    	entityTransaction.commit();
    	
		
//deleted student  course
		
//    	StudentDao studentdao = new StudentDao();
//    	studentdao.deleteStudent(3);
    	
//    	CourseDao courseDao =new CourseDao();
//    	courseDao.deleteCourse(2);
    	
//find  Student   course
//    	StudentDao studentDao = new StudentDao() ;
//    	studentDao.findStudent(1);
    	
//    	CourseDao courseDao =new CourseDao();
//    	courseDao.findCourse(4);
    	
    	
//Update Student Course
    	
//    	Course course1=new Course();
//		course1.setName("Corejava");
//		course1.setFees(3000);
//    	CourseDao courseDao =new CourseDao();
//    	courseDao.updateCourse(1, course1);
		
		
//		Student student=new Student();
//		student.setName("Darshan");
//		student.setAddress("Pune");	
//		StudentDao studentDao=new StudentDao();
//		studentDao.updateStudent(1, student);
		
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		entityManager.find(Student.class,1);
		entityManager.find(Student.class,1);
		entityManager.find(Student.class,1);
		entityManager.find(Student.class,1);
		entityManager.find(Student.class,1);

		
		EntityManager entityManager1=entityManagerFactory.createEntityManager();
		
		entityManager1.find(Student.class,1);
		entityManager1.find(Student.class,1);
		entityManager1.find(Student.class,1);
		entityManager1.find(Student.class,1);
		entityManager1.find(Student.class,1);

			
	}

}

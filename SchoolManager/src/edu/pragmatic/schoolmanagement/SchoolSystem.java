package edu.pragmatic.schoolmanagement;

import edu.pragmatic.schoolmodel.Class;
import edu.pragmatic.schoolmodel.Discipline;
import edu.pragmatic.schoolmodel.Student;
import edu.pragmatic.schoolmodel.Teacher;

public class SchoolSystem {
	
	public Student createNewStudent(String name, String lastName){
		Student student = new Student(name, lastName);
		System.out.println("Creating " + student.getFullName());
		return student;
	}
	
	public Teacher createNewTeacher(String name, String lastName, String title){
		Teacher teacher = new Teacher(name, lastName, title);
		System.out.println("Creating " + teacher.getFullName());
		return teacher;
	} 

	public Class createNewClass(int number, String index, int maxNumberOfStudentsAttending){
		Class newClass = new Class(number, index, maxNumberOfStudentsAttending);
		System.out.println("Creating " + newClass.getClassName());
		return newClass;
	}
	
	public Discipline createNewDiscipline(String name, int creditsNeeded, Teacher teacher){
		Discipline discipline = new Discipline(name, creditsNeeded, teacher);
		System.out.println("Creating " + discipline.getName());
		return discipline;
	}
	
	public void printSystemInfo(Discipline[] disciplines, Class[] classes){
		if (disciplines == null){
			System.out.println("What I am supposed to print ?");
		}
		System.out.println("===========================================");
		for (int index = 0 ; index < disciplines.length  ; index++){
			for (Discipline discipline : disciplines){
				discipline.printFullInfo();
			}
		}
		System.out.println("===========================================");
		for (Class claz : classes){
			claz.printFullInfo();
		}
		System.out.println("===========================================");
	}
	
}

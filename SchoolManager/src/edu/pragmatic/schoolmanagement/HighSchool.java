package edu.pragmatic.schoolmanagement;

import edu.pragmatic.schoolmodel.Class;
import edu.pragmatic.schoolmodel.Discipline;
import edu.pragmatic.schoolmodel.Student;
import edu.pragmatic.schoolmodel.Teacher;

public class HighSchool {
	
	public static void main(String[] args) {
		SchoolSystem managment = new SchoolSystem(); 
		// let's create a new class
		Class firstAClass = managment.createNewClass(1, "a", 15);
		firstAClass.maxNumberOfStudentsAttending = 15;
		Class fifthBClass = managment.createNewClass(5, "b", 15);
		firstAClass.maxNumberOfStudentsAttending = 15;
		// let's create 5 students
		Student ivanIvanov = managment.createNewStudent("Ivan", "Ivanov");
		Student johnSmith = managment.createNewStudent("John", "Smith");
		Student annaSmith = managment.createNewStudent("Anna", "Smith");
		Student mariaJohn = managment.createNewStudent("Maria", "John");
		Student randomGuy = managment.createNewStudent("Random", "Guy");
		// let's create two teachers
		Teacher physicsTeacher = managment.createNewTeacher("Physics", "Teacher", "Dr");
		Teacher mathsTeacher = managment.createNewTeacher("Maths", "Teacher", "Mrs");
		// let's create two disciplines
		Discipline maths = managment.createNewDiscipline("Maths", 10, mathsTeacher);
		maths.maxClassesToBeTaughtTo = 5;
		Discipline physics = managment.createNewDiscipline("Physics", 12, physicsTeacher);
		physics.maxClassesToBeTaughtTo = 5;
		// let's add some of the students to some of the disciplines
		fifthBClass.addStudent(randomGuy);
		fifthBClass.addStudent(mariaJohn);
		fifthBClass.addStudent(annaSmith);
		physics.addTaughtTo(fifthBClass);
		firstAClass.addStudent(johnSmith);
		firstAClass.addStudent(ivanIvanov);
		maths.addTaughtTo(firstAClass);
		// print full info
		managment.printSystemInfo( new Discipline[]{ maths, physics}, new Class[]{ firstAClass, fifthBClass });
	}

}

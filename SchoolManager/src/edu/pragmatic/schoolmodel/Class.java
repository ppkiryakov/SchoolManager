package edu.pragmatic.schoolmodel;

public class Class {
	
	public Student[] studentsAttending;
	public int number; 
	public String index;
	public int maxNumberOfStudentsAttending;
	
	public Class(int number, String index, int maxNumberOfStudentsAttending){
		this.number = number;
		this.index = index;
		this.maxNumberOfStudentsAttending = maxNumberOfStudentsAttending;
		studentsAttending = new Student[maxNumberOfStudentsAttending];
	}
	
	public void addStudent(Student student){
		for(int index = 0; index < studentsAttending.length ; index++){
			if (studentsAttending[index] == null){ // this cell hasn't been yet initialized 
				studentsAttending[index] = student;
				student.setNumber( index + 1 );
				System.out.println("Adding " + student.getFullName() + " to " + getClassName());
				return ; // we need to stop the execution of this for and this method
			}
		}
		
		System.out.println("No more room in this class");
	}
	
	public String getClassName(){
		return number + index.toLowerCase() ;
	}
	
	public int getMaxAttendantsNumber(){
		return maxNumberOfStudentsAttending;
	}

	public void printFullInfo() {
		System.out.println(getClassName() + " : ");
		for(int index = 0 ; index < studentsAttending.length ; index++){
			Student student = studentsAttending[index];
			if (student != null){
				System.out.println(student.getFullName() + " number " + student.getNumber());	
			}
		}
	}

}

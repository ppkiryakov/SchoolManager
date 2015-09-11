package edu.pragmatic.schoolmodel;

public class Discipline {
	
	public String name;
	public int creditsNeededToSuccefullyFinish;
	public Teacher primaryTeacher;
	public Class[] taughtTo;
	public int maxClassesToBeTaughtTo;
	
	public Discipline(String name, int creditsNeeded, Teacher teacher) {
		this.name = name;
		creditsNeededToSuccefullyFinish = creditsNeeded;
		primaryTeacher = teacher;
		maxClassesToBeTaughtTo = 10;
		taughtTo = new Class[maxClassesToBeTaughtTo]; // magic number it doesn't mean anything it's just a number
	}
	
	public void addTaughtTo(Class classTaughtTo){
		for (int index = 0; index < taughtTo.length; index++){
			if (taughtTo[index] == null) {
				taughtTo[index] = classTaughtTo;
				System.out.println(name + " will be taught to " + classTaughtTo.getClassName() );
				return;
			}
		}
		
		System.out.println("This discipline can't be taught to any more classes");
	}

	public String getName(){
		return name + " taught by " + primaryTeacher.getFullName();
	}
	
	public void printFullInfo(){
		System.out.println("==============Info for "+ name  + " ==============");
		System.out.println("Taught by : " + primaryTeacher.getFullName());
		System.out.print("Taught to : " ); 
		for(int index = 0 ; index < taughtTo.length ; index++){
			if (taughtTo[index] != null){
				System.out.print(taughtTo[index].getClassName() + " ");
			}
		}
		System.out.println();
		System.out.println("==================================================");
	}
	
}

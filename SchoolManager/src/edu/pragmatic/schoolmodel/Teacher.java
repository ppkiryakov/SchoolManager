package edu.pragmatic.schoolmodel;

public class Teacher {
	
	public String name;
	public String lastName;
	public String title;
	public int maxNumberOfDiscpilesTaught;
	public Discipline[] teaching;
	
	public Teacher(String name, String lastName, String title) {
		this.name = name;
		this.lastName = lastName;
		this.title = title;
		maxNumberOfDiscpilesTaught = 10;
		teaching = new Discipline[maxNumberOfDiscpilesTaught];
	}
	
	public void teach(Discipline discipline){
		for (int index = 0; index < teaching.length ; index++){
			if (teaching[index] == null){
				teaching[index] = discipline;
				return ;
			}
		}
		
		System.out.println("This teacher can't teach any more disciplines");
	}
	
	
	public String getFullName(){
		return title + " " + name + " " + lastName;
	}
	
}

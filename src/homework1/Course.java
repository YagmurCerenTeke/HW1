package homework1;

public class Course {

	public Course() {
		
	}
	
	public Course(String name,	double price,	String instructorName,	double length,	double completed) {
		this.name = name;
		this.price = price;
		this.instructorName = instructorName;
		this.length = length;
		this.completed = completed;
	}
	
	String name;
	double price;
	String instructorName;
	double length;
	double completed;
	
}

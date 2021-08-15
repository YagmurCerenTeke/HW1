package homework1;

public class CourseService {
	
	Course course = new Course();
	double completionRate = course.completed*100/course.length;
	
	public void isStarted(Course course) {
		if(course.completed > 0) {
			course.price = completionRate;
		}
	}

	public double completionRate(Course course) {
		return course.completed*100/course.length; 
	}
	
	public void addCourse(Course course) {
		System.out.println("New course is available : " + course.name);
	}
}

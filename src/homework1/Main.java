package homework1;

public class Main {

	public static void main(String[] args) {

		Course course1 = new Course();
		course1.name = "Java";
		course1.price = 0;
		course1.instructorName = "Engin Demiroğ";
		course1.length = 120;
		course1.completed = 60;
			
		Course course2 = new Course("Angular", 0, "Engin Demiroğ", 100, 40);
			
		Course[] courses = {course1, course2};
		
	
		
		CourseService courseService = new CourseService();
		
		for(Course course : courses) {
			System.out.println(courseService.completionRate(course));
			courseService.addCourse(course);
		}
		
		Menu menu = new Menu();
		menu.id = 1;
		menu.name = "Kurslarım";
		
		Menu[] menuTitles = {menu};
		
		for(Menu menus: menuTitles) {
			System.out.println("Menü başlıkları: " + menus.name);
		}
	}

}

package followAlong;

class StudentTest {

	public static void main(String[] args) {
		
		//int[] studentIds = new int[] {1001, 1002, 1003};
		
		Student student1 = new Student("joan", "male");
		
		Student student2 = new Student("raj", "male");
		
		Student student3 = new Student("anita", "female");
		
		System.out.println("Name of student1: " + student1.getName());
		System.out.println("Name of student1: " + student2.getName());
		System.out.println("Name of student1: " + student3.getName());		
		
		student1.setName("john");
		System.out.println("Updated name of student1: " + student1.getName());
		System.out.println("Number students created so far " + Student.getStudentCount());
		String[] list = new String[4];
		
//		list[0] = student1;
//		
//		for(Student student : list) {
//			String name = student.getName();
//			String gender = student.getGender();
//			printNameAndGender(name, gender);
//		}
		
		
//		Student student1 = new Student("Joan", "male", 18, 223_456_7890L, 3.8, 'B');
//		 
//		Student student2 = new Student("Raj", "male", 21, 223_456_9999L, 3.4, 'M', true);
//		
//		Student student3 = new Student("Anita", "female", 20, 223_456_8888L, 4.0, 'M', true);
//
//		System.out.println("\nStudent.studentCount: " + Student.studentCount);
//		
//		student1.updateProfile("John");
//		System.out.println("Updated name of student1: " + student1.name);


		/*
		 * System.out.println("\nName of student1: " + student1.name);
		 * System.out.println("Name of student2: " + student2.name);
		 * System.out.println("Name of student3: " + student3.name);
		 */

		

	}
	
	private static void printNameAndGender(String name, String gender) {
		System.out.println("Name: " + name);
		System.out.println("Gender: " + gender);
	}

}
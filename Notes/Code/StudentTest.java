public class StudentTest {
    public static void main(String[] args) {
		Student student1 = new Student(1000, "John", "Male", 21, 9722315698L, 3.8, 'B');
		Student student2 = new Student(1001, "Raj", "Male", 21, 97222215698L, 3.5, 'B', true);
		Student student3 = new Student(1002, "Anita", "Female", 21, 7662315698L, 4.0, 'M', true);

		System.out.println("\nStudent.computeCount: " + Student.studentCount);

		System.out.println("\nName of Student 1: " + student1.name);
		System.out.println("\nName of Student 2: " + student2.name);
		System.out.println("\nName of Student 3: " + student3.name);

		student2.updateProfile("Rajah");
		
		System.out.println("\nName of Student 2: " + student2.name); 

        Student[] students = {student1, student2, student3}; // Assignment, write code/logic that will switch student3 with student1
        
        swap(students, 0, 2);
        System.out.println("\nName of Student 1: " + students[0].name);
		System.out.println("\nName of Student 2: " + students[1].name);
		System.out.println("\nName of Student 3: " + students[2].name);
	}
	
    static void swap(Student[] students, int firstIndex, int secondIndex){
        Student temp = students[firstIndex];
        students[firstIndex] = students[secondIndex];
        students[2] = temp;
    }
    
}

        //index[1]
        //index[2]

          /*Student student4 = student1; // holding the memory address of the student object which makes a copy of the memory address that student 1 is holding and assigns it to student 4
		  System.out.println("\nName of student4: " + student4.name);
		  
		  student4.updateProfile("Mike"); // invoking method updateprofile to update student four's name to Mike which affects the reference to the memory address for student 1 as well
		  System.out.println("Name of student1: " + student1.name);
		
		  student4 = student2; // reassigning student4 with student 2, student 4 = mike, student 2 = rajah which means student4 is referencing the second object
		  System.out.println("Name of student4: " + student4.name);
		
		  student2 = student1;// reassigning student1 with the value of student 2 which means that student 1 is mike
		  System.out.println("Name of student4: " + student4.name);// prints rajaah
		  System.out.println("Name of student2: " + student2.name);// prints mike
		
		  student4 = new Student();
		  student4.updateProfile("Alex");// updates student 4 with alex
		  System.out.println("Name of student4: " + student4.name); // prints Alex
		  System.out.println("Name of student2: " + student2.name); // prints mike
		  System.out.println("Name of student1: " + student1.name);	// prints mike
            // rajah object is not referenced anymore, the object rajah is "abandoned"*/



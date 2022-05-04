  /*
	Instance & Static:
	- Declared at class-level 
	- Scope: Entire class
	- Gets default value
	- Cannot be re-initialized directly within class

	Instance: Represents object state

	- Values are unique to object
	- From outside class: Accessible via object reference

	Static:
	 
	- Values are unique to class ~ One copy per class (shared across objects)
	- From outside class: Accessible via Class Name or object reference

	Instance & static variables are also referred to as fields or attributes. Attributes is probably more commonly associated with instance variables. 
*/
  
class Student {
	static int studentCount;
	
	int id;
	String name;
	String gender;
	int age;
	long phone;	  
	double gpa;	  
	char degree;
	
	boolean international;
	double tuitionFees = 12000.0;
	double internationalFees = 5000.0;
	
	Student(int id, String name, String gender, int age, long phone, double gpa, char degree){ // paramaterized constructor
		this(id, name, gender, age, phone, gpa, degree, false); // invokes a constructor and its parameters, arguments must fulfill parameter list
	}
	Student(int id, String name, String gender, int age, long phone, double gpa, 
	char degree, boolean international){ // paramaterized constructor
		this.id = id;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.gpa = gpa;
		this.degree = degree;
		this.international = international;

		studentCount = studentCount + 1;
		int nextId = id + 1;		  
		
		if (international) {
			tuitionFees += internationalFees;
		}
		if (gpa > 3.5){
			tuitionFees = tuitionFees - 1000.00;
		}

		/*System.out.println("\nid: " + id);
		System.out.println("nextId: " + nextId);
		System.out.println("name: " + name);
		System.out.println("gender: " + gender);
		System.out.println("age: " + age);
		System.out.println("phone: " + phone);
		System.out.println("gpa: " + gpa);
		System.out.println("degree: " + degree);
		System.out.println("tuitionFees: " + tuitionFees);
		System.out.println("computeCount: " + studentCount);*/
	}
	Student(){} //no args constructor //constructor overloading
	boolean updateProfile(String name){
		this.name = name;
		return true;
	}
}
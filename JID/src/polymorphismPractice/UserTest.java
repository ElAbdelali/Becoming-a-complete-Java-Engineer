package polymorphismPractice;

public class UserTest {
    public void printUserType(User u){
        u.printUserType();
    }
    public void approveReview(Staff s) {
    	//s.approveReview(); // approve review not in staff class, compiler error
    	//((Editor) s).approveReview(); // cast Editor class reference 
    	if (s instanceof Editor) {
    		((Editor) s).approveReview();
    	}else {
    		System.out.println("Invalid Object Passed");
    	}
    }

    public static void main(String[] args){

        // Polymorphic references
//        User user = new User();
        //User staff = new Staff();
//        User editor = new Editor();

//        staff.postAReview("");
//        ((Staff)staff).printId();
       // UserTest ut = new UserTest();
        //ut.approveReview(new Staff()); //throws a class cast exception because it's object is User
      //  ut.approveReview(new Editor());
//        ut.printUserType(user);
//        ut.printUserType(staff);
//        ut.printUserType(editor);
    	//User staff = new Staff(); // compiler tries to find a compatible method/parameter
//    	staff.staticMethod();
//    	staff.postAReview("");
    	//staff.instanceMethod(10);
    	//staff.instanceMethod(new Staff());
    	
    	//User staff = new Staff();
    	//staff.staticMethod(); // early binding, static method is not overridden, reference type is what matters (user type)
    	//((Staff) staff).staticMethod(); // static method's can only be hidden, never overridden
    	
    	//staff.saveWebLink();
    	
    	//((Staff)staff).displayUserInfo();
    	
    	//System.out.println(staff.toString());//Always override toString method - Item 10
        
    	//staff.displayUserInfo();
    	
    	//User staff2 = staff;
    	//System.out.println(staff.hashCode());
    	//System.out.println(staff2.hashCode());

        //editor.approveReview(); // compiler is looking at the reference time, which is of User, not the object type
        //editor.postAReview();
        //editor.saveWebLink();
    	
    	User staff = new Staff(3);
        
    }

}

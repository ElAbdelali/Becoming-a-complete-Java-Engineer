package polymorphismPractice;

public class Staff extends User {
	public int id = 2;
	
	public void printId() {
		System.out.println("id: " + id);
		System.out.println("super.id: " + super.id);
	}
	
	public Staff() {
		userType = "Staff";
		System.out.println("Staff Constructor 1");
	}
	
	
	public Staff(int id) {
		this(); // invoking the default constructor 
		this.id = id; // assigning id to id instance
		System.out.println("Staff Constructor 2");
	}
	public void displayUserInfo() {
    	System.out.println("\nPrinting user Info: ");
    	System.out.println("id: " + id);
    	System.out.println("userType: " + userType);
    	
    }
	
	public void printUserType(){
        System.out.println("Staff");
    }

    public Review postAReview(String reviewText){
        System.out.println("Staff : postAReview");
        Review review = super.postAReview(reviewText);
        review.setApproved(true);
        return review;
    }
    
    /*public static void staticMethod() {
    	super.postAReview();
    }*/
    // cannot use super in static method
    
    public void instanceMethod(int d) {
    	System.out.println("Staff: instanceMethod");
    }
    public void instanceMethod(Staff d) {
    	System.out.println("Staff: instanceMethod");
    }
    
    //public void finalMethod() {} cannot modify final method
    
    public static void staticMethod() {
    	System.out.println("Staff: staticMethod");
    }
}

package polymorphismPractice;

public class User {
	public int id = 1;
	public String userType = "User";
	
	public User() {
		System.out.println("User Constructor");
	}
	
    public void printUserType(){
        System.out.println("User");
    }
    
//    public void displayUserInfo() {
//    	System.out.println("\nPrinting user Info: ");
//    	System.out.println("id: " + id);
//    	System.out.println("userType: " + userType);
//    	
//    }
    
    public void displayUserInfo() {
    	System.out.println(this);
    }
    
    @Override
    public String toString() {
    	return "\nPrinting User Info: " + "\nid: " + id + "\nuserType: " + userType;
    }
    
    public void saveWebLink(){
        System.out.println("User : saveWebLink ");
        postAReview("");
        staticMethod();
    }
    public Review postAReview(String reviewText){
        System.out.println("User : postAReview ");
        Review review = new Review(reviewText);
        return review;
    }
    
    // method binding demo
    
    public static void staticMethod() {
    	System.out.println("\nUser: staticMethod");
    }
    
    //public void instanceMethod
    public void instanceMethod(double d) {
    	System.out.println("User: instance method");
    }
    public void instanceMethod(User u) {
    	System.out.println("User: instanceMethod");
    }
    
    public final void finalMethod() {
    	
    }
    

    
}
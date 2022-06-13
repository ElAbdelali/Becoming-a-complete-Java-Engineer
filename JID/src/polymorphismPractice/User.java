package polymorphismPractice;

public class User {
	public int id = 1;
	
    public void printUserType(){
        System.out.println("User");
    }
    public void saveWebLink(){
        System.out.println("User : saveWebLink ");
        //postAReview();
    }
    public Review postAReview(String reviewText){
        System.out.println("User : postAReview ");
        Review review = new Review(reviewText);
        return review;
    }
    
    // method binding demo
    
    public static void staticMethod() {
    	
    }
    
    //public void instanceMethod
    public void instanceMethod(double d) {
    	System.out.println("User: instance method");
    }
    public void instanceMethod(User u) {
    	System.out.println("User: instanceMethod");
    }
    
}
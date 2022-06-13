package personalPractice;

public class Main {

	public static void main(String[] args) {
		Dog myDog = new Dog("Spike", 2);
		Cat myCat = new Cat("Fwuffy", 3);
		
		myDog.speak();
		myCat.speak();
		System.out.println();
		
		Person per1 = new Person("Ali");
		Person per2 = new Person("Ibrahim");
		
		per1.setPet(myCat);
		per2.setPet(myDog);
		
		System.out.println(per1.getName() + " has a pet named " + per1.getPet().getName());
		System.out.println(per2.getName() + " has a pet named " + per2.getPet().getName());
	}

}

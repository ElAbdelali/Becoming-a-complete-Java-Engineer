package personalPractice;

public class Dog extends Pet{

	public Dog(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speak() {
		System.out.println(this.name + " said bark!!");
	}
	

}

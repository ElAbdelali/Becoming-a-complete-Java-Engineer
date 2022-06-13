package personalPractice;

public class Cat extends Pet {

	public Cat(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speak() {
		System.out.println(this.name + " said meowww!!");
	}

}

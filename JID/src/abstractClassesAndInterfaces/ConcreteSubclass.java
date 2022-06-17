package abstractClassesAndInterfaces;

public class ConcreteSubclass extends AbstractSubclass{
	
	@Override
	void test2() {
		System.out.println("Test2");
	}
	
	@Override
	void test3(){
		
		System.out.println("Test3");
	}
	
	public static void main (String[] args) {
		ConcreteSubclass concrete = new ConcreteSubclass();
		
		concrete.test1();
		concrete.test2();
		concrete.test3();
		//AbstractSuperclass test = new AbstractSuperclass(); we cannot create an object from abstract classes
		
	}
	

}

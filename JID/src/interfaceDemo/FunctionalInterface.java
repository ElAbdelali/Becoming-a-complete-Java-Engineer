package interfaceDemo;

public interface FunctionalInterface {
	//void test1();// lambda expressions only work with functional interfaces which this interface is not when a new method is introduced
	default void test1() {}; // this is the solution, allows us to keep the functional interface capability
	void test();

}

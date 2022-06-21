package interfaceDemo;

public interface C extends A{
	
	void fooBar();
	default void go() {
		System.out.println("C: go");
		staticMethod();
	}
	static void staticMethod() {
		System.out.println("C: staticMethod");
	}
}

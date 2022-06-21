package interfaceDemo;

public interface B {
	int VAL = TestClient.getVal();
	//int VAL = 42;
	void foo();
	
	default void go() {
		System.out.println("B: go");
	}

}

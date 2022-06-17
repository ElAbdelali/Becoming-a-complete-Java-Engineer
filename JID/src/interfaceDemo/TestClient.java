package interfaceDemo;

public class TestClient {
	
	public static int getVal() {
		return 42;
	}

	public static void main(String[] args) {
		A a = new X();
		C c = new X();
		a.foo();
		a.bar();
		c.fooBar();

	}

}

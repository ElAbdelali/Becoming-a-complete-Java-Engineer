package interfaceDemo;

import java.util.*;

public class TestClient {
	
	public static int getVal() {
		return 42;
	}

	public static void main(String[] args) {
//		A a = new X();
//		C c = new X();
//		a.foo();
//		a.bar();
//		c.fooBar();
//		
		//Clone Demo
//		C clone = ((X)c).clone();
//		if(clone != c) {
//			System.out.println("Clone created!!");
////		}
//		C c = new X();
//		A a = new X();
//		
//		c.go();
//		a.go();
//		new TestClient().lambdaTest(() -> System.out.println("Java In-Depth"));
		C c = new X();
		//c.staticMethod();
		//C.staticMethod();//qualified by interface name
		c.go();
	}
	
	
//	void lambdaTest(FunctionalInterface fi) {
//		fi.test();
//	}

}

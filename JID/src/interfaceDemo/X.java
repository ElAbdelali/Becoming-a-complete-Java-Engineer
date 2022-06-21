package interfaceDemo;

public class X extends AbstractA implements A, B, C, Cloneable{
	public void foo() {
		System.out.println("AbstractA: foo");
		System.out.println("Val: " + B.VAL);
	}
	public void fooBar() {
		System.out.println("X: fooBar");
	}
	
	public C clone() {
		try {
			return (C) super.clone();
		} catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return null;
	}
	public void go() {
		C.super.go();
	}
	public void inheritanceTest() {
		go();// go is a default method defined in interface c thus it can be inherited
		//staticMethod();// will not work because static methods cannot be inherited
	}

}

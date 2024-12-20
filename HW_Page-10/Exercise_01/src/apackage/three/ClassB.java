package apackage.three;


public class ClassB {
	public void methodTwo() {
		apackage.one.ClassA c1 =new apackage.one.ClassA();
		apackage.two.ClassA c2 =new apackage.two.ClassA();
		
		
		c1.methodOne();
		c2.methodOne();
		
	}
}

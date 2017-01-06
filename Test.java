package assignment.acadgild43;



public class Test{
	public static void main(String[] args) {
		A a = new A();
		a.display();
	}
}

class C {

	void test(){
		System.out.println("test method of class 'C'");
	}
}

class B extends C{
	@Override
	void test(){
		System.out.println("test method of class 'B'");
		super.test();

	}
}

class A extends B{
	@Override
	public void test(){
		System.out.println("test method of class 'A'");

	}
	void display(){
		super.test();
	}
	
}

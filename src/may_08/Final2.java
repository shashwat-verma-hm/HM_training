package may_08;

final class A{
	
	final int speed = 200;
	final void gear() {
		System.out.println("5");
	}
}

//class B extends A{}

public class Final2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
//		B b = new B();
		
		System.out.println(a.speed);
		a.gear();
		
	}

}

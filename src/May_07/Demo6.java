package May_07;

class A{
	A(){
		System.out.println("A()");
	}
	
	A(int a){
		System.out.println("A(int a)");
	}
	
	A(int a, int b){
		System.out.println("A(int a, int b)");
	}
	
	A(int a, String b){
		System.out.println("A(int a, String b)");
	}
}

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a1 = new A();
		A a2 = new A(10);
		A a3 = new A(1,2);
		A a4 = new A(1,"Shashwat");

	}

}

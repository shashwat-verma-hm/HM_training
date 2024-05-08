package May_07;

abstract class Bank2{
	abstract void KYC();
	abstract void ATM();

}

class SBI2 extends Bank2{

	@Override
	void KYC() {
		// TODO Auto-generated method stub
		System.out.println("KYC");
		
	}

	@Override
	void ATM() {
		// TODO Auto-generated method stub
		System.out.println("500000");
		
	}
	
}

class Axis2 extends Bank2{

	@Override
	void KYC() {
		// TODO Auto-generated method stub
		System.out.println("KYC");
		
	}

	@Override
	void ATM() {
		// TODO Auto-generated method stub
		System.out.println("25000");
		
	}
	
}
public class Demo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SBI2 sbi = new SBI2();
		sbi.ATM();
		sbi.KYC();
		
		Axis2 axis = new Axis2();
		axis.ATM();
		axis.KYC();

	}

}

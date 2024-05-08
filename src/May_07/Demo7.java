package May_07;

class Bank{
	
	public void roi() {
		System.out.println("Rate of interest");
	}
}

class SBI extends Bank{
	
	public void roi() {
		System.out.println("Rate of interest for SBI is 10%");
	}
}

class Axis extends Bank{
	public void roi() {
		System.out.println("Rate of interest for Axis is 12%");
	}
}

public class Demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI sbi = new SBI();
		sbi.roi();
		
		Axis axis = new Axis();
		axis.roi();
	}

}

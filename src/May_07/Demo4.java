package May_07;

class P{
	int money = 200000;
	String car = "bmw";
	private String newCar = "BENZ";
	int site = 5;
}

class C extends P{
	int money = 10000;
	
	void use(){
		System.out.println("Money : "+money);
		System.out.println("Parent Money : "+super.money);
		System.out.println("Parent Car : "+car);
		System.out.println("Parent Site : "+site);
	}
}

class Demo4{
	public static void main(String[] args){
		C c = new C();
		c.use();
	}
}

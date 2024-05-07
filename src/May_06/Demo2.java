package May_06;

import java.util.*;

class A{
	String name, des;
	int id, age;
	float sal;

	A(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		name = sc.nextLine();

		System.out.println("Enter ID : ");
		id = sc.nextInt();
		
		System.out.println("Enter age : ");
		age = sc.nextInt();

		System.out.println("Enter salary : ");
		sal = sc.nextFloat();

		sc.nextLine();
		System.out.println("Enter designation : ");
		des = sc.nextLine();
	}

	void display(){
		System.out.println("--------Employee Details--------");

		System.out.println("ID  : "+id);
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Salary : "+sal);
		System.out.println("Designation : "+des);
	}
}

public class Demo2{
	public static void main(String[] args){
		A a = new A();
		a.display();
	}
}


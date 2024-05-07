package May_06;

import java.util.*;

class Dev{
	int id, age;
	String name;
	String des = "Developer";
	float sal = 60000.0f;

	Dev(){
		Scanner sc = new Scanner(System.in);		

		System.out.println("Enter id : ");
		id = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter name : ");
		name = sc.nextLine();

		System.out.println("Enter age : ");
		age = sc.nextInt();

	}

	void display(){
		System.out.println("-----DEVELOPER-----");
		System.out.println("Name  : "+name);
		System.out.println("ID : "+id);
		System.out.println("Age : "+age);
		System.out.println("Salary : "+sal);
		System.out.println("Designation : "+des);
	}
}

class Clerk{
	
	int id, age;
	String name;
	String des = "Clerk";
	float sal = 20000.0f;	

	Clerk(){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter id : ");
		id = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter name : ");
		name = sc.nextLine();

		System.out.println("Enter age : ");
		age = sc.nextInt();
	}

	void display(){
		System.out.println("-------CLERK-------");
		System.out.println("Name : "+name);
		System.out.println("ID : "+id);
		System.out.println("Age : "+age);
		System.out.println("Salary : "+sal);
		System.out.println("Designation : "+des);
	}
}

public class Demo3{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int ch=0;
		
		do{
			System.out.println("---------------------------");
			System.out.println("Enter a choice : ");
			System.out.println("1. Developer\n2. Clerk\n3. Exit");
			ch = sc.nextInt();
			if(ch==1){
				Dev d = new Dev();
				d.display();
			}
			else if(ch==2){
				Clerk c = new Clerk();
				c.display();
			}
			else{
				if(ch==3)
					continue;
				System.out.println("Invalid Option");
			}
		}while(ch!=3);
	}
}
package may_08;

import java.util.Scanner;

interface Company{
	void PF();
}

abstract class Emp{

	 
    int id, age, sal;
    String name, des;
    
 
    Emp(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID : ");
        id  = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter age : ");
        age = sc.nextInt();
    }
    
    void display(){
        System.out.println("My name is : " + name );
        System.out.println("My Id is : " + id);
        System.out.println("My age is : "+ age);
        System.out.println("My salary is : "+ sal);
        System.out.println("My designation is : "+ des);
    }
    
    abstract int raiseSal();
 
}
 
final class Manager extends Emp implements Company{
 
    Manager(){
    	sal=80000;
        des = "Manager";
    }

	@Override
	int raiseSal() {
		// TODO Auto-generated method stub
		return sal+sal*20/100;
	}

	@Override
	public void PF() {
		// TODO Auto-generated method stub
		System.out.println("Manager PF");
		
	}
    
}
 
final class Dev extends Emp implements Company{
 
    Dev(){
    	sal=60000;
        des = "Developer";
    }

	@Override
	int raiseSal() {
		// TODO Auto-generated method stub
		return sal+sal*15/100;
	}

	@Override
	public void PF() {
		// TODO Auto-generated method stub
		System.out.println("Dev PF");
		
	}
    
}
 
 
final class Clerk extends Emp implements Company{
 
    Clerk(){
    	sal=20000;
        des = "Clerk";
    }

	@Override
	int raiseSal() {
		// TODO Auto-generated method stub
		return sal+sal*10/100;
	}

	@Override
	public void PF() {
		// TODO Auto-generated method stub
		System.out.println("Clerk PF");
		
	}
    
}

final class Tester extends Emp implements Company{
	
	Tester(){
		sal=30000;
		des="Tester";
	}

	@Override
	int raiseSal() {
		// TODO Auto-generated method stub
		return sal+sal*8/100;
	}

	@Override
	public void PF() {
		// TODO Auto-generated method stub
		System.out.println("Tester PF");
		
	}
}


public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ch=0;
		Dev d = null;
		Clerk c = null;
		Manager m = null;
		Tester t = null;
		
		
		do{
			System.out.println("---------------------------");
			System.out.println("Enter a choice : ");
			System.out.println("1. Create\n2. Display\n3. Raise Salary\n4. Exit");
			ch = sc.nextInt();
			if(ch==1){
				int ch2=0;
				
				do{
					System.out.println("Enter a choice : ");
					System.out.println("1. Developer\n2. Clerk\n3. Manager\n4. Tester\n5. Exit");
					ch2 = sc.nextInt();
					if(ch2==1){
						d = new Dev();
					}
					else if(ch2==2){
						c = new Clerk();
					}
					else if(ch2==3){
						m = new Manager();
					}
					else if(ch2==4){
						t = new Tester();
					}
					else{
						if(ch2==5)
							continue;
						System.out.println("Invalid Option");
					}
				}while(ch2!=5);
			}
			else if(ch==2){
				int ch2=0;
				
				do{
					System.out.println("Enter a choice : ");
					System.out.println("1. Developer\n2. Clerk\n3. Manager\n4. Tester\n5. Exit");
					ch2 = sc.nextInt();
					if(ch2==1){
						if(d!=null) {
							d.display();
							d.PF();
						}
						else
							System.out.println("Developer is not created");
					}
					else if(ch2==2){
						if(c!=null) {
							c.display();
							c.PF();
						}
						else
							System.out.println("Clerk is not created");
					}
					else if(ch2==3){
						if(m!=null) {
							m.display();
							m.PF();
						}
						else
							System.out.println("Manager is not created");
					}
					else if(ch2==4){
						if(t!=null) {
							t.display();
							t.PF();
						}
						else
							System.out.println("Tester is not created");
					}
					else{
						if(ch2==5)
							continue;
						System.out.println("Invalid Option");
					}
				}while(ch2!=5);
			}
			else if(ch==3){
				
				int ch2=0;
				
				do{
					System.out.println("Enter a choice : ");
					System.out.println("1. Developer\n2. Clerk\n3. Manager\n4. Tester\n5. Exit");
					ch2 = sc.nextInt();
					if(ch2==1){
						if(d!=null) 
							d.sal = d.raiseSal();
						else
							System.out.println("Developer is not created");
					}
					else if(ch2==2){
						if(c!=null)
							c.sal = c.raiseSal();
						else
							System.out.println("Clerk is not created");
					}
					else if(ch2==3){
						if(m!=null)
							m.sal = m.raiseSal();
						else
							System.out.println("Manager is not created");
					}
					else if(ch2==4){
						if(t!=null)
							t.sal = t.raiseSal();
						else
							System.out.println("Tester is not created");
					}
					else{
						if(ch2==5)
							continue;
						System.out.println("Invalid Option");
					}
				}while(ch2!=5);
			}
			else{
				if(ch==4)
					continue;
				System.out.println("Invalid Option");
			}
		}while(ch!=4);
	}

}
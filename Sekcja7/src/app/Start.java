package app;

import app.challenge.Customer;
import app.challenge.LPAStudent;
import app.challenge.Person;
import app.challenge.SimpleCalculator;
import app.challenge.Student;
import app.challenge.Wall;
import app.objectOrientedChallenge.BankAccount;

public class Start {

	public static void main(String[] args) {
		System.out.println("Sekcja 7");
		// 14/03/2024 start
		// 19/03/2024
//		BankAccount ba = new  BankAccount(001, 1000, "Trevor", "t@@@", 012345);
//		System.out.println(ba);
//		ba.deposid(25);
//		ba.withdrawing(5000);
//		ba.withdrawing(30);
//		System.out.println(ba); // done
		
		// cwiczenie 30
//		SimpleCalculator sc = new SimpleCalculator();
//		sc.setFirstNumber(5.0);
//		sc.setSecondNumber(4);
//		System.out.println("add= " + sc.getAddiotionResult());
//		System.out.println("subtract= " + sc.getSubstractionResult());
//		sc.setFirstNumber(5.25);
//		sc.setFirstNumber(0);
//		System.out.println("multiply= " + sc.getMultiplicationResult());
//		System.out.println("divide= " + sc.getDivisionResult());
		
//		Person per = new Person();
//		per.setFirstName("");
//		per.setLastName("");
//		per.setAge(10);
//		System.out.println("fullName" + per.getFullName());
		
				
//		System.out.println("--------------------" );
//		Customer customer = new Customer("Tim", 1000, "Tim@.com");
//		System.out.println("Name:" + customer.getName());
//		System.out.println("credit limit:" + customer.getCreditLimit() + "$");
//		System.out.println("email:" + customer.getEmailAddress());
//		System.out.println("--------------------" );
//		Customer secoundCustomer = new Customer("Alan", "Mon@.com");
//		System.out.println("Name:" + secoundCustomer.getName());
//		System.out.println("credit limit:" + secoundCustomer.getCreditLimit() + "$");
//		System.out.println("email:" + secoundCustomer.getEmailAddress());
//		System.out.println("--------------------" );
//		Customer noCustomer = new Customer();
//		System.out.println("Name:" + noCustomer.getName());
//		System.out.println("credit limit:" + noCustomer.getCreditLimit() + "$");
//		System.out.println("email:" + noCustomer.getEmailAddress());
//		System.out.println("--------------------" );
		
		
		// ep 89.The POJO
		
//		for(int i = 1; i <= 5; i++) {
//		
//		LPAStudent st = new LPAStudent("A000" + i, 
//				switch(i) {
//				case 1 -> "Marry";
//				case 2 -> "Calor";
//				case 3 -> "Harry";
//				case 4 -> "Tim";
//				case 5 -> "Lisa"; 
//				default -> "Anonymous";				
//				}, 
//				"05/11/1985", 
//				"Java Masterclass");
//		System.out.println(st);
//		}
//		
//		Student pojoStudent = new Student("S923006", "Ann", "05/11/1985", "Java Masterclass");
//		LPAStudent recordStudent = new LPAStudent("S923007", "Bill", "05/11/1985", "Java Masterclass");
//		System.out.println(pojoStudent);
//		System.out.println(recordStudent);
//		
		
		Wall wall = new Wall(5, 4);
		System.out.println("area= " + wall.getArea());
		wall.setHeight(-1.5);
		System.out.println("width= " + wall.getWidth());
		System.out.println("height= " + wall.getHeight());
		System.out.println("area= " + wall.getArea());
		
		
	}

}

package basics;

import java.util.Scanner;

public class ReadingInputFromUser {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter your name: ");
    	String name=sc.nextLine();
    	System.out.print("Enter your age: ");
    	int age=sc.nextInt();
    	System.out.print("Enter your gender (M/F): ");
    	char gender=sc.next().charAt(0);
    	System.out.print("Enter your contact no: ");
    	double contact = sc.nextDouble();
    	System.out.print("Enter your contact no: ");
    	long contactno = sc.nextLong();
    	
    	System.out.println("User Details");
    	System.out.println("Name: "+name);
    	System.out.println("Age: "+age);
    	System.out.println("Gender: "+gender);
    	System.out.println("Contact no: "+contact);
    	System.out.println("Contact no: "+contactno);
	
}
}

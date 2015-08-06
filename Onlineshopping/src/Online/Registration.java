package Online;

import java.util.Scanner;

public class Registration {

	String na[] = new String[100];
	String ps[] = new String[100];
	String dob[] = new String[100];
	String ad[] = new String[100];
	String ma[] = new String[100];
	int mo[] = new int[100];
	int pos = 0, i;
	String u, p;
	Scanner in = new Scanner(System.in);

	public void register() {
		System.out.println("Enter user Name:");
		na[pos] = in.next();
		System.out.println("Enter password:");
		ps[pos] = in.next();
		System.out.println("Enter Your DateofBirth(Ex:16thMar):");
		dob[pos] = in.next();
		System.out.println("Enter Your Address:");
		ad[pos] = in.next();
		System.out.println("Enter Your Mailid:");
		ma[pos] = in.next();
		System.out.println("Enter Your MobileNo:");
		mo[pos] = in.nextInt();
		pos++;

	}
	
	
	public void login() {

		System.out.println("Enter username:");
		u = in.next();
		System.out.println("Enter password:");
		p = in.next();

		for (i = 0; i < pos; i++)
		{
			if ((u.equals(na[i])) && (p.equals(ps[i])))
			{

				Shopmenu s = new Shopmenu();
				s.disp();	
			} 
			
			else
				System.out.println();
				System.out.println("Invaid username or password");
				
		}
		
	}
			
		
	}
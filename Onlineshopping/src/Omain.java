import Online.*;
import java.util.Scanner;
public class Omain {
public static void main(String arg[])
{
	int ch;
	Scanner in=new Scanner(System.in);
	
	Registration r=new Registration();
	
	do
	{
		
		System.out.println("1.Registration");
		System.out.println("2.Login");
		System.out.println("3.Exit");	
		System.out.println("Enter your choice:");
		ch=in.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("1.Registration");
			r.register();
			break;
		case 2:
			System.out.println("2.Login");
			r.login();
			break;
		case 3:
			break;
		}
	
	}while(ch<3);
	
}
}


package Online;

import java.util.Scanner;
import java.util.ArrayList;
public class Addcat {
Scanner in=new Scanner(System.in);
int a,p,i;
int pos=0;
String na[]=new String[100];
int pz[]=new int[100];
int id[]=new int[100];
int r=0,n;
String name;

Registration r1 = new Registration();

int ai,quan;
public void addcat()
{
	 ArrayList<String> i=new ArrayList<String>();
	  i.add("Sports");
	  i.add("Cosmetics");
	  i.add("Furniture");
	  i.add("Stationaries");
	  System.out.println("Enter the category u want to add");
	  Scanner m=new Scanner(System.in);
	  String n=m.nextLine();
	  i.add(n);
	 
	 for(String a:i)
	 {
		 System.out.println(a);
	 }

	
}
public void addpro()
{	    
	System.out.println("Enter product Name:");
    na[pos] = in.next(); 
    System.out.println("Enter product id");
    id[pos] = in.nextInt();
    System.out.println("Enter prize:");
    pz[pos] = in.nextInt();
    pos++;	      
	 
}
public void shop()
{
	for(i=0;i<pos;i++)
    {
    	System.out.println(na[i]+"\t"+id[i]+"\t"+pz[i]);
    }
	System.out.println("Enter number of product u want to order:");
	n=in.nextInt();
	for(int j=0;j<n;j++)
	{
	System.out.println("Enter product name u want to order:");
	name=in.next();
	System.out.println("Enter number of quantity u want to order:");
	quan=in.nextInt();
	}
	System.out.println("productname\tid\tprize");
	for(i=0;i<pos;i++)
	{
		if(na[i].equals(name))
		{
			ai=i;	
		}
			
	}
	System.out.println(na[ai]+"\t"+id[ai]+"\t"+pz[ai]);			
	
}
public void list()
{
	
	System.out.println("ordered product id\t prize");
	for(int l=0;l<n;l++)
	{
		System.out.println(id[ai]+"\t"+pz[ai]);
		r=pz[ai]*quan;
		System.out.println("\t\tTotal cost:"+""+r);
	}
	
}

}

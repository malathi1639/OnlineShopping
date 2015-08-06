package Online;

import java.util.Scanner;

public class Shopmenu {
	Scanner in = new Scanner(System.in);
	int a;
	Addcat ad = new Addcat();

	public void disp() {
		do {
			System.out.println("1.Add Category");
			System.out.println("2.Add product");
			System.out.println("3.Do shopping");
			System.out.println("4.List the order");
			System.out.println("5.Exit");
			System.out.println("Enter your choice:");
			a = in.nextInt();
			switch (a) {
			case 1:
				System.out.println("1.Add Category");
				ad.addcat();
				break;
			case 2:
				System.out.println("2.Add product");
				ad.addpro();
				break;
			case 3:
				System.out.println("3.Do shopping");
				ad.shop();
				break;
			case 4:
				System.out.println("4.List the order");
				ad.list();
				break;
			case 5:
				
				break;
			}
		} while (a <5);

	}

}

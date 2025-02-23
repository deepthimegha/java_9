package com.shoppse;
import java.util.Scanner;

public class myclass{

	public static void main(String[] args) {
		
		 myclass m = new myclass();
		m.selectOptions();
		
	}

	public void selectOptions() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to the Amazon Shopping");
   int repeat;
   do {
		System.out.println("Please Select the option ");
		System.out.println("1.Clothes");
		System.out.println("2.Electronis");
		System.out.println("3.Jewellery");
		System.out.println("4.Cosmetics");
		System.out.println("5.Accessories");

		int option = sc.nextInt();

		switch (option) {

		case 1: {
			System.out.println("Welcome to clothes sectoin");

			System.out.println("1.laptops");
			System.out.println("2.mobiles");
			System.out.println("3.headphones");
			System.out.println("Selsect the above options");

			int clothopt = sc.nextInt();
			Clothes c = new Clothes();  
			switch (clothopt) {

			case 1: {

				System.out.println("Welcome to kids wear");
				
				
				c.kids();
				
			}
				break;

			case 2: {

				System.out.println("Welcome to mens wear");
				
				c.mens();
			}
				break;

			case 3: {

				System.out.println("Welcome to Womens wear");
				
				c.womens();
			}
				break;

			default: {
				System.out.println("Inavlid input");
			}
			}

		}
			break;
		case 2: {
			System.out.println("Welcome to electronics");

			System.out.println("1.laptop");
			System.out.println("2.Mobiles");
			System.out.println("3.Headphones");
			System.out.println("Select the above options");

			int electronicopt = sc.nextInt();
			electronis e = new electronis();

			switch (electronicopt) {

			case 1: {

				System.out.println("Welcome to laptop Section");
				e.laptop();
			}
				break;
			case 2: {
				System.out.println("Welcome to Mobiles Section");
				e.Mobiles();

			}
				break;

			case 3: {
				System.out.println("Welcome to Headphones Section");
				e.Headphones();
			}
				break;

			default: {
				System.out.println("invalid input");

			}

			}
		}
			break;
		case 3: {
			System.out.println("Welcome to jewellery Section");
			System.out.println("1.Rings");
			System.out.println("2.Chains");
			System.out.println("3.Bracelets");
			System.out.println("Select the above options");
			int jewelleryryopt = sc.nextInt();
			jewellery j = new jewellery();

			switch (jewelleryryopt) {

			case 1: {
				System.out.println("Select Ring Models");
				j.rings();
			}
				break;
			case 2: {
				System.out.println("Select Chain Models");
				j.chains();
			}
				break;
			case 3: {
				System.out.println("Select Bracelet Models");
				j.bracelet();
			}
				break;
			default: {
				System.out.println("Invalid input");
			}
			}

		}
			break;
		case 4: {
			System.out.println(" Welcome to Cosmetics");
			System.out.println("1.Eyelashes");
			System.out.println("2.FaceCream");
			System.out.println("3.Lipsticks");
			System.out.println("Select Above Options");
			int cosmopt = sc.nextInt();
			cosmetics c = new cosmetics();
			switch (cosmopt) {
			case 1: {
				System.out.println("Select Eyelash model");
				c.Eyelash();

			}
				break;
			case 2: {
				System.out.println("Select  brand");
				c.FaceCream();
			}
				break;
			case 3: {
				System.out.println("Select Lipsticks brand");
				c. Lipsticks();
			}
				break;

			default: {
				System.out.println("Invalid input");
			}

			}

		}
			break;
		case 5: {
			System.out.println("Welcome to Acessories");
			System.out.println("1.Watches");
			System.out.println("2.Laptop Bags");
			System.out.println("3. Spects");
			System.out.println("Select Above Options");
			int ascriesopt = sc.nextInt();
			accessories a = new accessories();
			switch (ascriesopt) {

			case 1: {
				System.out.println("Select Watch model");
				a.watches();
			}
				break;
			case 2: {
				System.out.println("Select Laptopbag brand");
				a.laptopbags();
			}
				break;
			case 3: {
				System.out.println("Select Spects Model");
				a.specs();
			}
				break;

			default: {
				System.out.println("Invalid input");
			}
			}

		}
			break;

		default: {
			System.out.println("inavalid input");

		}
		}
		System.out.println("Go back to Main Menu  Press1 Else 0");
        repeat = sc.nextInt();
	}while(repeat==1);
	}
static String s[]=new String[45];
static double d[]=new double[45];
static int pointer=0;

    }

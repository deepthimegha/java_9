package com.shoppse;
import java.util.Scanner;

	public class Digitalbanking extends myclass {

		String username = "Deepthimeghana";
		String password = "Deepthi99999";
		double balance = 1000;

		static Scanner sc = new Scanner(System.in);

		public static void check(double price) {

			Digitalbanking db = new Digitalbanking();

			int choices = 0;
			while (choices < 3)

			{

				System.out.println("Enter the User name");
				String uname = sc.next();
				System.out.println("Enter the password");
				String pwd = sc.next();

				if ((uname.equals(db.username)) && (pwd.equals(db.password))) {

					System.out.println("");

					String repeat = "no";
					do {
						System.out.println("please select the options");

						System.out.println("1.Buy product");

						System.out.println("3.Check balaance is");

						int option = sc.nextInt();

						switch (option)

						{

						case 1: {

							

							System.out.println("Product price is:" + buy(price));
						}
							break;

						case 2: {

							System.out.println("Curerrent balance is:" + db.balance);
						}
							break;

						default: {
							System.out.println("select  the valid  option");
						}

						}

						System.out.println("If You Want Check Any Other Options Enter Yes Else No");

						repeat = sc.next();

					} while (repeat.equalsIgnoreCase("yes"));

					choices = 4;

					// break;
				} else {
					System.out.println("Incorrect Password");

					System.out.println("Please re enter the password");

					choices++;

					if (choices >= 3) {
						System.out.println("Your Bank Account Block For today");
					}

				}

			}

		}

		public static double buy(double productprice) {

			String again = "no";
			do {
				Digitalbanking db = new Digitalbanking();
				if (db.balance > productprice) {
					db.balance = db.balance - productprice;
					System.out.println("Product Purchased Successfully");
					System.out.println("remaining balance is:" + db.balance);

					break;
				} else {

					System.out.println("Insufficient Balance");

					System.out.println("If you want to Add money enter yes");

					String option = sc.next();
					if (option.equalsIgnoreCase("yes")) {
	                      
						
						addMoney(db);
					}

				}

				System.out.println("Do you Want to try again for buy the product");
				again = sc.next();
			} while (again.equalsIgnoreCase("yes"));
			return productprice;
		}

		public static double addMoney(Digitalbanking db) {

			System.out.println("Enter the Amount To add");
			double add = sc.nextDouble();

			db.balance = db.balance + add;
			System.out.println("Current balance is:" +db.balance);

			return add;

		}

	}


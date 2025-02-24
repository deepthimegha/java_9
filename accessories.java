package com.shoppse;

	import java.util.Scanner;

	class accessories extends myclass {

		String[] products = { "watches", "electronics watches", "rings", "chains", "stud chains", "pearl chains", "nosepins", "bulaki","pins" };
		double[] prices = { 100, 500, 400, 700, 200, 800, 600, 1000, 700 };

		Scanner sc = new Scanner(System.in);

		public void watches() {
			String repeat = "no";
			do {
				System.out.println("1.watches");
				System.out.println("2.electronic watches");
				System.out.println("3.rings");
				System.out.println("please Select the option ");
				int watchesbrand = sc.nextInt();
				// System.out.println("Please Enter the brand name");
				// String brand = sc.next();

				switch (watchesbrand) {

				case 1: {
					String brand = "Mackly";
					System.out.println("1.Add to cart");
					System.out.println("2.Buy the product");
					System.out.println("please select Above Option");
					int choose = sc.nextInt();

					switch (choose) {

					case 1: {

						cart(brand);

					}
						break;
					case 2: {

						Digitalbanking.check(100.00);
					}
						break;

					default: {

						System.out.println("Inavalid input");
					}

					}
				}
					break;
				case 2: {
					String brand = "rings";
					System.out.println("1.Add to cart");
					System.out.println("2.Buy the product");
					System.out.println("please select Above Option");
					int choose = sc.nextInt();
					switch (choose) {

					case 1: {
						System.out.println("cart section");
						cart(brand);
					}
						break;
					case 2: {
						System.out.println("buy");
						Digitalbanking.check(500.00);
					}
						break;

					default: {
						System.out.println("Invalid input");
					}

					}

				}
					break;
				case 3: {
					String brand = "chains";
					System.out.println("1.Add to cart");
					System.out.println("2.Buy the product");
					System.out.println("please select Above Option");
					int choose = sc.nextInt();
					switch (choose) {

					case 1: {
						System.out.println("cart section");
						cart(brand);
					}
						break;
					case 2: {
						System.out.println("buy");
					}
						break;

					default: {
						System.out.println("Invalid input");
					}

					}

				}
					break;

				default: {
					System.out.println("Inavlid input");
				}
				}

				System.out.println("See Brand Options Again Enter Yes To Exit Enter No ");
				repeat = sc.next();
			} while (repeat.equalsIgnoreCase("Yes"));
		}

		public void laptopbags() {

			String option = "no";
			do {
				System.out.println("1.Nike");
				System.out.println("2.Gucci");
				System.out.println("3.Oneeight");
				System.out.println("please Select the option ");

				int menbrand = sc.nextInt();

				switch (menbrand) {

				case 1: {
					String brand = "Nike";
					System.out.println("1.Add to cart");
					System.out.println("2.Buy the product");
					System.out.println("please select Above Option");
					int choose = sc.nextInt();

					switch (choose) {

					case 1: {
						System.out.println("cart section");
						cart(brand);
					}
						break;
					case 2: {
						System.out.println("buy");
					}
						break;
					}

				}
					break;
				case 2: {
					String brand = "Gucci";
					System.out.println("1.Add to cart");
					System.out.println("2.Buy the product");
					System.out.println("please select Above Option");
					int choose = sc.nextInt();

					switch (choose) {

					case 1: {
						System.out.println("cart section");
						cart(brand);
					}
						break;
					case 2: {
						System.out.println("buy");
					}
						break;
					}

				}
					break;

				case 3: {
					String brand = "Oneeight";
					System.out.println("1.Add to cart");
					System.out.println("2.Buy the product");
					System.out.println("please select Above Option");
					int choose = sc.nextInt();

					switch (choose) {

					case 1: {
						System.out.println("cart section");
						cart(brand);
					}
						break;
					case 2: {
						System.out.println("buy");
					}
						break;
					}

				}
					break;

				default: {
					System.out.println("Invalid input");
				}

				}

				System.out.println("To See Brand Options Again Press1 else0 ");
				option = sc.next();
			} while (option.equalsIgnoreCase("yes"));

		}

		public void specs() {

			String option = "no";
			do {
				System.out.println("1.Banaras Sarries");
				System.out.println("2.silk Sarries");
				System.out.println("3.Dresses");
				System.out.println("please Select the option ");

				int womenbrand = sc.nextInt();

				switch (womenbrand) {

				case 1: {
					String brand = "stud chains";
					System.out.println("1.Add to cart");
					System.out.println("2.Buy the product");
					System.out.println("please select Above Option");
					int choose = sc.nextInt();

					switch (choose) {

					case 1: {
						System.out.println("cart section");
						cart(brand);
					}
						break;
					case 2: {
						System.out.println("buy");
					}
						break;
					}

				}
					break;
				case 2: {
					String brand = "small chains";
					System.out.println("1.Add to cart");
					System.out.println("2.Buy the product");
					System.out.println("please select Above Option");
					int choose = sc.nextInt();

					switch (choose) {

					case 1: {
						System.out.println("cart section");
						cart(brand);
					}
						break;
					case 2: {
						System.out.println("buy");
					}
						break;
					}

				}
					break;

				case 3: {
					String brand = "pearl chains";
					System.out.println("1.Add to cart");
					System.out.println("2.Buy the product");
					System.out.println("please select Above Option");
					int choose = sc.nextInt();

					switch (choose) {

					case 1: {
						System.out.println("cart section");
						cart(brand);
					}
						break;
					case 2: {
						System.out.println("buy");
					}
						break;
					}

				}
					break;

				default: {
					System.out.println("Invalid input");
				}

				}

				System.out.println("To See Brand Options Again Press yes Else no ");
				option = sc.next();
			} while (option.equalsIgnoreCase("yes"));

		}

		public void cart(String brand) {

			for (int i = 0; i <= products.length - 1; i++) {
				for (int j = 0; j <= prices.length - 1; j++) {

					if (products[i].equals(brand) && i == j) {

						// System.out.print(products[i] + "=");
						// System.out.println(prices[j]);

						s[pointer] = products[i];
						d[pointer] = prices[j];

						pointer++;

					}

				}

			}

		}

	}


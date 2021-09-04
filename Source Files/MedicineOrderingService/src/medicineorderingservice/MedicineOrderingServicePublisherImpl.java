package medicineorderingservice;

import java.util.Random;
import java.util.Scanner;

public class MedicineOrderingServicePublisherImpl implements MedicineOrderingServicePublisher {
	
	public void medicineOrderingService() {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Your Name : ");
		String name = scanner.nextLine();

		System.out.println("");
		System.out.println("Hello!.." + name);
		System.out.println("");

		int drug = 1;
		while (drug == 1) {

			System.out.println("\t\t    ****************Medicine List****************");
			System.out.println("");
			System.out.println("\t\t    	Medicine Name		" + "Price");
			System.out.println("\t\t    =========================================");
			System.out.println("\t\t    1. Panadol	" + "0.50");
			System.out.println("\t\t    2. Vitamin C		" + "1.50");
			System.out.println("\t\t    3. Vintogeno		" + "250");
			System.out.println("\t\t    4. Betadene		" + "100");
			System.out.println("\t\t    0. Exit");
			System.out.println("");

			System.out.print("Please Select an Item:  ");
			int option = scanner.nextInt();

			if (option == 1 || option == 2 || option == 3 || option == 4) {

				System.out.print("Enter Quantity of items : ");
				int qty = scanner.nextInt();
				System.out.println();

				Random rand = new Random();
				int orderNo = rand.nextInt(1000);

				if (qty > 0 && qty <= 10) {

					if (option == 1) {
						double total = (0.50 * qty);
						System.out.println("Order Number \t: " + orderNo);
						System.out.println("Medicine Name \t: " + "Panadol");
						System.out.println("Quantity \t: " + qty);
						System.out.println("Total Price\t: " + total);
						System.out.println("");

					} else if (option == 2) {
						double total = (1.50 * qty);
						System.out.println("Order Number \t: " + orderNo);
						System.out.println("Medicine Name \t: " + "Vitamin C");
						System.out.println("Quantity \t: " + qty);
						System.out.println("Total Price\t: " + total);
						System.out.println("");

					} else if(option == 3){
						double total = (250 * qty);
						System.out.println("Order Number \t: " + orderNo);
						System.out.println("Medicine Name \t: " + "Vintogeno");
						System.out.println("Quantity \t: " + qty);
						System.out.println("Total Price\t: " + total);
						System.out.println("");

					} else {
						double total = (100 * qty);
						System.out.println("Order Number \t: " + orderNo);
						System.out.println("Medicine Name \t: " + "Betadene");
						System.out.println("Quantity \t: " + qty);
						System.out.println("Total Price\t: " + total);
						System.out.println("");

					} 

					System.out.println("Do you want to continue ? (1/2) : ");
					drug = scanner.nextInt();

					if (drug == 2) {
						System.out.println("");
						System.out.println("Thank You.....");
						System.out.println();
					}

				} else {

					System.out.println("Sorry!!! Maximum Quantity 10 at once..!");
					System.out.println("Do you want to continue ? (1/2) : ");
					drug = scanner.nextInt();

					if (drug == 2) {
						System.out.println("");
						System.out.println("Thank You.....");
						System.out.println();
						return;
					}

				}

			} else if (option == 0) {

				System.out.println("");
				System.out.println("Thank You.....");
				System.out.println();
				return;

			} else {

				System.out.println("");
				System.out.println("Invalid Input.!!Do you want to continue.? (1/2) : ");
				drug = scanner.nextInt();

				if (drug == 2) {
					System.out.println("");
					System.out.println("Thank You.....");
					System.out.println();
				}

			}

			while (drug != 1 && drug != 2) {
				System.out.println("");
				System.out.println("Invalid Input.");
				System.out.println("Type 1 = Continue Ordering / Type 2 = Exit  ");
				drug = scanner.nextInt();

				if (drug == 2) {
					System.out.println();
					System.out.println("Thank You.....");
					System.out.println();
				}
			}

		}
		
	}

}

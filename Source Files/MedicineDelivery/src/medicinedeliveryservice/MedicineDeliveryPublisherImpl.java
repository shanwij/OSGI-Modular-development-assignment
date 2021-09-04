package medicinedeliveryservice;

import java.util.Random;
import java.util.Scanner;

public class MedicineDeliveryPublisherImpl implements MedicineDeliveryPublisher {

	@Override
	public void MediDeliveryService() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("* * * * * * * * * * * * * WELCOME TO MEDICINE DELiVERY SERVICE * * * * * * * * * * * * ");
		System.out.println("");
		System.out.print("Enter Your Name : ");
		String Cname = scanner.next();

		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("WELCOME HELLO !" + Cname);
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

		int selection = 1;
		while (selection == 1) {
			System.out.println("");
			System.out.println("*    * *    * *    * *    * * MEDICINE DELiVERY SERVICE * *    * *    * *    * *    *");
			System.out.println("");

			System.out.print("Do You Have Order Number? [1 = Yes | 2 = No]: ");
			int que = scanner.nextInt();
			System.out.println("");

			double totalMediPrice = 0;
			double totalPrice = 0;

			Random random = new Random();
			int delivery_No = random.nextInt(1000);
			int order_No = random.nextInt(1000);

			if (que == 1) {

				int select1 = 1;

				while (select1 == 1) {

					System.out.print("Please..Enter Your Order number:  ");
					String orderNum = scanner.next();

					System.out.print("Please Enter Your Address: ");
					String address = scanner.next();
					
					System.out.print("Please Enter Your Distance[KM]:  ");
					double dist = scanner.nextDouble();
					System.out.println("");
					
					if (dist > 1 && dist <= 15) {
						double delivery_Price = 150;
						delivery_Price = delivery_Price + ((dist-1) * delivery_Price);
						totalPrice = delivery_Price;
						System.out.println("Order Number \t: " + orderNum);
						System.out.println("Delivery Number \t: " + delivery_No);
						System.out.println("Address \t: " + address);
						System.out.println("Distance [KM] \t: " + dist + " KM");
						System.out.println("Delivery Price \t: " + totalPrice);
						
						System.out.println("");
						System.out.println("Do you want to continue ? [Type 1 = Yes | Type 2 = No] : ");
						selection = scanner.nextInt();

						if (selection == 2) {
							System.out.println("");
							System.out.println("* * * * * * * * * * * * * * * * * * Thank You * * * * * * * * * * * * * * * * * * * * * *");
							System.out.println();
						}
						break;

					} else {
						System.out.println("Sorry!!!Our coverage - 1km to 15km..");
						System.out.println("Do you want to continue ? [type 1 = Yes | Type 2 = No] : ");
						select1 = scanner.nextInt();

						if (select1 == 2) {
							System.out.println("");
							System.out.println("* * * * * * * * * * * * * * * * * * Thank You * * * * * * * * * * * * * * * * * * * * * *");
							System.out.println();
							return;
						}
					}
				}

			} else if (que == 2) {

				int select2 = 1;
				while (select2 == 1) {

					System.out.println("");
					System.out.println("*    * *    * *    * *    * * MEDICINE DELiVERY SERVICE * *    * *    * *    * *    *");
					System.out.println("");

					System.out.println("Please Enter Your Address: ");
					String address = scanner.next();
					
					System.out.println("Please Enter Your Distance[KM]: ");
					double dist = scanner.nextDouble();
					System.out.println("");
					
					if (dist > 1 && dist <= 15) {

						System.out.println("* * * * * * * * Medicine List * * * * * * * *");
						System.out.println("");
						System.out.println("	Medicine Name		" + "Price");
						System.out.println("-------------------------------------");
						System.out.println("1. Panadol	" + "0.50");
						System.out.println("2. Vitamin C		" + "1.50");
						System.out.println("3. Vintogeno		" + "250");
						System.out.println("0. Exit");
						System.out.println("");

						System.out.println("Please Enter Medicine [1|2|3|0]:  ");
						int options = scanner.nextInt();

						if (options == 1 || options == 2 || options == 3) {

							System.out.println("How Many Medicine(S) do You Want ?  ");
							int mediCount = scanner.nextInt();
							System.out.println("");

							if (options == 1) {
								totalMediPrice = ( 0.50 * mediCount );
								System.out.println("Delivery Number \t: " + delivery_No);
								System.out.println("Order Number \t: " + order_No);
								System.out.println("Medicine Name \t: " + "Panadol");
								System.out.println("No. of medicines \t: " + mediCount);
								System.out.println("Address \t: " + address);
								System.out.println("Distance (KM) \t: " + dist + " KM");
								System.out.println("Total Price\t: " + totalMediPrice);

							} else if (options == 2) {
								totalMediPrice = (1.50 * mediCount);
								System.out.println("Delivery Number \t: " + delivery_No);
								System.out.println("Order Number \t: " + order_No);
								System.out.println("Medicine Name \t: " + "Vitamin C");
								System.out.println("No. of medicines \t: " + mediCount);
								System.out.println("Address \t: " + address);
								System.out.println("Distance (KM) \t: " + dist + " KM");
								System.out.println("Total Price\t: " + totalMediPrice);

							} else {
								totalMediPrice = (250 * mediCount);
								System.out.println("Delivery Number \t: " + delivery_No);
								System.out.println("Order Number \t: " + order_No);
								System.out.println("Medicine Name \t: " + "Vintogeno");
								System.out.println("No. of medicines \t: " + mediCount);
								System.out.println("Address \t: " + address);
								System.out.println("Distance (KM) \t: " + dist + " KM");
								System.out.println("Total Price\t: " + totalMediPrice);

							}

							if (dist > 1) {
								double delivery_Price = 150;
								delivery_Price = delivery_Price + ((dist - 1) * delivery_Price);
								totalPrice = totalMediPrice + delivery_Price;
								System.out.println("Delivery Amount [Rs]: " + delivery_Price);
							}

							System.out.println("Total Amount [Rs] \t: " + totalPrice);
							System.out.println("");

							System.out.println("Do you want to continue ? [Type 1 = Yes | Type 2 = No] : ");
							selection = scanner.nextInt();

							if (selection == 2) {
								System.out.println("");
								System.out.println("* * * * * * * * * * * * * * * * * * Thank You * * * * * * * * * * * * * * * * * * * * * *");
								System.out.println();
							}
							break;
						} else if (options == 0) {
							System.out.println("");
							System.out.println("* * * * * * * * * * * * * * * * * * Thank You * * * * * * * * * * * * * * * * * * * * * *");
							System.out.println();
							return;

						} else {
							System.out.println("");
							System.out.println("Invalid Input!! | Do you want to continue? [Type 1 = Yes | Type 2 = No] : ");
							select2 = scanner.nextInt();

							if (select2 == 2) {
								System.out.println("");
								System.out.println("* * * * * * * * * * * * * * * * * * Thank You * * * * * * * * * * * * * * * * * * * * * *");
								System.out.println();
							}
						}

					} else {
						System.out.println("Sorry!! Our coverage -1km to 15 km ");
						System.out.println("Do you want to continue? [Type 1 = Yes | Type 2 = No] : ");
						select2 = scanner.nextInt();

						if (select2 == 2) {
							System.out.println("");
							System.out.println("* * * * * * * * * * * * * * * * * * Thank You * * * * * * * * * * * * * * * * * * * * * *");
							System.out.println("");
							return;
						}
					}

				}

			} else {
				System.out.println("");
				System.out.println("Invalid Input!! | Do you want to continue ? [Type 1 = Yes | Type 2 = No] : ");
				selection = scanner.nextInt();

				if (selection == 2) {
					System.out.println("");
					System.out.println("* * * * * * * * * * * * * * * * * * Thank You * * * * * * * * * * * * * * * * * * * * * *");
					System.out.println("");
				}

			}

			while (selection != 1 && selection != 2) {
				System.out.println("");
				System.out.println("Invalid Input! [Type 1 = Continue Medicine Delivery | Type 2 = Exit] ");
				selection = scanner.nextInt();

				if (selection == 2) {
					System.out.println("");
					System.out.println("* * * * * * * * * * * * * * * * * Thank You * * * * * * * * * * * * * * * * * * * * * *");
					System.out.println("");
				}
			}
		}
	}
}

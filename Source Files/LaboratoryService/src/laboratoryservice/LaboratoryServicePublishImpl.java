package laboratoryservice;
import java.util.Random;
import java.util.Scanner;

public class LaboratoryServicePublishImpl implements LaboratoryServicePublish {

	public void LaborataryService() {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Your Name : ");
		String name = scanner.nextLine();

		System.out.println("");
		System.out.println("Hello!.." + name);
		System.out.println("");
		
		int ServiceChg = 100;

		int Services = 1;
		while (Services == 1) {

			System.out.println("\t\t    ****************Laboratary Services****************");
			System.out.println("");
			System.out.println("\t\t    	Services Name		" + "Price");
			System.out.println("\t\t    =========================================");
			System.out.println("\t\t    1. Dental Care	" + "1000");
			System.out.println("\t\t    2. Eye Care		" + "1500");
			System.out.println("\t\t    3. kidney Care		" + "2500");
			System.out.println("\t\t    4. Cancer Care		" + "1000");
			System.out.println("\t\t    5. Cardiac Care		" + "2500");
			System.out.println("\t\t    6. Child's Care		" + "2000");
			System.out.println("\t\t    0. Exit");
			System.out.println("");

			System.out.print("Please Select Laboratary Service :  ");
			int option = scanner.nextInt();

			if (option == 1 || option == 2 || option == 3 || option == 4 ||  option == 5 || option == 6) {

				Random rand = new Random();
				int orderNo = rand.nextInt(1000);

					if (option == 1) {
						double total = (1000 + ServiceChg);
						System.out.println("Order Number \t: " + orderNo);
						System.out.println("Services Name \t: " + "Dental Care");
						System.out.println("Total Price\t: " + total);
						System.out.println("");

					} else if (option == 2) {
						double total = (1500 + ServiceChg);
						System.out.println("Order Number \t: " + orderNo);
						System.out.println("Services Name \t: " + "Eye Care");
						System.out.println("Total Price\t: " + total);
						System.out.println("");

					} else if(option == 3){
						double total = (2500 + ServiceChg);
						System.out.println("Order Number \t: " + orderNo);
						System.out.println("Services Name \t: " + "kidney Care");
						System.out.println("Total Price\t: " + total);
						System.out.println("");
						
					} else if (option == 4) {
						double total = (1000 + ServiceChg);
						System.out.println("Order Number \t: " + orderNo);
						System.out.println("Services Name \t: " + "Cancer Care");
						System.out.println("Total Price\t: " + total);
						System.out.println("");

					} else if(option == 5){
						double total = (2500 + ServiceChg);
						System.out.println("Order Number \t: " + orderNo);
						System.out.println("Services Name \t: " + "Cardiac Care");
						System.out.println("Total Price\t: " + total);
						System.out.println("");

					} else {
						double total = (2000 + ServiceChg);
						System.out.println("Order Number \t: " + orderNo);
						System.out.println("Services Name \t: " + "Child's Care");
						System.out.println("Total Price\t: " + total);
						System.out.println("");

					} 

					System.out.println("Do you want to continue ? (1/2) : ");
					Services = scanner.nextInt();

					if (Services == 2) {
						System.out.println("");
						System.out.println("Thank You.....");
						System.out.println();
					}

					

			} else if (option == 0) {

				System.out.println("");
				System.out.println("Thank You.....");
				System.out.println();
				return;

			} else {

				System.out.println("");
				System.out.println("Invalid Input.!!Do you want to continue.? (1/2) : ");
				Services = scanner.nextInt();

				if (Services == 2) {
					System.out.println("");
					System.out.println("Thank You.....");
					System.out.println();
				}

			}

			while (Services != 1 && Services != 2) {
				System.out.println("");
				System.out.println("Invalid Input.");
				System.out.println("Type 1 = Continue Laboratory / Type 2 = Exit  ");
				Services = scanner.nextInt();

				if (Services == 2) {
					System.out.println();
					System.out.println("Thank You.....");
					System.out.println();
				}
			}

		}
		
	}


}

package healthcaresubscriber;

import java.util.Scanner;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import medicinedeliveryservice.MedicineDeliveryPublisher;
import medicineorderingservice.MedicineOrderingServicePublisher;
import appointmentservice.AppService;
import laboratoryservice.LaboratoryServicePublish;

public class HealthcareActivator implements BundleActivator {

	ServiceReference deliveryServiceRef, doctorAppointmentRef , medicineOrderRef , laborataryServicesRef;

	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("Start Healthcare Service Subscriber.!");
		

		medicineOrderRef = context.getServiceReference(MedicineOrderingServicePublisher.class.getName());
		MedicineOrderingServicePublisher medicineOrderingServicePublisher = (MedicineOrderingServicePublisher) context.getService(medicineOrderRef);

		deliveryServiceRef = context.getServiceReference(MedicineDeliveryPublisher.class.getName());
		MedicineDeliveryPublisher medicineDeliveryPublisher = (MedicineDeliveryPublisher) context.getService(deliveryServiceRef);

		doctorAppointmentRef = context.getServiceReference(AppService.class.getName());
		AppService appService = (AppService) context.getService(doctorAppointmentRef);
		
		laborataryServicesRef = context.getServiceReference(LaboratoryServicePublish.class.getName());
		LaboratoryServicePublish laboratoryServicePublish = (LaboratoryServicePublish) context.getService(laborataryServicesRef);
		
		Scanner sc = new Scanner(System.in);

		int options1 = 1;
		while (options1 == 1) {

			System.out.println("");
			System.out.println("                         Welcome to Healthcare center                         ");
			System.out.println("");

			System.out.println("\t\t                    Service                 ");
			System.out.println("\t\t    ----------------------------------------");
			System.out.println("");
			System.out.println("\t\t\t    1. Online order medicine");
			System.out.println("\t\t\t    2. Midicine Delivery");
			System.out.println("\t\t\t    3. Doctor Appoinment");
			System.out.println("\t\t\t    4. Laboratary Services");
			System.out.println("\t\t\t    0. Exit");
			System.out.println("");
			System.out.println("\t\t    ----------------------------------------");
			System.out.println("");

			System.out.print("Please Enter Your Option(1/2/3/4/0) :");
			int options2 = sc.nextInt();

			if (options2 == 1) {
				System.out.println("");
				medicineOrderingServicePublisher.medicineOrderingService();
				System.out.println("");

				System.out.println("Do you want to get another service ? [Type 1 = Yes | Type 2 = No] : ");
				options1 = sc.nextInt();

				if (options1 == 2) {
					System.out.println("");
					System.out.println("* * * * * * * * * * * * * * * * * THANK YOU * * * * * * * * * * * * * * * * * * * * *");
					System.out.println("");
				
				}
			}else if (options2 == 2) {
				System.out.println("");
				medicineDeliveryPublisher.MediDeliveryService();
				System.out.println("");

				System.out.println("Do you want to get another service ? [Type 1 = Yes | Type 2 = No] : ");
				options1 = sc.nextInt();

				if (options1 == 2) {
					System.out.println("");
					System.out.println("* * * * * * * * * * * * * * * * * THANK YOU * * * * * * * * * * * * * * * * * * * *");
					System.out.println("");
				
				}
			}else if (options2 == 3) {
				System.out.println("");
				appService.AppService();
				System.out.println("");

				System.out.println("Do you want to get another service ? [Type 1 = Yes | Type 2 = No] : ");
				options1 = sc.nextInt();

				if (options1 == 2) {
					System.out.println("");
					System.out.println("* * * * * * * * * * * * * * * * * THANK YOU * * * * * * * * * * * * * * * * * * * *");
					System.out.println("");
				
				}
			}else if (options2 == 4) {
				System.out.println("");
				laboratoryServicePublish.LaborataryService();
				System.out.println("");

				System.out.println("Do you want to get another service ? [Type 1 = Yes | Type 2 = No] : ");
				options1 = sc.nextInt();

				if (options1 == 2) {
					System.out.println("");
					System.out.println("* * * * * * * * * * * * * * * * * THANK YOU * * * * * * * * * * * * * * * * * * * *");
					System.out.println("");
				
				}
			}else if (options2 == 0) {

				System.out.println("");
				System.out.println("                                THANK YOU                                 ");
				System.out.println("");
				return;

			} else {
				System.out.println("");
				System.out.println("Invalid Input.!!Do you want to continue.? [Type 1 = Yes | Type 2 = No] : ");
				options1 = sc.nextInt();

				if (options1 == 2) {
					System.out.println("");
					System.out.println("                            THANK YOU                               ");
					System.out.println("");
				}
			}

			while (options1 != 1 && options1 != 2) {
				System.out.println("");
				System.out.println("Invalid Input.");
				System.out.println("Type 1 = Continue Services | Type 2 = Exit ");
				options1 = sc.nextInt();

				if (options1 == 2) {
					System.out.println();
					System.out.println("**********************************THANK YOU********************************************");
					System.out.println("");
				}
			}

		}

	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Stop Healthcare Subscriber.!");
		context.ungetService(deliveryServiceRef);
		context.ungetService(doctorAppointmentRef);
		context.ungetService(medicineOrderRef);
		context.ungetService(laborataryServicesRef);
	}
}

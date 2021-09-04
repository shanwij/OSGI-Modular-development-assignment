package appointmentservice;

/*
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
*/

import java.util.Scanner;



public class AppServiceImpl implements AppService {
	
	public void AppService() {
		
		Scanner sc = new Scanner(System.in);
		
		String Date;
		String PatientName;
		int DoctorNo;
		String roomNo;
		String DrName = null;
		
		
	/*	
		int[] AppNo = new int[20];
		int Appointment;
		int No = 1;
	*/
		int selection = 1;
		while (selection == 1) {
    /*		
		ArrayList<Integer> AppList = new ArrayList<Integer>();
		Map <String, Integer> HM = new HashMap <String,Integer>();
	*/	
		System.out.println("Welcome to Hospital Appointment Service");
		System.out.println();
		
		//Patient name
		System.out.println("Please Enter Patient Name: ");
		System.out.println();
		
		PatientName = sc.nextLine();
		
		System.out.println("Welcome :"+ PatientName);
		
		
		System.out.println("Please Follow our instructions");
		
		
		System.out.println();
		
		//Doctor name	
		System.out.println();
		System.out.println("List of Specialists");
		
		System.out.println("1. Dr. A  Room No : 1  Available days -----------> Monday , Tuesday ---------> 5.00 PM");
		System.out.println();
		System.out.println("2. Dr. B  Room No : 2  Available days -----------> Monday , Wednesday ---------> 5.00 PM");
		System.out.println();
		System.out.println("3. Dr. C  Room No : 3  Available days -----------> Tuesday , Saturday ---------> 5.00 PM");
		System.out.println();
		System.out.println("4. Dr. D  Room No : 4  Available days -----------> Thursday , Saturday ---------> 5.00 PM");
		System.out.println();
		
		
		
		
		System.out.println("Please Enter Doctor Reg No: ");
		System.out.println();
		
		DoctorNo = sc.nextInt();
		
		if(DoctorNo == 1) {
			DrName = "Dr. A";
			roomNo = "2";
			System.out.println("Monday , Tuesday ---------> 5.00 PM ");
		}
		
		else if(DoctorNo == 2) {
			DrName = "Dr. B";
			roomNo = "3";
			System.out.println("Monday , Wednessday ---------> 5.00 PM ");
		}
		
		else if(DoctorNo == 3) {
			DrName = "Dr. C";
			roomNo = "2";
			System.out.println("Tuesday , Saturday ---------> 2.00 PM ");
		}
		
		else if(DoctorNo == 4 ) {
			DrName = "Dr. D";
			roomNo = "1";
			System.out.println("Monday , Tuesday ---------> 5.00 PM ");
		}
	
		else {
			System.out.println("Entered Invalid Information");
			return;
		}
		
		
		//Date
		System.out.println("Date of the Appointment? ( Ex: 2020.01.01) ");
		System.out.println();
		
		Date = sc.next();
		
		
		// Room No
		
		System.out.println("Select the Room no ");
		System.out.println();
		
		roomNo = sc.next();
		
		
		 System.out.println();
         System.out.println("Appointment is Successfull");
         System.out.println("Customer Name:  "+ PatientName);
         System.out.println("Doctor Name: " + DrName);
         System.out.println("Room No: " + roomNo);
         System.out.println("Date : "+ Date);
         System.out.println("Price : Rs. 300.00");
         System.out.println();
		
	
		System.out.println("Thank You For The Appointment");
		System.out.println("Have A Nice Day !!!");
		System.out.println();
		return;
		}
	}
}

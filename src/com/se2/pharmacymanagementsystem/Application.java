package com.se2.pharmacymanagementsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Patient> patientList = new ArrayList<Patient>();
		boolean flag;

		System.out.println("Pharmacy Management System");
		System.out.println("Please enter the number for the operation which you want to perform:");
		System.out.println("1) Add new Patient");
		System.out.println("2) List all Patients");
		System.out.println("3) Search Patient");
		System.out.println("4) Edit Patient");
		System.out.println("5) Delete Patient");
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		boolean continueOperations = false;
		String continueChoice;

		while (continueOperations == true) {
			switch (input) {
			case 1:
				Patient p = new Patient();
				System.out.println("Please enter the patient's registration number");
				p.setRegistrationNumber(s.nextInt());
				System.out.println("Please enter the patient's name");
				p.setPatientName(s.nextLine());
				System.out.println("Please enter the patient's date of birth in the following format: yyyy.MM.dd");
				p.setDateOfBirth(s.nextLine());
				System.out.println("Please enter the patient's gender");
				p.setGender(s.nextLine());
				System.out.println("Please enter the patient's blood group");
				p.setGender(s.nextLine());
				System.out.println("Please enter the patient's address");
				p.setGender(s.nextLine());
				System.out.println("Please enter the patient's phone number");
				p.setRegistrationNumber(s.nextInt());
				patientList.add(p);
				System.out.println("Do you want to continue with any of these operations?(y/n)");
				continueChoice = s.nextLine();
				if(continueChoice.equals("y")) {
					continueOperations = true;
				}
				else if(continueChoice.equals("n")) {
					continueOperations = false;
				}
				break;

			case 2:
				System.out.println("List of all patients is as follows:");
				for (Patient patient : patientList) {
					System.out.println("Patient's registration number" + patient.getRegistrationNumber());
					System.out.println("Patient's name");
					System.out.println(
							"Patient's date of birth in the following format: yyyy.MM.dd" + patient.getDateOfBirth());
					System.out.println("Patient's gender" + patient.getGender());
					System.out.println("Patient's blood group" + patient.getBloodGroup());
					System.out.println("Patient's address" + patient.getAddress());
					System.out.println("Patient's phone number" + patient.getPhoneNumber());
				}
				System.out.println("Do you want to continue with any of these operations?(y/n)");
				continueChoice = s.nextLine();
				if(continueChoice.equals("y")) {
					continueOperations = true;
				}
				else if(continueChoice.equals("n")) {
					continueOperations = false;
				}
				break;

			case 3:
				System.out.println("Please select based on what you want to search:");
				System.out.println("1) Patient's name");
				System.out.println("2) Patient's phone number");
				int choice = s.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Please enter the patient's name");
					String searchName = s.nextLine();
					flag = false;
					for (Patient patient : patientList) {
						if (patient.getPatientName().equals(searchName)) {
							flag = true;
							System.out.println(
									"The patient is found in the list of patients and their details are as follows:");
							System.out.println("Patient's registration number" + patient.getRegistrationNumber());
							System.out.println("Patient's name");
							System.out.println("Patient's date of birth in the following format: yyyy.MM.dd"
									+ patient.getDateOfBirth());
							System.out.println("Patient's gender" + patient.getGender());
							System.out.println("Patient's blood group" + patient.getBloodGroup());
							System.out.println("Patient's address" + patient.getAddress());
							System.out.println("Patient's phone number" + patient.getPhoneNumber());
						}
					}
					if (flag == false) {
						System.out.println("The patient was not found in the list of patients.");
					}
					break;
				case 2:
					System.out.println("Please enter the patient's phone number");
					int searchPhoneNumber = s.nextInt();
					flag = false;
					for (Patient patient : patientList) {
						if (patient.getPhoneNumber() == searchPhoneNumber) {
							flag = true;
							System.out.println(
									"The patient is found in the list of patients and their details are as follows:");
							System.out.println("Patient's registration number" + patient.getRegistrationNumber());
							System.out.println("Patient's name");
							System.out.println("Patient's date of birth in the following format: yyyy.MM.dd"
									+ patient.getDateOfBirth());
							System.out.println("Patient's gender" + patient.getGender());
							System.out.println("Patient's blood group" + patient.getBloodGroup());
							System.out.println("Patient's address" + patient.getAddress());
							System.out.println("Patient's phone number" + patient.getPhoneNumber());
						}
					}
					if (flag == false) {
						System.out.println("The patient was not found in the list of patients.");
					}
					break;
				}
				System.out.println("Do you want to continue with any of these operations?(y/n)");
				continueChoice = s.nextLine();
				if(continueChoice.equals("y")) {
					continueOperations = true;
				}
				else if(continueChoice.equals("n")) {
					continueOperations = false;
				}
				break;
			case 4:
				// code for edit patient
				
				System.out.println("Do you want to continue with any of these operations?(y/n)");
				continueChoice = s.nextLine();
				if(continueChoice.equals("y")) {
					continueOperations = true;
				}
				else if(continueChoice.equals("n")) {
					continueOperations = false;
				}
				break;
			case 5:
				// code for deleting patient
				
				for (Patient patient : patientList) {

				}
				
				System.out.println("Do you want to continue with any of these operations?(y/n)");
				continueChoice = s.nextLine();
				if(continueChoice.equals("y")) {
					continueOperations = true;
				}
				else if(continueChoice.equals("n")) {
					continueOperations = false;
				}
				
			}
		}

		s.close();

	}

}

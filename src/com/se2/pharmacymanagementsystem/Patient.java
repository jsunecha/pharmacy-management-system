package com.se2.pharmacymanagementsystem;

public class Patient {
	private int registrationNumber;
	private String patientName;
	private String dateFormat;
	private String dateOfBirth;
	private String gender;
	private String bloodGroup;
	private String address;
	private int phoneNumber;
	
	@Override
	public String toString() {
		return "Patient [registrationNumber=" + registrationNumber + ", patientName=" + patientName + ", dateOfBirth="
				+ dateOfBirth + ", gender=" + gender + ", bloodGroup=" + bloodGroup + ", address=" + address
				+ ", phoneNumber=" + phoneNumber + "]";
	}



	public Patient() {
		
	}
	
	
	
	public Patient(int registrationNumber, String patientName, String dateFormat, String dateOfBirth, String gender,
			String bloodGroup, String address, int phoneNumber) {
		
		this.registrationNumber = registrationNumber;
		this.patientName = patientName;
		this.dateFormat = dateFormat;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.bloodGroup = bloodGroup;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}


	public int getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(int registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getDateFormat() {
		return dateFormat;
	}
	public void setDateFormat(String dateFormat) {
		this.dateFormat = dateFormat;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}

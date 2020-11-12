package ca.healthcare.Nov09.ver;

import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicInteger;

public class Patient extends User {
	
	
	private LocalDate bDate;
	private String gender;

	
	public Patient(String fName, String lName, String pNum, 
			String email, int year, int month, int day, String gender) {
		
		super(fName, lName, pNum, email);
		setbDate(year, month, day);
		setGender(gender);
		
	}
	
	
	public LocalDate getBDate() {
		return bDate;
	}
	
	public String getGender() {
		return gender;
	}
	
	
	public void setbDate(int year, int month, int day) {
		if (year > 0 && month > 0 && day > 0) {
	        this.bDate = LocalDate.of(year, month, day);
		} else {
			this.bDate = null;
		}
	}
	
	public void setGender(String gender) {
		if(!gender.isEmpty() && !gender.equalsIgnoreCase(null)) {
			this.gender = gender;			
		} else {
			this.gender = "Wrong Information.";
		}
	}
	
	@Override
	public String toString() {
		return "======= Patient Information =======\nID: " + super.toString() +
				"\nBirth of date: " + bDate + 
				"\nGender: " + gender + "\n===================================" + "\n";
	}
	

}


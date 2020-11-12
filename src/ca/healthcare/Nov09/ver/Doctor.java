package ca.healthcare.Nov09.ver;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Doctor extends User{
	
	private String specialty;
	private ArrayList<Appointment> appointmentArr;	
	private static final AtomicInteger counter = new AtomicInteger();
	
	
	public Doctor(String fName, String lName, String pNum, String email, String specialty) {
		
		super(fName, lName, pNum, email);
		setSpecialty(specialty);
		this.appointmentArr = new ArrayList<>();
		
	}
	
	
	
	public String getSpecialty() {
		return specialty;
	}
	
	public ArrayList<Appointment> getAppointmentArr() {
		return appointmentArr;
	}	
	
	
	
	public void setSpecialty(String specialty) {
		if(!specialty.isEmpty() && !specialty.equalsIgnoreCase(null)) {
			this.specialty = specialty;			
		} else {
			this.specialty = "Wrong Information.";
		}
	}
	
	public void setAppointmentArr(Appointment appointmentArr) {
			this.appointmentArr.add(appointmentArr);			
	}
	
	@Override
	public String toString() {
		return "======= Doctor Information =======\n" + super.toString() +
				"\nSpecialty: " + specialty + "\n";
//				+ "\nAppointment: " + appointmentArr + "\n";
	}
}

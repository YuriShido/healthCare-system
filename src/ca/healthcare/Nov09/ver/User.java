package ca.healthcare.Nov09.ver;

import java.util.concurrent.atomic.AtomicInteger;

public class User {
	
	private int id;
	private String fName;
	private String lName;
	private String pNum;
	private String email;
	private static final AtomicInteger counter = new AtomicInteger();
	
	public User(String fName, String lName, String pNum, String email) {
		setId();
		setFName(fName);
		setLName(lName);
		setPNum(pNum);
		setEmail(email);
	}

	
	public int getId() {
		return id;
	}
	
	public String getFName() {
		return fName;
	}
	
	public String getLName() {
		return lName;
	}
	
	public String getPNum() {
		return pNum;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setId() {
		this.id = 1000 + counter.getAndIncrement();
		
	}
	
	public void setFName(String fName) {
		if(!fName.isEmpty() && !fName.equalsIgnoreCase(null)) {
			this.fName = fName;			
		} else {
			this.fName = "Wrong Information.";
		}
	}
	
	public void setLName(String lName) {
		if(!lName.isEmpty() && !lName.equalsIgnoreCase(null)) {
			this.lName = lName;			
		} else {
			this.lName = "Wrong Information.";
		}
	}
	
	public void setPNum(String pNum) {
		if(!pNum.isEmpty() && !pNum.equalsIgnoreCase(null)) {
			this.pNum = pNum;			
		} else {
			this.pNum ="Wrong Information.";
		}
	}
	
	public void setEmail(String email) {
		if(!email.isEmpty() && !email.equalsIgnoreCase(null)) {
			this.email = email;			
		} else {
			this.email = "Wrong Information.";
		}
	}
	
	@Override
	public String toString() {
		return "ID: " + id +
				"\nName: " + fName + " " + lName +
				"\nPhone Number: " + pNum +
				"\nEmail: " + email;
	}

}

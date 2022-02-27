package laura.telecomacademy.java1.exextra.mirabelatabacu.cap4mostenire;

public class Client {
	
	private String lastName; //nume
	private String firstName; //prenume
	private int age;
	private String CNP;
	private boolean hasFidelityCard;
	
	public Client() {
		
	}
	
	public Client(String lastName, String firstName, int age, String CNP, boolean hasFidelityCard) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
		if(age < 18) {
			this.CNP = "000XXXXXXXX";
			this.hasFidelityCard = false;
		}
		else {
			this.CNP = CNP;
			this.hasFidelityCard = hasFidelityCard;
		}
	}
	
	public double calculateDiscount(double amountSpent) {
		double discount = 0.0d;
		if(hasFidelityCard) {
			discount =amountSpent *  0.15;
		}
		System.out.println("Amount Spent: " + amountSpent + " The client the following discount:  " + discount );
		return discount;
	}

	public String getCNP() {
		return CNP;
	}

	public void setCNP(String cNP) {
		CNP = cNP;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isHasFidelityCard() {
		return hasFidelityCard;
	}

	public void setHasFidelityCard(boolean hasFidelityCard) {
		this.hasFidelityCard = hasFidelityCard;
	}
	
	@Override
	public String toString() {
		return "Last name: " + this.lastName 
				+ ", First name: " + this.firstName
				+ ", age: " + this.age
				+ ", CNP:  " + this.CNP
				+ ", Fidelity card: " + (hasFidelityCard? "yes" : "no"); 
	}
	

}

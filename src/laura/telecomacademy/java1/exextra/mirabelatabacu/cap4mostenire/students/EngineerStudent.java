package laura.telecomacademy.java1.exextra.mirabelatabacu.cap4mostenire.students;

public class EngineerStudent extends Student {
	
	private boolean isOnline;

	public EngineerStudent(String lastName, String firstName, String CNP, boolean isOnline) {
		super(lastName, firstName, CNP);
		setType("Engineer Student");
		this.isOnline = isOnline;
	}
	
	public boolean isOnline() {
		return isOnline;
	}
	
	
	@Override
	public void studentDetails() {
		System.out.println(lastName+ " " + firstName + " " + CNP + " " + getType() + " " + isOnline  );
		
	}
	

}

package laura.telecomacademy.java1.exextra.mirabelatabacu.cap4mostenire.students;

public abstract class Student {
	
	public String lastName;
	public String firstName;
	String CNP;
	private String type;
	
	public Student(String lastName, String firstName, String CNP) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.CNP = CNP;
	}
	
	public Student(String lastName, String firstName, String CNP, String type) {
		this(lastName, firstName, CNP);
		this.type = type;
	}
	
	public abstract void studentDetails();
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	public static EngineerStudent changeForeignLanguageStudent( ForeignLanguageStudent foreignLanguageStudent, boolean isOnline) {
		 EngineerStudent engStud = new EngineerStudent(foreignLanguageStudent.lastName,
				 foreignLanguageStudent.firstName,
				 foreignLanguageStudent.CNP,
				 isOnline);
		 return engStud;
	 }
	
	public static ForeignLanguageStudent changeEngineerStudent(EngineerStudent engineerStudent, boolean isStudyingEnglish) {
		ForeignLanguageStudent forStud = new ForeignLanguageStudent(engineerStudent.lastName,
				engineerStudent.firstName,
				engineerStudent.CNP,
				isStudyingEnglish
				);
		return forStud;
	}
	

}

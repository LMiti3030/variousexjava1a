package laura.telecomacademy.java1.exextra.mirabelatabacu.cap4mostenire.students;

public class ForeignLanguageStudent extends Student{
	
	private boolean isStudyingEnglish;
	
	public void isStudyingEnglish() {
		if(isStudyingEnglish) {
			System.out.println("Student " + firstName + " is studying English");
		}
		else {
			System.out.println("Student " + firstName + " is not studying English");
		}
		
	}
	
	public ForeignLanguageStudent(String lastName, String firstName, String CNP, boolean isStudyingEnglish) {
		super(lastName, firstName, CNP);
		setType("Foreing Language Student");
		this.isStudyingEnglish = isStudyingEnglish;
	}

	@Override
	public void studentDetails() {
		System.out.println(lastName+ " " + firstName + " " + CNP + " " + getType() + " " + isStudyingEnglish  );
		
	}
	

}

package laura.telecomacademy.java1.exextra.mirabelatabacu.cap4mostenire.students;

public class TestStudent {
	
	public static void main(String[] args) {
		ForeignLanguageStudent maria = new ForeignLanguageStudent("Popescu","Maria", "123456789", true);
		maria.studentDetails();
		maria.isStudyingEnglish();
		EngineerStudent george = new EngineerStudent ("Ionescu", "George", "123456789", false);
		george.studentDetails();
		Student.changeEngineerStudent(george, false).studentDetails();
		
	}

}

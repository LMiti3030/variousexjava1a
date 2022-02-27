package laura.telecomacademy.java1.exextra.mirabelatabacu.cap4mostenire.animals;

public class Bird extends Animal{
	
	private boolean hasFeathers = true;

	@Override
	void animalEating() {
		System.out.println("Bird eating insects");
		
	}

	public boolean isHasFeathers() {
		return hasFeathers;
	}

}

package laura.telecomacademy.java1.exextra.mirabelatabacu.cap4mostenire.animals;

public final class Lion extends Mamal {
	
	public Lion(int age) {
		super(age);
	}
	
	public Lion(int age, String name) {
		super(age, name);
	}

	@Override
	void makeSound() {
		System.out.println("The lion " + getName() + " ROARS!");
		
	}

	@Override
	void animalEating() {
		System.out.println(" Lion eating an antelope");
		
	}
	
	
	

}

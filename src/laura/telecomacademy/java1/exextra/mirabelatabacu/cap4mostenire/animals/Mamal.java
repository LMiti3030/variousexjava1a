package laura.telecomacademy.java1.exextra.mirabelatabacu.cap4mostenire.animals;

public abstract class Mamal extends Animal{

	private boolean hasFur = true;
	
	public boolean isHasFur() {
		return hasFur;
	}
	
	abstract void makeSound();
	
	public Mamal(int age, String name) {
		setAge(age);
		setName(name);
	}
	
	public Mamal(int age) {
		setAge(age);
	}

}

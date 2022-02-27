package laura.telecomacademy.java1.exextra.mirabelatabacu.cap4mostenire.animals;

public class Tiger extends Mamal {
	
	private int noStripes;
	
	public Tiger(int age) {
		super(age);
	}
	
	public Tiger(int age, String name, int noStripes) {
		super(age, name);
		this.noStripes = noStripes;
	}

	public int getNoStripes() {
		return noStripes;
	}

	public void setNoStripes(int noStripes) {
		this.noStripes = noStripes;
	}

	@Override
	void makeSound() {
		System.out.println("The tiger is mewoing");		
	}

	@Override
	void animalEating() {
		System.out.println("Tiger eating");
		
	}
	

}

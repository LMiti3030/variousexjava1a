package laura.telecomacademy.java1.exextra.mirabelatabacu.cap4mostenire.animals;

public class TestAnimals {
	
	public static void main(String[] args) {
		Animal[] animals = new Animal[] {
				new Bird(),
				new Lion(5),
				new Tiger(7)
		};
		for(Animal a: animals) {
			a.animalEating();
			if(a instanceof Mamal) {
				((Mamal) a).makeSound();
			}
		}
				
	}
	
}

package laura.telecomacademy.java1.exextra.mirabelatabacu.cap4mostenire.animals;

public abstract class Animal {
	
	private int age;
	private String name;
	
	abstract void animalEating() ;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}

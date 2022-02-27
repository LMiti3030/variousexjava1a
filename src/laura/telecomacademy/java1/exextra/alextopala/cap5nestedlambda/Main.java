package laura.telecomacademy.java1.exextra.alextopala.cap5nestedlambda;


public class Main {

	public static void main(String[] args) {
		Zoo zoo = Zoo.getInstance();
		zoo.adaugaAnimal(new AnimalTerestru("Elefant", 5, 200, "Africa"));
		zoo.adaugaAnimal(new AnimalTerestru("Lup", 2, 17, "Europa"));
		zoo.adaugaAnimal(new AnimalTerestru("Cangur", 6, 20, "Australia"));
		zoo.adaugaAnimal(new AnimalAcvatic("Balena", 3, 1200));
		zoo.adaugaAnimal(new AnimalAcvatic("Salau", 1, 1));
		zoo.adaugaAnimal(new AnimalAcvatic("Foca", 4, 80));
		//Utils.afiseazaAnimale(zoo.findAnimaleByVarsta(2,5));
		//Utils.afiseazaAnimale(zoo.findAnimaleAcvatice());
		zoo.adaugaAnimal(new AnimalAcvatic("Balena", 4, 80));
		Utils.afiseazaAnimale(zoo.getAnimale());
	}

}

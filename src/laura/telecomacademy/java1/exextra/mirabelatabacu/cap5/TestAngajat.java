package laura.telecomacademy.java1.exextra.mirabelatabacu.cap5;

public class TestAngajat {
	
	public static void main(String[] args) {
		AngajatIT petre = new AngajatIT("Georgescu", "Petre", "Java", 3);
		//petre.salariu = 4;
		System.out.println(petre + " salariu " + petre.calculeazaSalariu());
		AngajatHR ana = new AngajatHR("Marinescu", "Ana", 5);
		System.out.println(ana + " salariu " + ana.calculeazaSalariu());
		System.out.println(ana.verificaDepartament());
	}
	

}

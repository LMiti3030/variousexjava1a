package laura.telecomacademy.java1.exextra.mirabelatabacu.cap3oo;

public class GesiuneAngajati {

	public static void main(String[] args) {
		Angajat radu = new Angajat("Popescu", "Radu", 250d, 2, "Iriceanu", 6);
		System.out.println(radu);
		System.out.println(radu.calculeazaBonus("vechime aranjata"));
		
		Adresa adr = new Adresa (" Vitan ", 32);
		radu.modificaAdresa(adr);
		System.out.println(radu);

	}

}

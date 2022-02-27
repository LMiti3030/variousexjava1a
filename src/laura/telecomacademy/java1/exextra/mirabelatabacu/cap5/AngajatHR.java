package laura.telecomacademy.java1.exextra.mirabelatabacu.cap5;

public class AngajatHR extends DepartamentHR implements Angajat {
	
	double salariu;
	
	
	public AngajatHR(String nume, String prenume, int nivel) {
		this.nume = nume;
		this.prenume = prenume;
		switch(nivel){
		case 1: this.nivel = nivel;
				salariu = 2000d;
				break;
		case 2: this.nivel = nivel;
				salariu = 3000d;
				break;
		default: this.nivel = -1;
				salariu = 0.0d;
				break;
		};
	}
	
	
	public String verificaDepartament(){
		return "Angajatul face parte din departamentul HR";
	}

	@Override
	public double calculeazaSalariu() {
		return salariu;
	}

	@Override
	public String toString() {
		return "Angajatul " + nume + " " + prenume + " face parte din Departamentul HR si are nivelul " + nivel;
	}
	
}

package laura.telecomacademy.java1.exextra.mirabelatabacu.cap5;

public class AngajatIT extends DepartamentIT implements Angajat {
	
	final double salariu;
	
	public AngajatIT(String nume, String prenume, String limbaj, int nivel) {
		this.nume = nume;
		this.prenume = prenume;
		this.limbaj = limbaj;
		if(nivel <0 || nivel >5) {
			this.nivel = -1;
		}
		else {
			this.nivel = nivel;
		}
		salariu = switch(nivel){
		case 0: yield 1000d;
		case 1: yield 2000d;
		case 2: yield 3000d;
		case 3: yield 4000d;
		case 4: yield 5000d;
		case 5: yield 6000d;
		default: yield 0.0d;
		};
	}
	
	public double calculeazaSalariu() {
		return salariu;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if(o!=null && o instanceof AngajatIT) {
			AngajatIT ang = (AngajatIT) o;
			if (this.limbaj == ang.limbaj && this.salariu == ang.salariu)
				return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Angajatul " + nume + " " + prenume + " face parte din Departamentul IT si are nivelul " + nivel;
	}
	

}

package laura.telecomacademy.java1.exextra.mirabelatabacu.cap3oo;

public class Angajat {
	
	private String nume;
	private String prenume;
	private double salariu;
	private int vechime;
	private Adresa adresa;
	
	public Angajat(String nume, String prenume, double salariu, int vechime, Adresa adresa) {
		this.nume = nume;
		this.prenume = prenume;
		this.salariu = salariu;
		this.adresa = adresa;
	}
	
	public Angajat(String nume, String prenume, double salariu, int vechime, String strada, int numar ) {
		this(nume, prenume, salariu, vechime, new Adresa(strada, numar));
	}
	
	@Override
	public String toString() {
		return "Nume: " + nume + " prenume: " + prenume + " salariu: " + salariu + " vechime " + vechime + " adresa " + adresa;
	}
	
	public void modificaAdresa(String strada, int nr) {
		if(adresa != null ) {
			adresa.modificaAdresa(strada, nr);
		}
		else {
			adresa = new Adresa(strada, nr);
		}		
	}
	
	public void modificaAdresa(Adresa adresa) {
		this.adresa = adresa;
	}
	
	public double calculeazaBonus(String tip) {
		return switch(tip) {
		case "vechime mica": 
			yield 100d;
		case "vechime medie":
			yield 250d;
		case "angajat vechi" :
			yield 500;
		default:
			yield -1;	
		};
	}
	

	
}

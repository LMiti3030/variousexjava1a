package laura.telecomacademy.java1.exextra.alextopala.cap2structuri;

public class Persoana {
	
	private String nume;
	private int varsta;
	
	public Persoana(String nume, int varsta) {
		this.nume = nume;
		this.varsta = varsta;
	}
	
	@Override
	public String toString() {
		return nume + " " + varsta;
	}

}

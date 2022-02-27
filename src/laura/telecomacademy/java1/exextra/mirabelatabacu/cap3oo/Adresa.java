package laura.telecomacademy.java1.exextra.mirabelatabacu.cap3oo;

public class Adresa {
	private String strada;
	private int nr;
	
	public Adresa(String strada, int nr) {
		modificaAdresa(strada, nr);
	}
	
	public void modificaAdresa(String strada, int nr) {
		this.strada = strada;
		this.nr = nr;
	}
	
	@Override
	public String toString() {
		return "strada : " + strada + " numar: " + nr;
	}
	

}

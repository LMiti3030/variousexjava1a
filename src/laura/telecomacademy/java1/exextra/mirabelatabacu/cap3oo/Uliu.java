package laura.telecomacademy.java1.exextra.mirabelatabacu.cap3oo;

public class Uliu {
	static String tip = "Carnivora";
	String nume;
	int greutate;
	int varsta;
	
	public Uliu(String nume, int greutate, int varsta) {
		this.nume = nume;
		this.greutate = greutate;
		this.varsta = varsta;
	}
	
	public Uliu() {		
	}
	
	public Uliu(String nume, int varsta) {
		this.nume = nume;
		this.varsta = varsta;
		this.greutate = 2 * varsta;
	}
	
	public int calculeazaDistanta() {
		int distanta;
		if(greutate < 10) {
			distanta = 3 * greutate;
		}
		else {
			distanta = 2 * greutate;
		}
		return distanta;
	}
	
	public int calculeazaDistanta(int k) {
		if (k < 0) {
			return (-k) * varsta;
		}
		else {
			return k * varsta;
		}
	}	
	
	public int calculeazaDistanta(int x, int y) {
		if(x > 0 && y > 0) {
			return (y > x)? y-x : x - y; 
		}
		else if(x < 0 && y > 0) {
			return (-x) + y; 
		}
		else if(x > 0 && y < 0) {
			return x + (-y); 
		}
		else { // x, y <0
			return (y > x)? (-x) - (-y) : (-y) - (-x); 
		}
	}
	
	public static void mananca (String mancare) {
		System.out.println("Pasarea " + tip + " mananca " + mancare);
	}
	
	public static void schimbaNume(Uliu uliu, String nume ) {
		uliu.nume = nume;
	}
	
	@Override
	public String toString() {
		return nume + ", "+varsta + "ani, "+ greutate + "kg";
		}
	
	public static void main(String[] args) {
		Uliu gigel = new Uliu("Gigel", 3);
		System.out.println(gigel.toString());
		System.out.println(gigel.calculeazaDistanta(-13, 7));
		System.out.println(gigel.calculeazaDistanta(2, 9));
		System.out.println(gigel.calculeazaDistanta(20, 3));
		System.out.println(gigel.calculeazaDistanta(-3, -20));	
		System.out.println(gigel.calculeazaDistanta(-23, -3));
		System.out.println(gigel.calculeazaDistanta(-3));
		System.out.println(gigel.calculeazaDistanta());
		Uliu.schimbaNume(gigel, "Mircea");
		System.out.println(gigel.toString());
		Uliu.mananca("soareci");
		System.out.println(gigel.toString());
		Uliu dana = new Uliu ("Dana", 12, 10 );
		System.out.println(dana);
		System.out.println(dana.calculeazaDistanta());
	}

}

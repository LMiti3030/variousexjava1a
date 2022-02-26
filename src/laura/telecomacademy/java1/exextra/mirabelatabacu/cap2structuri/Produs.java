package laura.telecomacademy.java1.exextra.mirabelatabacu.cap2structuri;

public class Produs {
	
	String nume;
	double pret;
	int numarRaion;
	
	public Produs (String nume, double pret, int numarRaion) {
		this.nume = nume;
		this.pret = pret;
		this.numarRaion = numarRaion;
	}
	
	public double calculeazăReducere() {
		double reducere = 0.0d;
		if(pret > 100 && numarRaion == 3)
			reducere = 0.25 * pret;
		return reducere;
	}

	public void modificRaion(int raion) {
		this.numarRaion = raion;
	}
	
	@Override
	public String toString() {
		return this.nume;
	}
	
	
	public static void main(String[] args) {
		Produs detergent = new Produs ("Ariel", 150, 3);
		Produs biscuiti = new Produs ("Leibniz", 20, 4);
		Produs balsamRufe = new Produs ("Cocolino", 78, 3);
		System.out.println(detergent + " are reducerea de " + detergent.calculeazăReducere() );
		System.out.println(biscuiti + " are reducerea de " + biscuiti.calculeazăReducere() );
		System.out.println(balsamRufe + " are reducerea de " + balsamRufe.calculeazăReducere() );
		
	}
	
	

}

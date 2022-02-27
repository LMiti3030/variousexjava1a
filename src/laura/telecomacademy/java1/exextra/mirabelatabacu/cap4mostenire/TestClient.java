package laura.telecomacademy.java1.exextra.mirabelatabacu.cap4mostenire;

public class TestClient {

	public static void main(String[] args) {
//		Client george = new Client ("Popescu", "George", 35, "18536996532", true);
//		Client maria = new Client ("Ionescu", "Maria", 13, "290156397865", true);
//		Client catalin = new Client ("Gheorghe", "Catalin", 35, "30259634635", false);
		Client[] clients = new Client[] {new Client ("Popescu", "George", 35, "18536996532", true),
				new Client ("Ionescu", "Maria", 13, "290156397865", true), 
				new Client ("Gheorghe", "Catalin", 35, "30259634635", false)};
		double amount = 2530.56d;
		for(Client c: clients) {
			System.out.println(c);
			c.calculateDiscount(amount);
			amount *=0.75;
		}
	}

}

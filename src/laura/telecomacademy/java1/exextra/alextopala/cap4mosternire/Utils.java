package laura.telecomacademy.java1.exextra.alextopala.cap4mosternire;

public class Utils {
	
	private Utils() {
		
	}
	
	public static Animal[] copy(Animal[] a) {
		Animal[] copie = new Animal[a.length];
		for(int i =0; i<a.length; i++) {
			copie[i] = a[i];
		}
		return copie;
	}
	
    public static void afiseazaAnimale(Animal[]z ) {
    	for (int i = 0; i< z.length; i++) {
    		if(z[i]!= null) {
    			System.out.println(z[i]);
    		}
    	}
    }

}

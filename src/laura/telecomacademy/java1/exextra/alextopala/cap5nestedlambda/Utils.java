package laura.telecomacademy.java1.exextra.alextopala.cap5nestedlambda;

public final class Utils {
    private Utils() {
    }
    
    public static Animal[] copy(Animal [] org) {
        Animal[] copy = new Animal[org.length];
        int i = 0;
        while (i < org.length && org[i] != null) {
            copy[i] = org[i];
            i++;
        }
        return copy;
    }
    
    public static void afiseazaAnimale(Animal[]z ) {
    	for (int i = 0; i< z.length; i++) {
    		if(z[i]!= null) {
    			System.out.println(z[i]);
    		}
    	}
    }

}
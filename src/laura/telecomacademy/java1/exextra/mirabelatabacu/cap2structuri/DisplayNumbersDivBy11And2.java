package laura.telecomacademy.java1.exextra.mirabelatabacu.cap2structuri;

/*Să se scrie un program care parcurge toate numerele de la 1 la 100 și 
 * afisază numai numerele care sunt divizibile cu 11 și 2.
 * 
 */

public class DisplayNumbersDivBy11And2 {
	
	public static void main(String[] args) {
		for(int i = 1; i<=100; i++) {
			if((i%11 == 0) || (i%2 == 0)) {
				System.out.println(i);
			}
		}
		
		
	}

}

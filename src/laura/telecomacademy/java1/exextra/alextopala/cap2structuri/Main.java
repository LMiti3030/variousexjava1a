package laura.telecomacademy.java1.exextra.alextopala.cap2structuri;

public class Main {
    public static void main(String [] args) {
    	
    	System.out.println(createPersoana("Gigel Popescu ", 35));
    	
    }
    
 // TODO: Scrie o metoda numita "createPersoana" care primeste un parametru de tip String reprezentand numele unei persoane si 
    //       un parametru de tip int reprezentand varsta unei persoane si care returneaza o instanta de Persoana cu numele si varsta
    //       date
    
    public static Persoana createPersoana(String nume, int varsta) {
    	return new Persoana(nume, varsta);
    }
    
}
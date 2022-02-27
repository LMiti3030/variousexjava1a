package laura.telecomacademy.java1.exextra.alextopala.cap5nestedlambda;

public class Animal {
    private static int idGenerator = 0;
    private String nume;
    private int varsta;
    private int greutate;
    private final int id;
    
    public Animal(String nume, int varsta, int greutate) {
        this.nume = nume;
        this.varsta = varsta;
        this.greutate = greutate;
        id = idGenerator++;
    }
    
    public int getId() {
        return id;
    }
    
    public String getNume() {
        return nume;
    }
    
    public void setNume(String nume) {
        this.nume = nume;
    }
    
    public int getVarsta() {
        return varsta;
    }
    
    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
    
    public int getGreutate() {
        return greutate;
    }
    
    public void setGreutate(int greutate) {
        this.greutate = greutate;
    }
    
    @Override
    public String toString() {
        return "nume=" + nume + ", varsta=" + varsta + ", greutate=" + greutate; 
    }
    
    // TODO: defineste regula de egalitate intre doua instante de "Animal" astfel: "doua animale sunt egale daca au acelasi nume"
    //       (respecta contractul metodei "equals")
    
    @Override
    public boolean equals(Object o) {
    	if(this == o ) {
    		return true;
    	}
    	if(o != null && o instanceof Animal) {
    		Animal an = (Animal) o;
    		if(an.nume == this.nume) {
    			return true;
    		}
    	}
    	return false;
    }
    
    

}
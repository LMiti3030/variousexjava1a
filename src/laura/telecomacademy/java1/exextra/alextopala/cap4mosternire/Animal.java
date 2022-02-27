package laura.telecomacademy.java1.exextra.alextopala.cap4mosternire;

import java.util.concurrent.atomic.AtomicInteger;

/*
 *  TODO: incapsuleaza clasa Animal 
 */
public class Animal {
    private String nume;
    private int varsta;
    private int greutate;
    private final int id;
    static AtomicInteger nextId = new AtomicInteger();
    
    public Animal(String nume, int varsta, int greutate) {
        this.nume = nume;
        this.varsta = varsta;
        this.greutate = greutate;
        // TODO: atribuie variabilei de instanta "id" o valoare unica pentru fiecare instanta
        this.id = nextId.incrementAndGet();
    }    
    
    @Override
    public String toString() {
        return "nume=" + nume + ", varsta=" + varsta + ", greuate=" + greutate; 
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
    
    public void setGreutate(int greutate) {
    	this.greutate = greutate;
    }
    
    public int getGreutate() {
    	return greutate;
    }
    
    public int getId() {
    	return id;
    }
    
    
}
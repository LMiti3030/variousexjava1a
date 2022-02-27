package laura.telecomacademy.java1.exextra.alextopala.cap4mosternire;

public class AnimalTerestru extends Animal {
    private String regiune;
    
    public AnimalTerestru(String nume, int varsta, int greutate, String regiune) {
        super(nume, varsta, greutate);
        this.regiune = regiune;
    }
    
    public String getRegiune() {
        return regiune;
    }
    
    public void setRegiune(String regiune) {
        this.regiune = regiune;
    }
}
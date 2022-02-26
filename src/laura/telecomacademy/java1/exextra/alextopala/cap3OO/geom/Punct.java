package laura.telecomacademy.java1.exextra.alextopala.cap3OO.geom;

public class Punct {
	int x;
	int y;
	
	public Punct(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public double getDistance(int x, int y) {
		return Math.sqrt(((this.x - x)* (this.x - x)) + ((this.y - y)* (this.y - y)));
	}
}

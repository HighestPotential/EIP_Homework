package defaultPackage;

public class Point {
	private double x, y;
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y=y;
	}
	
	public Point(double x, double y) {
		this.x=x;
		this.y=y;
	}
	
	public double distanceTo (Point other) {
		
		return Pythagoras.calculate((other.getX()-this.x), (other.getY()-this.y));
	}
	
	public void shift(double xShift, double yShift) {
		this.x+=xShift;
		this.y+=yShift;
	}
	
	
}

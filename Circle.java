
public class Circle {
	double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}
	
	public double getL() {
		double Y;
		Y = Math.PI*radius*2;	//Формула площади круга = Math.PI*(radius*radius)
		return Math.round(Y);
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getL()=" + (int) getL() + "]";
	}
	
}

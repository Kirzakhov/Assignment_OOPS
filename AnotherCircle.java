package assignment;

class MyCircle{
	private double radius;
	public MyCircle() {	}
	public MyCircle(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return this.radius*this.radius*Math.PI;
	}
	public double getCircumference() {
		return 2*Math.PI*this.radius;
	}
	public String toString() {
		return "Circle[radius="+this.radius+"]";
	}
}

public class AnotherCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  MyCircle c1 = new MyCircle(1.1);
	      System.out.println(c1);   // toString()
	      MyCircle c2 = new MyCircle(); // default constructor
	      System.out.println(c2);

	      // Test setter and getter
	      c1.setRadius(2.2);
	      System.out.println(c1);      // toString()
	      System.out.println("radius is: " + c1.getRadius());
	      System.out.printf("area is: %.2f%n", c1.getArea());
	      System.out.printf("circumference is: %.2f%n", c1.getCircumference());

	}

}

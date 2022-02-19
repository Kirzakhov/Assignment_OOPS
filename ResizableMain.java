package assignment;

interface Resizable{
	public void resize(int percent);
}
class Circle3 implements GeometricObject{
	protected double radius;
	public Circle3(double radius) {
		this.radius = radius;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.radius*this.radius*Math.PI;
	}
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*Math.PI*this.radius;
	}
	public String toString() {
		return "Circle[radius="+this.radius+"]";
	}
}
class ResizableCircle extends Circle3 implements Resizable{

	public ResizableCircle(double radius) {
		super(radius);
	}

	@Override
	public void resize(int percent) {
		super.radius *= percent/100;
	}
	
}

public class ResizableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

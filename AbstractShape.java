package assignment;

abstract class MyShape{
	private String color;
	private boolean filled;
	public MyShape() {
		this.color = "red";
		this.filled = true;
	}
	public MyShape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public String toString() {
		return "Shape[color="+this.color+",filled="+this.isFilled()+"]";
	}
	abstract double getArea();
	abstract double getPerimeter();
}

class MyCircle2 extends MyShape{
	private double radius;
	public MyCircle2() {
		this.radius = 1.0;
	}
	public MyCircle2(double radius) {
		this.radius = radius;
	}
	public MyCircle2(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return Math.PI*this.radius*this.radius;
	}
	public double getPerimeter() {
		return 2*Math.PI*this.radius;
	}
	public String toString() {
		return "Circle["+super.toString()+",radius="+this.radius+"]";
	}
}

class MyRectangle1 extends MyShape{
	private double width;
	private double length;
	public MyRectangle1() {
		this.width = 1.0;
		this.length = 1.0;
	}
	public MyRectangle1(double width, double length) {
		this.width = width;
		this.length = length;
	}
	public MyRectangle1(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getArea() {
		return this.length * this.width;
	}
	public double getPerimeter() {
		return 2*(this.length+this.width);
	}
	public String toString() {
		return "Rectangle["+super.toString()+",length="+this.length+",width="+this.width+"]";
	}
}

class MySquare extends MyRectangle1{
	private double side;
	public MySquare() {}
	public MySquare(double side) {
		super(side, side);
		this.side = side;
	}
	public MySquare(double side, String color, boolean filled) {
		super(side, side, color, filled);
		this.side = side;
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	public void setWidth(double width) {
		this.side = width;
	}
	public void setLength(double length) {
		this.side = length;
	}
	public String toString() {
		return "Square["+super.toString()+"]";
	}
}

public class AbstractShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyShape s1 = new MyCircle2(5.5, "red", false);  // Upcast Circle to Shape
		System.out.println(s1);                    // which version?
		System.out.println(s1.getArea());          
		System.out.println(s1.getPerimeter());     // which version?
		System.out.println(s1.getColor());
		System.out.println(s1.isFilled());
		   
		MyCircle2 c1 = (MyCircle2)s1;                   // Downcast back to Circle
		System.out.println(c1);
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());
		System.out.println(c1.getColor());
		System.out.println(c1.isFilled());
		System.out.println(c1.getRadius());
		   
		MyShape s3 = new MyRectangle1(1.0, 2.0, "red", false);   // Upcast
		System.out.println(s3);
		System.out.println(s3.getArea());
		System.out.println(s3.getPerimeter());
		System.out.println(s3.getColor());
		   
		MyRectangle1 r1 = (MyRectangle1)s3;  
		System.out.println(r1);
		System.out.println(r1.getArea());
		System.out.println(r1.getColor());
		System.out.println(r1.getLength());
		   
		MyShape s4 = new MySquare(6.6);     // Upcast
		System.out.println(s4);
		System.out.println(s4.getArea());
		System.out.println(s4.getColor());
		  
		// Take note that we downcast Shape s4 to Rectangle, 
		//  which is a superclass of Square, instead of Square
		MyRectangle1 r2 = (MyRectangle1)s4;
		System.out.println(r2);
		System.out.println(r2.getArea());
		System.out.println(r2.getColor());
		System.out.println(r2.getLength());
		   
		// Downcast Rectangle r2 to Square
		MySquare sq1 = (MySquare)r2;
		System.out.println(sq1);
		System.out.println(sq1.getArea());
		System.out.println(sq1.getColor());
		System.out.println(sq1.getSide());
		System.out.println(sq1.getLength());

	}

}
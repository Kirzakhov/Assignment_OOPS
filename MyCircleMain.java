package assignment;

class MyCircle1{
	private MyPoint center;
	private int radius;
	public MyCircle1() {
		this.center = new MyPoint(0,0);
		this.radius = 1;
	}
	public MyCircle1(MyPoint center, int radius) {
		this.center = center;
		this.radius = radius;
	}
	public MyCircle1(int x, int y, int radius) {
		this.center = new MyPoint(x, y);
		this.radius = radius;
	}
	public MyPoint getCenter() {
		return center;
	}
	public void setCenter(MyPoint center) {
		this.center = center;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getCenterX() {
		return this.center.getX();
	}
	public void setCenterX(int x) {
		this.center.setX(x);
	}
	public int getCenterY() {
		return this.center.getY();
	}
	public void setCenterY(int y) {
		this.center.setY(y);
	}
	public int[] getCenterXY() {
		int arr[] = {this.getCenterX(), this.getCenterY()};
		return arr;
	}
	public void setCenterXY(int x, int y) {
		this.setCenterX(x);
		this.setCenterY(y);
	}
	public String toString() {
		return "MyCircle[radius="+this.radius+",center="+center.toString()+")]";
	}
	public double getArea() {
		return Math.PI*this.radius*this.radius;
	}
	public double getCircumference() {
		return 2*Math.PI*this.radius;
	}
	public double distance(MyCircle1 another) {
		int xDiff = this.getCenterX() - another.getCenterX();
		int yDiff = this.getCenterY() - another.getCenterY();
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	}
}

public class MyCircleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCircle1 mc1 = new MyCircle1();
		System.out.println(mc1.getCenterX());
		System.out.println(mc1.getCenterY());
		System.out.println(mc1.getArea());
		System.out.println(mc1.getCircumference());
		MyPoint center = new MyPoint(2,2);
		MyCircle1 mc2 = new MyCircle1(center, 2);
		System.out.println(mc2);
		System.out.println(mc2.getCenterXY()[0]);
		System.out.println(mc2.getCenterXY()[1]);
		MyCircle1 mc3 = new MyCircle1(3, 4, 5);
		System.out.println(mc3);
		System.out.println("Distance between mc2 and mc3 = " + mc2.distance(mc3));
	}

}

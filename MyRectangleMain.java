package assignment;

class MyRectangle{
	MyPoint v1;
	MyPoint v2;
	public MyRectangle(MyPoint v1, MyPoint v2) {
		this.v1 = v1;
		this.v2 = v2;
	}
	public MyRectangle(int x1, int y1, int x2, int y2) {
		this.v1 = new MyPoint(x1, y1);
		this.v2 = new MyPoint(x2, y2);
	}
	public String toString() {
		return "MyRectangle[ver1=("+this.v1.getX()+","+this.v1.getY()+"),ver2=("+this.v2.getX()+
				","+this.v1.getY()+"),ver3=("+this.v2.getX()+","+this.v2.getY()+"),ver4=("+
				this.v1.getX()+","+this.v2.getY()+")]";
	}
	public int getPerimeter() {
		int length = Math.abs(this.v1.getX() - this.v2.getX());
		int width = Math.abs(this.v1.getY() - this.v2.getY());
		return 2*(length + width);
	}
	public int getArea() {
		int length = Math.abs(this.v1.getX() - this.v2.getX());
		int width = Math.abs(this.v1.getY() - this.v2.getY());
		return length * width;
	}
}

public class MyRectangleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRectangle mr = new MyRectangle(1, 2, 2, 1);
		System.out.println(mr);
		System.out.println(mr.getPerimeter());
		System.out.println(mr.getArea());
		MyPoint v1 = new MyPoint(2,4);
		MyPoint v2 = new MyPoint(8,2);
		MyRectangle mr1 = new MyRectangle(v1, v2);
		System.out.println(mr1);
		System.out.println(mr1.getArea());
		System.out.println(mr1.getPerimeter());
	}

}

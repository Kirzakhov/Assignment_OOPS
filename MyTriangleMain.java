package assignment;

class MyTriangle{
	private MyPoint v1;
	private MyPoint v2;
	private MyPoint v3;
	public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}
	public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		this.v1 = new MyPoint(x1, y1);
		this.v2 = new MyPoint(x2, y2);
		this.v3 = new MyPoint(x3, y3);
	}
	public String toString() {
		return "MyTriangle[v1=("+this.v1.getX()+","+this.v1.getY()+"),v2=("+this.v2.getX()+","
				+this.v2.getY()+"),v3=("+this.v3.getX()+","+this.v3.getY()+")]";
	}
	
	public double getPerimeter() {
		double side1 = this.v1.distance(this.v2);
		double side2 = this.v2.distance(this.v3);
		double side3 = this.v3.distance(this.v1);
		return side1 + side2 + side3;
	}
	public String getType() {
		double side1 = this.v1.distance(this.v2);
		double side2 = this.v2.distance(this.v3);
		double side3 = this.v3.distance(this.v1);
		if(side1 == side2 && side2 == side3)
			return "Equilateral";
		else if(side1 == side2 || side2 == side3 || side1 == side3)
			return "Isosceles";
		else
			return "Scalene";
	}
}

public class MyTriangleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTriangle mt = new MyTriangle(2, 2, 3, 3, 4, 2);
		System.out.println(mt.getType());
		System.out.println(mt.getPerimeter());
		MyPoint v1 = new MyPoint(1,2);
		MyPoint v2 = new MyPoint(3,4);
		MyPoint v3 = new MyPoint(5,1);
		MyTriangle mt1 = new MyTriangle(v1, v2, v3);
		System.out.println(mt1);
		System.out.println(mt1.getPerimeter());
		System.out.println(mt1.getType());
	}

}

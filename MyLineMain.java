package assignment;

class MyLine{
	private MyPoint begin;
	private MyPoint end;
	public MyLine(MyPoint begin, MyPoint end) {
		this.begin = begin;
		this.end = end;
	}
	public MyLine(int x1, int y1, int x2, int y2) {
		this.begin = new MyPoint(x1, y1);
		this.end = new MyPoint(x2, y2);
	}
	public MyPoint getBegin() {
		return begin;
	}
	public void setBegin(MyPoint begin) {
		this.begin = begin;
	}
	public MyPoint getEnd() {
		return end;
	}
	public void setEnd(MyPoint end) {
		this.end = end;
	}
	public int getBeginX() {
		return this.begin.getX();
	}
	public void setBeginX(int x) {
		this.begin.setX(x);
	}
	public int getBeginY() {
		return this.begin.getY();
	}
	public void setBeginY(int y) {
		this.begin.setY(y);
	}
	public int getEndX() {
		return this.end.getX();
	}
	public void setEndX(int x) {
		this.end.setX(x);
	}
	public int getEndY() {
		return this.end.getY();
	}
	public void setEndY(int y) {
		this.end.setY(y);
	}
	public int[] getBeginXY() {
		int arr[] = {this.getBeginX(), this.getBeginY()};
		return arr;
	}
	public void setBeginXY(int x, int y) {
		this.setBeginX(x);
		this.setBeginY(y);
	}
	public int[] getEndXY() {
		int arr[] = {this.getEndX(), this.getEndY()};
		return arr;
	}
	public void setEndXY(int x, int y) {
		this.setEndX(x);
		this.setEndY(y);
	}
	public double getLength() {
		int xDiff = begin.getX() - end.getX();
		int yDiff = begin.getY() - end.getY();
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	}
	public double getGradient() {
		int xDiff = begin.getX() - end.getX();
		int yDiff = begin.getY() - end.getY();
		return Math.atan2(yDiff, xDiff);
	}
	public String toString() {
		return "MyLine[begin=("+this.getBeginX()+","+this.getBeginY()+"),end=("
				+this.getEndX()+","+this.getEndY()+")]";
	}
}

public class MyLineMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint begin = new MyPoint(1,2);
		MyPoint end = new MyPoint(3,4);
		MyLine ml = new MyLine(begin, end);
		System.out.println(ml);
		System.out.println(ml.getGradient());
		System.out.println(ml.getLength());
		MyLine ml1 = new MyLine(2, 4, 6, 8);
		System.out.println(ml1.getBeginXY()[0]);
		System.out.println(ml1.getBeginXY()[1]);
		System.out.println(ml1.getEndXY()[0]);
		System.out.println(ml1.getEndXY()[1]);
	}

}

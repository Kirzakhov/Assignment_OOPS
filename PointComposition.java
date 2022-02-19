package assignment;

class LineSub extends MyPoint{
	private MyPoint end;
	public LineSub(MyPoint begin, MyPoint end) {
		super(begin.getX(), begin.getY());
		this.end = end;
	}
	public LineSub(int beginX, int beginY, int endX, int endY) {
		super(beginX, beginY);
		this.end = new MyPoint(endX, endY);
	}
	public MyPoint getBegin() {
		return this;
	}
	public void setBegin(MyPoint begin) {
		super.setX(begin.getX());
		super.setY(begin.getY());
	}
	public MyPoint getEnd() {
		return end;
	}
	public void setEnd(MyPoint end) {
		this.end = end;
	}
	public int getBeginX() {
		return super.getX();
	}
	public void setBeginX(int x) {
		super.setX(x);
	}
	public int getBeginY() {
		return super.getY();
	}
	public void setBeginY(int y) {
		super.setY(y);
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
	public void setBeginXY(int x, int y) {
		this.setBeginX(x);
		this.setBeginY(y);
	}
	public void setEndXY(int x, int y) {
		this.setEndX(x);
		this.setEndY(y);
	}
	public double getLength() {
		int xDiff = super.getX() - end.getX();
		int yDiff = super.getY() - end.getY();
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	}
	public double getGradient() {
		int xDiff = super.getX() - end.getX();
		int yDiff = super.getY() - end.getY();
		return Math.atan2(yDiff, xDiff);
	}
	public String toString() {
		return "MyLine[begin=("+super.getX()+","+super.getY()+"),end=("
				+this.getEndX()+","+this.getEndY()+")]";
	}
}

public class PointComposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint mp = new MyPoint(2,3);
		MyPoint mp1 = new MyPoint(4,5);
		LineSub ls = new LineSub(mp, mp1);
		System.out.println(ls);
		LineSub ls1 = new LineSub(1,2,8,9);
		System.out.println(ls1);
		System.out.println(ls1.getLength());
		System.out.println(ls1.getGradient());
	}

}

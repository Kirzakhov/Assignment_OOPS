package assignment;

class MovableRectangle implements Movable{
	private MovablePoints topLeft;
	private MovablePoints bottomRight;
	public MovableRectangle(int x1, int y1, int x2, int y2, int speedX, int speedY) {
		this.topLeft = new MovablePoints(x1, y1, speedX, speedY);;
		this.bottomRight = new MovablePoints(x2, y2, speedX, speedY);
	}
	@Override
	public void moveUp() {
		topLeft.y -= topLeft.speedY;
		bottomRight.y -= bottomRight.speedY;
	}
	@Override
	public void moveDown() {
		topLeft.y += topLeft.speedY;
		bottomRight.y += bottomRight.speedY;
	}
	@Override
	public void moveLeft() {
		topLeft.x -= topLeft.speedX;
		bottomRight.x -= bottomRight.speedX;
	}
	@Override
	public void moveRight() {
		topLeft.x += topLeft.speedX;
		bottomRight.y += bottomRight.speedX;
	}
	
}

class MovableCircle implements Movable{
	private int radius;
	private MovablePoints center;
	public MovableCircle(int x, int y, int speedX, int speedY, int radius) {
		this.radius = radius;
		this.center = new MovablePoints(x, y, speedX, speedY);
	}
	@Override
	public void moveUp() {
		center.y -= center.speedY;
	}
	@Override
	public void moveDown() {
		center.y += center.speedY;
	}
	@Override
	public void moveLeft() {
		center.x -= center.speedX;
	}
	@Override
	public void moveRight() {
		center.x += center.speedX;
	}
	public String toString() {
		return "("+center.x+","+center.y+")"+" speed=("+center.speedX+","+center.speedY+")"+
				" radius="+this.radius;
	}
}

public class MovableCircleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movable m1 = new MovablePoints(5, 6, 10, 15);     // upcast
		System.out.println(m1);
		m1.moveLeft();
		System.out.println(m1);
		   
		Movable m2 = new MovableCircle(1, 2, 3, 4, 20);  // upcast
		System.out.println(m2);
		m2.moveRight();
		System.out.println(m2);

	}

}

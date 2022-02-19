package assignment;

class Container{
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	public Container(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	public int getX1() {
		return x1;
	}
	public int getY1() {
		return y1;
	}
	public int getX2() {
		return x2;
	}
	public int getY2() {
		return y2;
	}
	public boolean collidesWith(Ball ball) {
		if(ball.getX() - ball.getRadius() <= this.x1 ||ball.getX() - ball.getRadius() >= this.x2){
			ball.reflectHorizontal();
			return true;
		}
		return false;
	}
	public String toString() {
		return "Container[("+this.x1+","+this.y1+"),("+this.x2+","+this.y2+")]";
	}
}

public class BallAndContainer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ball ball = new Ball(50, 50, 5, 10, 30);
		Container box = new Container(0, 0, 100, 100);
		for (int step = 0; step < 100; ++step) {
		   ball.move();
		   box.collidesWith(ball);
		   System.out.println(ball); // manual check the position of the ball
		}

	}

}

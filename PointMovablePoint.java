package assignment;

class Point{
	private float x;
	private float y;
	public Point() {
		this.x = 0.0f;
		this.y = 0.0f;
	}
	public Point(float x, float y) {
		this.x = x;
		this.y = y;
	}
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	public float[] getXY() {
		float[] arr = {this.x, this.y};
		return arr;
	}
	public void setXY(float x, float y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "("+this.x+","+this.y+")";
	}
}

class MovablePoint extends Point{
	private float xSpeed;
	private float ySpeed;
	public MovablePoint() {
		this.xSpeed = 0.0f;
		this.ySpeed = 0.0f;
	}
	public MovablePoint(float xSpeed, float ySpeed) {
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
		super(x,y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	public float getxSpeed() {
		return xSpeed;
	}
	public void setxSpeed(float xSpeed) {
		this.xSpeed = xSpeed;
	}
	public float getySpeed() {
		return ySpeed;
	}
	public void setySpeed(float ySpeed) {
		this.ySpeed = ySpeed;
	}
	public float[] getSpeed() {
		float[] arr = {this.xSpeed, this.ySpeed};
		return arr;
	}
	public void setSpeed(float xSpeed, float ySpeed) {
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	public String toString() {
		return super.toString()+",speed=("+this.xSpeed+","+this.ySpeed+")";
	}
	public MovablePoint move() {
		this.setX(this.getX()+this.xSpeed);
		this.setY(this.getY()+this.ySpeed);
		return this;
	}
}

public class PointMovablePoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

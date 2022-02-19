package assignment;

class Point2D{
	private float x;
	private float y;
	public Point2D() {
		this.x = 0.0f;
		this.y = 0.0f;
	}
	public Point2D(float x, float y) {
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

class Point3D extends Point2D{
	private float z;
	public Point3D() {
		super();
		this.z = 0.0f;
	}
	public Point3D(float x, float y, float z) {
		super(x, y);
		this.z = z;
	}
	public float getZ() {
		return z;
	}
	public void setZ(float z) {
		this.z = z;
	}
	public float[] getXYZ() {
		float[] arr = {this.getX(), this.getY(), this.z};
		return arr;
	}
	public void setXYZ(float x, float y, float z) {
		this.setXY(x, y);
		this.z = z;
	}
	public String toString() {
		return "("+this.getX()+","+this.getY()+","+this.z+")";
	}
}

public class Point2DPoint3D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

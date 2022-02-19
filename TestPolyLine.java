package assignment;

import java.util.ArrayList;
import java.util.List;

class PolyLine {
	   private ArrayList<MyPoint> points;   // List of Point instances

	   // Constructors   
	   public PolyLine() {  // default constructor
	      points = new ArrayList<MyPoint>();  // implement with ArrayList
	   }
	   public PolyLine(ArrayList<MyPoint> points) {
	      this.points = points;
	   }
	 
	   // Append a point (x, y) to the end of this polyline
	   public void appendPoint(int x, int y) {
	      MyPoint newPoint = new MyPoint(x, y);
	      points.add(newPoint);
	   }
	 
	   // Append a point instance to the end of this polyline
	   public void appendPoint(MyPoint point) {
	      points.add(point);
	   }
	   public String toString() {
		      // Use a StringBuilder to efficiently build the return String
		      StringBuilder sb = new StringBuilder("{");
		      for (MyPoint aPoint : points) {
		          sb.append(aPoint.toString());
		      }
		      sb.append("}");
		      return sb.toString();
		   }

		   // Return the total length of this polyline
//		   public double getLength() { 
//			   
//		   }
		}



public class TestPolyLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolyLine l1 = new PolyLine();
	    System.out.println(l1); 
	    l1.appendPoint(new MyPoint(1, 2));
	      l1.appendPoint(3, 4);
	      l1.appendPoint(5, 6);
	      System.out.println(l1);  // {(1,2)(3,4)(5,6)}

	      // Test constructor 2
	      ArrayList<MyPoint> points = new ArrayList<MyPoint>();
	      points.add(new MyPoint(11, 12));
	      points.add(new MyPoint(13, 14));
	      PolyLine l2 = new PolyLine(points);
	      System.out.println(l2);  // {(11,12)(13,14)}


	}

}

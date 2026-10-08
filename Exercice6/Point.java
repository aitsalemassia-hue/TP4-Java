package Exercice6;
import  java.lang.Math;
public class Point {
	private double x;
	private double y;
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public Point translation(double x1,double y1) {
		double x_p;
		double y_p;
		x_p=this.x+x1;
		y_p=this.y+y1;
		return new Point(x_p,y_p);
	}
	public static double distance (Point p1,Point p2) {
		double x=p2.x-p1.x;
		double y=p2.y-p1.y;
		double carre =Math.pow(x, 2)+Math.pow(y, 2);
		return Math.sqrt(carre);
		
	}
	
	@Override
	public String toString() {
		return "( "+x+","+y+" )";
	}
	

}

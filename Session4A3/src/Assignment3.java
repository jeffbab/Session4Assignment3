
public class Assignment3 {

	/*
	 * Write a program to calculate area of rectangle and triangle using single
	 * inheritance
	 * 
	 */
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(25, 10);
		System.out.println(rect.area());

		Triangle tri = new Triangle(100, 100);
		System.out.println(tri.area());
	}

}

class Shape {
	double length;
	double width;

	public Shape(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double area() {
		double area = 0;

		return area;
	}

}

class Rectangle extends Shape {

	public Rectangle(double length, double width) {
		super(length, width);
	}

	public double area() {
		return (length * width);

	}

}

class Triangle extends Shape {
	public Triangle(double length, double width) {
		super(length, width);
	}

	public double area() {
		return (length * width / 2);

	}
}
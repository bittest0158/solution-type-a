package problem03;

public class Rectangle extends Shape implements Resizable {
	private double width;
	private double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void resize(double rate) {
		width = width * rate;
		height = height * rate;
	}

	@Override
	public double getArea() {
		double area = 0;
		area = width * height;
		
		return area;
	}

	@Override
	public double getPerimeter() {
		double perimeter = width*2 + height*2;
		return perimeter;
	}
}
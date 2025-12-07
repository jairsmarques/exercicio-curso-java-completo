package entities;

public class Rectangle {

	public double witdh;
	public double height;

	public double area() {
		return witdh * height;
	}

	public double perimeter() {
		return 2.0 * (witdh + height);
	}

	public double diagonal() {
		return Math.sqrt(witdh * witdh + height * height);
	}
}

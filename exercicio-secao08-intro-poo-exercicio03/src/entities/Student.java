package entities;

public class Student {

	public String name;
	public double primeiraNota;
	public double segundaNota;
	public double terceiraNota;

	public double finalGrade() {
		return primeiraNota + segundaNota + terceiraNota;
	}

	public double missingPoints() {
		if (finalGrade() < 60.0) {
			return 60.0 - finalGrade();
		} else {
			return 0;
		}
	}
}

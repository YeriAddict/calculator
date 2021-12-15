package leang.corporation.arithmetic;

import java.lang.Math;

public class Arithmetic {

	public static double addition(double leftNumber, double rightNumber) {
		return leftNumber + rightNumber;
	}

	public static double subtraction(double leftNumber, double rightNumber) {
		return leftNumber - rightNumber;
	}

	public static double multiplication(double leftNumber, double rightNumber) {
		return leftNumber * rightNumber;
	}

	public static double division(double leftNumber, double rightNumber) {
		return leftNumber / rightNumber;
	}

	public static double modulo(double leftNumber, double rightNumber) {
		return leftNumber % rightNumber;
	}

	public static double cosine(double number) {
		return Math.cos(number);
	}

	public static double sine(double number) {
		return Math.sin(number);
	}

	public static double tangent(double number) {
		return Math.tan(number);
	}

	public static double factorial(double number) {
		if (number < 0.5) {
			return Math.PI / (Math.sin(Math.PI * number) * factorial(1 - number));
		} else {
			double[] p = { 0.99999999999980993, 676.5203681218851, -1259.1392167224028, 771.32342877765313,
					-176.61502916214059, 12.507343278686905, -0.13857109526572012, 9.9843695780195716e-6,
					1.5056327351493116e-7 };
			int g = 7;
			number -= 1;
			double a = p[0];
			double t = number + g + 0.5;
			for (int i = 1; i < p.length; i++) {
				a += p[i] / (number + i);
			}
			return Math.sqrt(2 * Math.PI) * Math.pow(t, number + 0.5) * Math.exp(-t) * a;
		}
	}

}

package leang.corporation.arithmetic;

import java.lang.Math;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Class Arithmetic contains methods for performing either standard or
 * scientific operations. It uses the java.lang.Math class for advanced
 * operations such as trigonometric functions for instance.
 * <p>
 * Standard operations :
 * <ul>
 * <li>Addition
 * <li>Subtraction
 * <li>Multiplication
 * <li>Division
 * <li>Modulo
 * </ul>
 * 
 * <p>
 * Scientific operations :
 * <ul>
 * <li>Cosine
 * <li>Sine
 * <li>Tangent
 * <li>Gamma
 * </ul>
 * 
 * @author LEANG Denis
 */

public class Arithmetic {

	/**
	 * Returns the sum of the arguments
	 * 
	 * @param leftNumber  Left operand
	 * @param rightNumber Right operand
	 * @return The addition of the two operands
	 */
	public static double addition(double leftNumber, double rightNumber) {
		return leftNumber + rightNumber;
	}

	/**
	 * Returns the difference of the arguments
	 * 
	 * @param leftNumber  Left operand
	 * @param rightNumber Right operand
	 * @return The subtraction of the two operands
	 */
	public static double subtraction(double leftNumber, double rightNumber) {
		return leftNumber - rightNumber;
	}

	/**
	 * Returns the product of the arguments
	 * 
	 * @param leftNumber  Left operand
	 * @param rightNumber Right operand
	 * @return The multiplication of the two operands
	 */
	public static double multiplication(double leftNumber, double rightNumber) {
		return leftNumber * rightNumber;
	}

	/**
	 * Returns the quotient of the arguments
	 * <p>
	 * Special case :
	 * <ul>
	 * <li>If the denominator is 0, then the result is Infinity and an alert popup appears
	 * </ul>
	 * 
	 * @param numerator   Numerator
	 * @param denominator Denominator
	 * @return The division of the two operands
	 */
	public static double division(double numerator, double denominator) {
		if (denominator == 0) {
			JFrame alert = new JFrame();
			JOptionPane.showMessageDialog(alert,"Division by 0 !");
		}
		return numerator / denominator;
	}

	/**
	 * Returns the arguments division's remainder
	 * <p>
	 * Special case :
	 * <ul>
	 * <li>If the denominator is 0, then the result is NaN and an alert popup is appears
	 * </ul>
	 * 
	 * @param numerator   Numerator
	 * @param denominator Denominator
	 * @return The modulo of the two operands
	 */
	public static double modulo(double numerator, double denominator) {
		if (denominator == 0) {
			JFrame alert = new JFrame();
			JOptionPane.showMessageDialog(alert,"Division by 0 !");
		}
		return numerator % denominator;
	}

	/**
	 * Returns the trigonometric cosine of the argument
	 * 
	 * @param number Number
	 * @return The cosine of the number in Radian
	 */
	public static double cosine(double number) {
		return Math.cos(number);
	}

	/**
	 * Returns the trigonometric sine of the argument
	 * 
	 * @param number Number
	 * @return The sine of the number in Radian
	 */
	public static double sine(double number) {
		return Math.sin(number);
	}

	/**
	 * Returns the trigonometric tangent of the argument
	 * 
	 * @param number Number
	 * @return The tangent of the number in Radian
	 */
	public static double tangent(double number) {
		return Math.tan(number);
	}

	/**
	 * Returns the value of the Gamma function applied to the argument
	 * <p>
	 * Special case :
	 * <ul>
	 * <li>If the argument is (number + 1), then the result is the factorial of
	 * number
	 * </ul>
	 * 
	 * @param number Number
	 * @return The result of the Gamma function applied to the number using Lanczos
	 *         Approximation.
	 */
	public static double gamma(double number) {
		if (number < 0.5) {
			return Math.PI / (Math.sin(Math.PI * number) * gamma(1 - number));
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
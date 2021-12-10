package leang.corporation.arithmetic;

public class Arithmetic {
	
	// Method for addition
	public double addition(double leftNumber, double rightNumber) {
		return leftNumber + rightNumber;
	}
	
	// Method for subtraction
	public double subtraction(double leftNumber, double rightNumber) {
		return leftNumber - rightNumber;
	}
	
	// Method for multiplication
	public double multiplication(double leftNumber, double rightNumber) {
		return leftNumber * rightNumber;
	}
	
	// Method for division
	public double division(double leftNumber, double rightNumber) {
		if (rightNumber == 0) {
			throw new IllegalArgumentException("Infinity");
		}
		else {
			return leftNumber / rightNumber;
		}
	}
	
	// Method for modulo
	public double modulo(double leftNumber, double rightNumber) {
		return leftNumber % rightNumber;
	}
	
}

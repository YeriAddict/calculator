package leang.corporation.button;

import java.awt.event.ActionEvent;
import java.util.List;

import leang.corporation.arithmetic.Arithmetic;
import leang.corporation.field.TextField;

/**
 * Class ButtonEvent contains methods related to the Scientific buttons. 
 * 
 * @author LEANG Denis
 */
public class ButtonActionEvent {

	public static void numberButtonsEvent(ActionEvent e, TextField resultScreenText, Button[] numberButtons,
			Button switchSignButton, List<String> numberString, double[] number, char[] signTester) {
		for (int i = 0; i < 10; i++) {
			if (e.getSource() == numberButtons[i]) {
				resultScreenText.setNumber(String.valueOf(i));
				numberString.add(String.valueOf(i));
				number[0] = Double.parseDouble(String.join("", numberString));
			}
		}
		if (e.getSource() == switchSignButton) {
			if (signTester[0] == '+') {
				number[0] = -number[0];
				signTester[0] = '-';
				resultScreenText.switchSignMinus();
			} else if (signTester[0] == '-') {
				number[0] = -number[0];
				signTester[0] = '+';
				resultScreenText.switchSignPlus();
			}
		}
	}

	public static void dotButtonEvent(ActionEvent e, TextField resultScreenText, Button dotButton,
			List<String> numberString, double[] number) {
		if (e.getSource() == dotButton) {
			if (resultScreenText.getText().contains(".") == false) {
				if (Double.parseDouble(resultScreenText.getText()) == 0) {
					numberString.add("0");
				}
				resultScreenText.setDot(".");
				numberString.add(".");
				number[0] = Double.parseDouble(String.join("", numberString));
			}

		}
	}

	public static void deleteButtonEvent(ActionEvent e, TextField resultScreenText, Button deleteButton,
			List<String> numberString, char[] signTester, double[] number) {
		if (e.getSource() == deleteButton) {
			if (resultScreenText.getText().isEmpty() == false) {
				resultScreenText
						.setText(resultScreenText.getText().substring(0, resultScreenText.getText().length() - 1));
				if (numberString.size() != 0) {
					numberString.remove(numberString.size() - 1);
					if (numberString.size() > 1) {
						number[0] = Double.parseDouble(String.join("", numberString));
					}
				}
			} else if (resultScreenText.getText().isEmpty() == true) {
				signTester[0] = '+';
			}
		}
	}

	public static void resetButtonEvent(ActionEvent e, TextField resultScreenText, Button resetButton,
			List<String> numberString, char[] operator, char[] operatorTester, char[] signTester, double[] result,
			double number[]) {
		if (e.getSource() == resetButton) {
			numberString.clear();
			result[0] = 0;
			number[0] = 0;
			operatorTester[0] = 'N';
			signTester[0] = '+';
			operator[0] = 'N';
			resultScreenText.setText("0");
		}
	}

	public static void equalButtonEvent(ActionEvent e, TextField resultScreenText, Button equalButton,
			List<String> numberString, char[] operator, char[] operatorTester, char[] signTester, double[] result,
			double number[]) {
		if (e.getSource() == equalButton) {
			numberString.clear();
			if (operator[0] == '+') {
				result[0] = Arithmetic.addition(result[0], number[0]);
			}
			if (operator[0] == '-') {
				result[0] = Arithmetic.subtraction(result[0], number[0]);
			}
			if (operator[0] == '*') {
				result[0] = Arithmetic.multiplication(result[0], number[0]);
			}
			if (operator[0] == '/') {
				result[0] = Arithmetic.division(result[0], number[0]);
			}
			if (operator[0] == '%') {
				result[0] = Arithmetic.modulo(result[0], number[0]);
			}
			operatorTester[0] = 'N';

			if (result[0] > 0) {
				signTester[0] = '+';
			} else if (result[0] < 0) {
				signTester[0] = '-';
			}

			resultScreenText.setText(String.valueOf(result[0]));
		}
	}

}
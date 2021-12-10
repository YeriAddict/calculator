package leang.corporation.button;

import java.awt.event.ActionEvent;
import java.util.List;

import leang.corporation.arithmetic.Arithmetic;
import leang.corporation.field.TextField;

public class ButtonEvent {
	Arithmetic arithmetic = new Arithmetic();

	public void numberButtonsEvent(TextField resultScreenText, ActionEvent e, Button[] numberButtons, Button switchNegativeButton, List<String> numberString, double[] number ) {
		for (int i = 0; i < 10; i++) {
			if (e.getSource() == numberButtons[i]) {
					resultScreenText.setNumber(String.valueOf(i));
					numberString.add(String.valueOf(i));
					number[0] = Double.parseDouble(String.join("", numberString));
			}
		}
		if (e.getSource() == switchNegativeButton) {
			number[0] = -number[0];
			resultScreenText.switchSign();
		}
	}

	public void dotButtonEvent(TextField resultScreenText, ActionEvent e, Button dotButton, List<String> numberString, double[] number) {
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

	public void deleteButtonEvent() {

	}

	public void resetButtonEvent(TextField resultScreenText, ActionEvent e, Button resetButton, List<String> numberString) {
		if (e.getSource() == resetButton) {
			numberString.clear();
			resultScreenText.setText("0");
		}
	}
	
	public void equalButtonEvent(TextField resultScreenText, ActionEvent e, Button equalButton, List<String> numberString, char[] operator, double[] result, double number[]) {
		if (e.getSource() == equalButton) {
			numberString.clear();
			if (operator[0] == '+') {
				result[0] = arithmetic.addition(result[0], number[0]);
			}
			if (operator[0] == '-') {
				result[0] = arithmetic.subtraction(result[0], number[0]);
			}
			if (operator[0] == '*') {
				result[0] = arithmetic.multiplication(result[0], number[0]);
			}
			if (operator[0] == '/') {
				result[0] = arithmetic.division(result[0], number[0]);
			}
			if (operator[0] == '%') {
				result[0] = arithmetic.modulo(result[0], number[0]);
			}
			resultScreenText.setText(String.valueOf(result[0]));
		}
	}
	
	public void additionButtonEvent(TextField resultScreenText, ActionEvent e, Button additionButton, List<String> numberString, char[] operator, double[] result) {
		if (e.getSource() == additionButton) {
			numberString.clear();
			result[0] = Double.parseDouble(resultScreenText.getText());
			operator[0] = '+';
			resultScreenText.setText("0");
		}
	}
	
	public void subtractionButtonEvent(TextField resultScreenText, ActionEvent e, Button subtractionButton, List<String> numberString, char[] operator, double[] result) {
		if (e.getSource() == subtractionButton) {
			numberString.clear();
			result[0] = Double.parseDouble(resultScreenText.getText());
			operator[0] = '-';
			resultScreenText.setText("0");
		}
	}
	
	public void multiplicationButtonEvent(TextField resultScreenText, ActionEvent e, Button multiplicationButton, List<String> numberString, char[] operator, double[] result) {
		if (e.getSource() == multiplicationButton) {
			numberString.clear();
			result[0] = Double.parseDouble(resultScreenText.getText());
			operator[0] = '*';
			resultScreenText.setText("0");
		}
	}
	
	public void divisionButtonEvent(TextField resultScreenText, ActionEvent e, Button divisionButton, List<String> numberString, char[] operator, double[] result) {
		if (e.getSource() == divisionButton) {
			numberString.clear();
			result[0] = Double.parseDouble(resultScreenText.getText());
			operator[0] = '/';
			resultScreenText.setText("0");
		}
	}
	
	public void moduloButtonEvent(TextField resultScreenText, ActionEvent e, Button moduloButton, List<String> numberString, char[] operator, double[] result) {
		if (e.getSource() == moduloButton) {
			numberString.clear();
			result[0] = Double.parseDouble(resultScreenText.getText());
			operator[0] = '%';
			resultScreenText.setText("0");
		}
	}

	public void scientificButtonEvent() {
	}

	public void parenthesisButtonEvent() {
	}
}
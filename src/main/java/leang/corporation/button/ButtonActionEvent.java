package leang.corporation.button;

import java.awt.event.ActionEvent;
import java.util.List;

import leang.corporation.arithmetic.Arithmetic;
import leang.corporation.field.TextField;

/**
 * Class ButtonEvent contains methods related to the Action operation buttons.
 * Those methods handle events for basic actions such as inputting a numerical
 * digit, dot or hyphen as well as deleting a char/resetting everything and
 * achieving operations with equal
 * <p>
 * It currently supports methods for 15 buttons :
 * <ul>
 * <li>Number buttons (0123456789)
 * <li>SwitchSign button (+/-)
 * <li>Dot button (.)
 * <li>Delete button (DEL)
 * <li>Reset button (C)
 * <li>Equal button (=)
 * </ul>
 * 
 * @see leang.corporation.field.TextField
 * @see leang.corporation.button.Button
 * @author LEANG Denis
 */
public class ButtonActionEvent {

	/**
	 * Adds an event handler for number buttons and switchSign button. For each
	 * digit, when the button is clicked, the TextField will call the setNumber()
	 * method and append the list of string numberString with that digit. That list
	 * of String will then be converted as a double which is stored in the double
	 * list number (to bypass pass by reference). Then, the user has the possibility
	 * to switch the TextField's content sign by clicking on the switchSignButton.
	 * Depending on the sign of signTester, the method switchSignMinus() or
	 * switchSignPlus() will be called and the sign of the double number will
	 * change.
	 * 
	 * @param e                ActionEvent object
	 * @param resultScreenText TextField object
	 * @param numberButtons    Numerical digit buttons (0123456789)
	 * @param switchSignButton Switch sign button (+/-)
	 * @param numberString     List of string containing the numerical digits,
	 *                         hyphen and dot which form a real number
	 * @param number           Operand
	 * @param signTester       Character used to handle the switchSignButton
	 *                         behavior
	 * 
	 * @see TextField#setNumber(String)
	 * @see TextField#switchSignMinus()
	 * @see TextField#switchSignPlus()
	 * 
	 */
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

	/**
	 * Adds an event handler for dot button. When clicked, if the TextField does not
	 * already contain a dot, it will call the setDot() method and add a dot to its
	 * content. The dot will be added to the numberString list of string which is
	 * then converted into a double and stored in the double list number (to bypass
	 * pass by reference).
	 * <p>
	 * Special case :
	 * <ul>
	 * <li>If the TextField is empty, then a "0" is added to the numberString list
	 * to avoid the empty string double conversion error
	 * </ul>
	 * 
	 * @param e                ActionEvent object
	 * @param resultScreenText TextField object
	 * @param dotButton        Dot Button (.)
	 * @param numberString     List of string containing the numerical digits,
	 *                         hyphen and dot which form a real number
	 * @param number           Operand
	 * 
	 * @see TextField#setDot(String)
	 * 
	 */
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

	/**
	 * Adds an event handler for delete button. When clicked, if the TextField is
	 * not empty, the last character of its content will be deleted. Then, if the
	 * TextField is empty, it will just revert the signTester to its default status
	 * ('+').
	 * <p>
	 * Special case :
	 * <ul>
	 * <li>If the list numberString is not empty, it will also delete the last
	 * element in the list and will convert it into a double (stored in number) only
	 * if the list's size is superior than 1 to avoid the empty string double
	 * conversion error.
	 * </ul>
	 * 
	 * @param e                ActionEvent object
	 * @param resultScreenText TextField object
	 * @param deleteButton     Delete Button (DEL)
	 * @param numberString     List of string containing the numerical digits,
	 *                         hyphen and dot which form a real number
	 * @param signTester       Character used to handle the switchSignButton
	 *                         behavior
	 * @param number           Operand
	 * 
	 * 
	 */
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

	/**
	 * Adds an event handler for reset button. When clicked, all variables will be
	 * reverted to default state.
	 * 
	 * @param e                ActionEvent object
	 * @param resultScreenText TextField object
	 * @param resetButton      Reset Button (C)
	 * @param numberString     List of string containing the numerical digits,
	 *                         hyphen and dot which form a real number
	 * @param operator         Character used to contain '-'
	 * @param operatorTester   Character used to handle operation chaining and avoid
	 *                         errors
	 * @param signTester       Character used to handle the switchSignButton
	 *                         behavior
	 * @param result           Result displayed after the operation
	 * @param number           Operand
	 * 
	 */
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

	/**
	 * Adds an event handler for equal button. When clicked, the numberString list
	 * will be reset to catch the next input number as well as the operatorTester
	 * which is back to default state. Depending on the character stored in
	 * operator, an operation will occur which is then stored in result to be
	 * displayed on the TextField. Depending on the sign of the result, signTester
	 * will either take a '+' or a '-'. Clicking multiple times on the equal button
	 * will successively do the same operation with result and the last operand
	 * stored right before clicking equal the first time (just like the Windows
	 * Calculator).
	 * 
	 * @param e                ActionEvent object
	 * @param resultScreenText TextField object
	 * @param equalButton      Equal Button (=)
	 * @param numberString     List of string containing the numerical digits,
	 *                         hyphen and dot which form a real number
	 * @param operator         Character used to contain '-'
	 * @param operatorTester   Character used to handle operation chaining and avoid
	 *                         errors
	 * @param signTester       Character used to handle the switchSignButton
	 *                         behavior
	 * @param result           Result displayed after the operation
	 * @param number           Operand
	 * 
	 */
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
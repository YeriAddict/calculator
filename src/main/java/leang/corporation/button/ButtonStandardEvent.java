package leang.corporation.button;

import java.awt.event.ActionEvent;
import java.util.List;

import leang.corporation.arithmetic.Arithmetic;
import leang.corporation.field.TextField;

/**
 * Class ButtonStandardEvent contains methods related to the Standard operation
 * buttons. Those methods mainly use the Arithmetic class to handle events for
 * basic operations
 * <p>
 * It currently supports methods for 5 buttons :
 * <ul>
 * <li>Addition button (+)
 * <li>Subtraction button (-)
 * <li>Multiplication button (*)
 * <li>Division button (/)
 * <li>Modulo button (%)
 * </ul>
 * 
 * @see leang.corporation.field.TextField
 * @see leang.corporation.button.Button
 * 
 * @author LEANG Denis
 */
public class ButtonStandardEvent {

	/**
	 * Adds an event handler for the addition button. If the button is clicked, the
	 * signTester will be reset to default state (+). There are many special cases
	 * which all fix wrong results and provide robust behavior overall. By default,
	 * the operatorTester is set to 'N' (when opening the Calculator or clicking
	 * resetButton/equalButton). operatorTester is used as a loop condition enabling
	 * the user to chain operations successively while operator is used as a loop
	 * condition to display the right result based on the operator when clicking
	 * equalButton.
	 * <p>
	 * Special cases :
	 * <ul>
	 * <li>Default state (if the TextField is not empty and if the operatorTester is
	 * set to 'N'). The numberString list will be reset to catch the next input
	 * number and both operatorTester and operator will be set to '+'. The TextField
	 * content will be stored in the result list double and sets '0' on screen again
	 * for the users to get another operand.
	 * <li>After Default state (if the TextField is not empty and if the
	 * operatorTester is set to '+'). This case is only used to prevent unwanted
	 * behavior when clicking additionButton after clicking it previously such as
	 * erasing the old stored number in result.
	 * <li>After Default state (if the TextField is not empty and if the
	 * operatorTester is set to any of the other operators '-', '*', '/', '%'). This
	 * case is only used to prevent unwanted behavior when the user missclicks an
	 * operator button. It will set the operator to the last operator clicked (here
	 * '+').
	 * </ul>
	 * 
	 * @param e                ActionEvent object
	 * @param resultScreenText TextField object
	 * @param additionButton   Addition Button (+)
	 * @param numberString     List of string containing the numerical digits,
	 *                         hyphen and dot which form a real number
	 * @param operator         Character used to contain '+'
	 * @param operatorTester   Character used to handle operation chaining and avoid
	 *                         errors
	 * @param signTester       Character used to handle the switchSignButton
	 *                         behavior
	 * @param result           Result displayed after the operation
	 * 
	 * @see Arithmetic#addition(double, double)
	 * @see ButtonActionEvent
	 */
	public static void additionButtonEvent(ActionEvent e, TextField resultScreenText, Button additionButton,
			List<String> numberString, char[] operator, char[] operatorTester, char[] signTester, double[] result) {
		if (e.getSource() == additionButton) {
			signTester[0] = '+';
			if (resultScreenText.getText().isEmpty() == false && operatorTester[0] == 'N') {
				numberString.clear();
				operatorTester[0] = '+';
				result[0] = Double.parseDouble(resultScreenText.getText());
				operator[0] = '+';
				resultScreenText.setText("0");
			} else if (resultScreenText.getText().isEmpty() == false && operatorTester[0] == '+') {
				numberString.clear();
				operator[0] = '+';
				resultScreenText.setText("0");
			} else if (resultScreenText.getText().isEmpty() == false && (operatorTester[0] == '-'
					|| operatorTester[0] == '*' || operatorTester[0] == '/' || operatorTester[0] == '%')) {
				numberString.clear();
				operator[0] = '+';
			} else {
				result[0] = 0;
			}
		}
	}

	/**
	 * Adds an event handler for the subtraction button. If the button is clicked,
	 * the signTester will be reset to default state (+). There are many special
	 * cases which all fix wrong results and provide robust behavior overall. By
	 * default, the operatorTester is set to 'N' (when opening the Calculator or
	 * clicking resetButton/equalButton). operatorTester is used as a loop condition
	 * enabling the user to chain operations successively while operator is used as
	 * a loop condition to display the right result based on the operator when
	 * clicking equalButton.
	 * <p>
	 * Special cases :
	 * <ul>
	 * <li>Default state (if the TextField is not empty and if the operatorTester is
	 * set to 'N'). The numberString list will be reset to catch the next input
	 * number and both operatorTester and operator will be set to '-'. The TextField
	 * content will be stored in the result list double and sets '0' on screen again
	 * for the users to get another operand.
	 * <li>After Default state (if the TextField is not empty and if the
	 * operatorTester is set to '-'). This case is only used to prevent unwanted
	 * behavior when clicking subtractionButton after clicking it previously such as
	 * erasing the old stored number in result.
	 * <li>After Default state (if the TextField is not empty and if the
	 * operatorTester is set to any of the other operators '+', '*', '/', '%'). This
	 * case is only used to prevent unwanted behavior when the user missclicks an
	 * operator button. It will set the operator to the last operator clicked (here
	 * '-').
	 * </ul>
	 * 
	 * @param e                 ActionEvent object
	 * @param resultScreenText  TextField object
	 * @param subtractionButton Subtraction Button (-)
	 * @param numberString      List of string containing the numerical digits,
	 *                          hyphen and dot which form a real number
	 * @param operator          Character used to contain '-'
	 * @param operatorTester    Character used to handle operation chaining and
	 *                          avoid errors
	 * @param signTester        Character used to handle the switchSignButton
	 *                          behavior
	 * @param result            Result displayed after the operation
	 * 
	 * @see Arithmetic#subtraction(double, double)
	 * @see ButtonActionEvent
	 */
	public static void subtractionButtonEvent(ActionEvent e, TextField resultScreenText, Button subtractionButton,
			List<String> numberString, char[] operator, char[] operatorTester, char[] signTester, double[] result) {
		if (e.getSource() == subtractionButton) {
			signTester[0] = '+';
			if (resultScreenText.getText().isEmpty() == false && operatorTester[0] == 'N') {
				numberString.clear();
				operatorTester[0] = '-';
				result[0] = Double.parseDouble(resultScreenText.getText());
				operator[0] = '-';
				resultScreenText.setText("0");
			} else if (resultScreenText.getText().isEmpty() == false && operatorTester[0] == '-') {
				numberString.clear();
				operator[0] = '-';
				resultScreenText.setText("0");
			} else if (resultScreenText.getText().isEmpty() == false && (operatorTester[0] == '+'
					|| operatorTester[0] == '*' || operatorTester[0] == '/' || operatorTester[0] == '%')) {
				numberString.clear();
				operator[0] = '-';
			} else {
				result[0] = 0;
			}
		}
	}

	/**
	 * Adds an event handler for the multiplication button. If the button is
	 * clicked, the signTester will be reset to default state (+). There are many
	 * special cases which all fix wrong results and provide robust behavior
	 * overall. By default, the operatorTester is set to 'N' (when opening the
	 * Calculator or clicking resetButton/equalButton). operatorTester is used as a
	 * loop condition enabling the user to chain operations successively while
	 * operator is used as a loop condition to display the right result based on the
	 * operator when clicking equalButton.
	 * <p>
	 * Special cases :
	 * <ul>
	 * <li>Default state (if the TextField is not empty and if the operatorTester is
	 * set to 'N'). The numberString list will be reset to catch the next input
	 * number and both operatorTester and operator will be set to '*'. The TextField
	 * content will be stored in the result list double and sets '0' on screen again
	 * for the users to get another operand.
	 * <li>After Default state (if the TextField is not empty and if the
	 * operatorTester is set to '*'). This case is only used to prevent unwanted
	 * behavior when clicking multiplicationButton after clicking it previously such
	 * as erasing the old stored number in result.
	 * <li>After Default state (if the TextField is not empty and if the
	 * operatorTester is set to any of the other operators '+', '-', '/', '%'). This
	 * case is only used to prevent unwanted behavior when the user missclicks an
	 * operator button. It will set the operator to the last operator clicked (here
	 * '+').
	 * </ul>
	 * 
	 * @param e                    ActionEvent object
	 * @param resultScreenText     TextField object
	 * @param multiplicationButton Multiplication Button (*)
	 * @param numberString         List of string containing the numerical digits,
	 *                             hyphen and dot which form a real number
	 * @param operator             Character used to contain '*'
	 * @param operatorTester       Character used to handle operation chaining and
	 *                             avoid errors
	 * @param signTester           Character used to handle the switchSignButton
	 *                             behavior
	 * @param result               Result displayed after the operation
	 * 
	 * @see Arithmetic#multiplication(double, double)
	 * @see ButtonActionEvent
	 */
	public static void multiplicationButtonEvent(ActionEvent e, TextField resultScreenText, Button multiplicationButton,
			List<String> numberString, char[] operator, char[] operatorTester, char[] signTester, double[] result) {
		if (e.getSource() == multiplicationButton) {
			signTester[0] = '+';
			if (resultScreenText.getText().isEmpty() == false && operatorTester[0] == 'N') {
				numberString.clear();
				operatorTester[0] = '*';
				result[0] = Double.parseDouble(resultScreenText.getText());
				operator[0] = '*';
				resultScreenText.setText("0");
			} else if (resultScreenText.getText().isEmpty() == false && operatorTester[0] == '*') {
				numberString.clear();
				operator[0] = '*';
				resultScreenText.setText("0");
			} else if (resultScreenText.getText().isEmpty() == false && (operatorTester[0] == '+'
					|| operatorTester[0] == '-' || operatorTester[0] == '/' || operatorTester[0] == '%')) {
				numberString.clear();
				operator[0] = '*';
			} else {
				result[0] = 0;
			}
		}
	}

	/**
	 * Adds an event handler for the division button. If the button is clicked, the
	 * signTester will be reset to default state (+). There are many special cases
	 * which all fix wrong results and provide robust behavior overall. By default,
	 * the operatorTester is set to 'N' (when opening the Calculator or clicking
	 * resetButton/equalButton). operatorTester is used as a loop condition enabling
	 * the user to chain operations successively while operator is used as a loop
	 * condition to display the right result based on the operator when clicking
	 * equalButton.
	 * <p>
	 * Special cases :
	 * <ul>
	 * <li>Default state (if the TextField is not empty and if the operatorTester is
	 * set to 'N'). The numberString list will be reset to catch the next input
	 * number and both operatorTester and operator will be set to '/'. The TextField
	 * content will be stored in the result list double and sets '0' on screen again
	 * for the users to get another operand.
	 * <li>After Default state (if the TextField is not empty and if the
	 * operatorTester is set to '/'). This case is only used to prevent unwanted
	 * behavior when clicking divisionButton after clicking it previously such as
	 * erasing the old stored number in result.
	 * <li>After Default state (if the TextField is not empty and if the
	 * operatorTester is set to any of the other operators '+', '-', '*', '%'). This
	 * case is only used to prevent unwanted behavior when the user missclicks an
	 * operator button. It will set the operator to the last operator clicked (here
	 * '/').
	 * </ul>
	 * 
	 * @param e                ActionEvent object
	 * @param resultScreenText TextField object
	 * @param divisionButton   Division Button (/)
	 * @param numberString     List of string containing the numerical digits,
	 *                         hyphen and dot which form a real number
	 * @param operator         Character used to contain '/'
	 * @param operatorTester   Character used to handle operation chaining and avoid
	 *                         errors
	 * @param signTester       Character used to handle the switchSignButton
	 *                         behavior
	 * @param result           Result displayed after the operation
	 * 
	 * @see Arithmetic#division(double, double)
	 * @see ButtonActionEvent
	 */
	public static void divisionButtonEvent(ActionEvent e, TextField resultScreenText, Button divisionButton,
			List<String> numberString, char[] operator, char[] operatorTester, char[] signTester, double[] result) {
		if (e.getSource() == divisionButton) {
			signTester[0] = '+';
			if (resultScreenText.getText().isEmpty() == false && operatorTester[0] == 'N') {
				numberString.clear();
				operatorTester[0] = '/';
				result[0] = Double.parseDouble(resultScreenText.getText());
				operator[0] = '/';
				resultScreenText.setText("0");
			} else if (resultScreenText.getText().isEmpty() == false && operatorTester[0] == '/') {
				numberString.clear();
				operator[0] = '/';
				resultScreenText.setText("0");
			} else if (resultScreenText.getText().isEmpty() == false && (operatorTester[0] == '+'
					|| operatorTester[0] == '-' || operatorTester[0] == '*' || operatorTester[0] == '%')) {
				numberString.clear();
				operator[0] = '/';
			} else {
				result[0] = 0;
			}
		}
	}

	/**
	 * Adds an event handler for the modulo button. If the button is clicked, the
	 * signTester will be reset to default state (+). There are many special cases
	 * which all fix wrong results and provide robust behavior overall. By default,
	 * the operatorTester is set to 'N' (when opening the Calculator or clicking
	 * resetButton/equalButton). operatorTester is used as a loop condition enabling
	 * the user to chain operations successively while operator is used as a loop
	 * condition to display the right result based on the operator when clicking
	 * equalButton.
	 * <p>
	 * Special cases :
	 * <ul>
	 * <li>Default state (if the TextField is not empty and if the operatorTester is
	 * set to 'N'). The numberString list will be reset to catch the next input
	 * number and both operatorTester and operator will be set to '%'. The TextField
	 * content will be stored in the result list double and sets '0' on screen again
	 * for the users to get another operand.
	 * <li>After Default state (if the TextField is not empty and if the
	 * operatorTester is set to '%'). This case is only used to prevent unwanted
	 * behavior when clicking moduloButton after clicking it previously such as
	 * erasing the old stored number in result.
	 * <li>After Default state (if the TextField is not empty and if the
	 * operatorTester is set to any of the other operators '+', '-', '*', '/'). This
	 * case is only used to prevent unwanted behavior when the user missclicks an
	 * operator button. It will set the operator to the last operator clicked (here
	 * '%').
	 * </ul>
	 * 
	 * @param e                ActionEvent object
	 * @param resultScreenText TextField object
	 * @param moduloButton     Modulo Button (%)
	 * @param numberString     List of string containing the numerical digits,
	 *                         hyphen and dot which form a real number
	 * @param operator         Character used to contain '%'
	 * @param operatorTester   Character used to handle operation chaining and avoid
	 *                         errors
	 * @param signTester       Character used to handle the switchSignButton
	 *                         behavior
	 * @param result           Result displayed after the operation
	 * 
	 * @see Arithmetic#modulo(double, double)
	 * @see ButtonActionEvent
	 */
	public static void moduloButtonEvent(ActionEvent e, TextField resultScreenText, Button moduloButton,
			List<String> numberString, char[] operator, char[] operatorTester, char[] signTester, double[] result) {
		if (e.getSource() == moduloButton) {
			signTester[0] = '+';
			if (resultScreenText.getText().isEmpty() == false && operatorTester[0] == 'N') {
				numberString.clear();
				operatorTester[0] = '%';
				result[0] = Double.parseDouble(resultScreenText.getText());
				operator[0] = '%';
				resultScreenText.setText("0");
			} else if (resultScreenText.getText().isEmpty() == false && operatorTester[0] == '%') {
				numberString.clear();
				operator[0] = '%';
				resultScreenText.setText("0");
			} else if (resultScreenText.getText().isEmpty() == false && (operatorTester[0] == '+'
					|| operatorTester[0] == '-' || operatorTester[0] == '*' || operatorTester[0] == '/')) {
				numberString.clear();
				operator[0] = '%';
			} else {
				result[0] = 0;
			}
		}
	}

}
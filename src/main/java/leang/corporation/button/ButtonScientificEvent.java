package leang.corporation.button;

import java.awt.event.ActionEvent;
import java.util.List;

import leang.corporation.arithmetic.Arithmetic;
import leang.corporation.field.TextField;

/**
 * Class ButtonScientificEvent contains methods related to the Scientific
 * buttons. Those methods mainly use the Arithmetic class to handle events for
 * trigonometric operations and factorial
 * <p>
 * It currently supports methods for 4 buttons :
 * <ul>
 * <li>Trigonometric buttons (cos, sin, tan)
 * <li>Factorial button (!)
 * </ul>
 * 
 * @see leang.corporation.field.TextField
 * @see leang.corporation.button.Button
 * 
 * @author LEANG Denis
 */
public class ButtonScientificEvent {

	/**
	 * Adds an event handler for the cosine button. If the button is clicked, the
	 * numberString list will be reset to catch the next input number and the cosine
	 * function will be applied to the TextField content (converted to double). That
	 * operation will then be stored in result, which is a double list (to bypass
	 * pass by reference) and displayed on screen.
	 * 
	 * @param e                ActionEvent object
	 * @param resultScreenText TextField object
	 * @param cosineButton     Cosine Button (cos)
	 * @param numberString     List of string containing the numerical digits,
	 *                         hyphen and dot which form a real number
	 * @param result           Result displayed after the operation
	 * 
	 * @see Arithmetic#cosine(double)
	 */
	public static void cosineButtonEvent(ActionEvent e, TextField resultScreenText, Button cosineButton,
			List<String> numberString, double[] result) {
		if (e.getSource() == cosineButton) {
			if (resultScreenText.getText().isEmpty() == false) {
				numberString.clear();
				result[0] = Arithmetic.cosine(Double.parseDouble(resultScreenText.getText()));
				resultScreenText.setText(String.valueOf(result[0]));
			}
		}
	}

	/**
	 * Adds an event handler for the sine button. If the button is clicked, the
	 * numberString list will be reset to catch the next input number and the sine
	 * function will be applied to the TextField content (converted to double). That
	 * operation will then be stored in result, which is a double list (to bypass
	 * pass by reference) and displayed on screen.
	 * 
	 * @param e                ActionEvent object
	 * @param resultScreenText TextField object
	 * @param sineButton       Sine Button (sin)
	 * @param numberString     List of string containing the numerical digits,
	 *                         hyphen and dot which form a real number
	 * @param result           Result displayed after the operation
	 * 
	 * @see Arithmetic#sine(double)
	 */
	public static void sineButtonEvent(ActionEvent e, TextField resultScreenText, Button sineButton,
			List<String> numberString, double[] result) {
		if (e.getSource() == sineButton) {
			if (resultScreenText.getText().isEmpty() == false) {
				numberString.clear();
				result[0] = Arithmetic.sine(Double.parseDouble(resultScreenText.getText()));
				resultScreenText.setText(String.valueOf(result[0]));
			}
		}
	}

	/**
	 * Adds an event handler for the tangent button. If the button is clicked, the
	 * numberString list will be reset to catch the next input number and the
	 * tangent function will be applied to the TextField content (converted to
	 * double). That operation will then be stored in result, which is a double list
	 * (to bypass pass by reference) and displayed on screen.
	 * 
	 * @param e                ActionEvent object
	 * @param resultScreenText TextField object
	 * @param tangentButton    Tangent Button (tan)
	 * @param numberString     List of string containing the numerical digits,
	 *                         hyphen and dot which form a real number
	 * @param result           Result displayed after the operation
	 * 
	 * @see Arithmetic#tangent(double)
	 */
	public static void tangentButtonEvent(ActionEvent e, TextField resultScreenText, Button tangentButton,
			List<String> numberString, double[] result) {
		if (e.getSource() == tangentButton) {
			if (resultScreenText.getText().isEmpty() == false) {
				numberString.clear();
				result[0] = Arithmetic.tangent(Double.parseDouble(resultScreenText.getText()));
				resultScreenText.setText(String.valueOf(result[0]));
			}
		}
	}

	/**
	 * Adds an event handler for the factorial button. If the button is clicked, the
	 * numberString list will be reset to catch the next input number and the gamma
	 * function will be applied to the TextField content (converted to double)
	 * incremented by one (so that it corresponds to the factorial of that content
	 * value). That operation will then be stored in result, which is a double list
	 * (to bypass pass by reference) and displayed on screen.
	 * 
	 * @param e                ActionEvent object
	 * @param resultScreenText TextField object
	 * @param factorialButton  Factorial Button (!)
	 * @param numberString     List of string containing the numerical digits,
	 *                         hyphen and dot which form a real number
	 * @param result           Result displayed after the operation
	 * 
	 * @see Arithmetic#gamma(double)
	 */
	public static void factorialButtonEvent(ActionEvent e, TextField resultScreenText, Button factorialButton,
			List<String> numberString, double[] result) {
		if (e.getSource() == factorialButton) {
			if (resultScreenText.getText().isEmpty() == false) {
				numberString.clear();
				result[0] = Arithmetic.gamma(Double.parseDouble(resultScreenText.getText()) + 1);
				resultScreenText.setText(String.valueOf(result[0]));
			}
		}
	}

}

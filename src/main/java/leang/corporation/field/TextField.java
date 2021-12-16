package leang.corporation.field;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

/**
 * Class TextField contains methods related to the screen in which the result is
 * displayed. It inherits all methods from the javax.swing.JTextField class
 * which is part of the Swing library. That class allows the user to add
 * properties to a JTextField object as well as displaying characters such as
 * numbers, dots and hyphens while carefully handling special cases.
 * 
 * @author LEANG Denis
 */

public class TextField extends JTextField {

	/**
	 * Adds some properties to a JTextField component
	 * <p>
	 * Those properties are :
	 * <ul>
	 * <li>Text inside it and alignment property
	 * <li>Background color using color Hexcode as string
	 * <li>Foreground color using color Hexcode as string
	 * <li>Font properties
	 * <li>Absolute position (x,y) in a component such as a JFrame for instance
	 * <li>Width and Height of the JTextField
	 * </ul>
	 * 
	 * @param fieldContent    Text Content
	 * @param backgroundColor Background color
	 * @param foregroundColor Foreground color
	 * @param fontSize        Font Size
	 * @param x               Abscissa value
	 * @param y               Ordinate value
	 * @param width           Width
	 * @param height          Height
	 */
	public void setProperties(String fieldContent, String backgroundColor, String foregroundColor, int fontSize, int x,
			int y, int width, int height) {
		this.setEditable(false);
		this.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
		this.setText(fieldContent);
		this.setBackground(Color.decode(backgroundColor));
		this.setForeground(Color.decode(foregroundColor));
		this.setFont(new java.awt.Font("Lato", Font.BOLD, fontSize));
		this.setBounds(x, y, width, height);
	}

	/**
	 * Adds the argument (number) to the TextField by concatenating its content with
	 * the number
	 * <p>
	 * Special cases :
	 * <ul>
	 * <li>If the TextField contains "0", "NaN", "-NaN", "Infinity", "-Infinity"
	 * (which are often displayed after reaching operation limits), then the
	 * TextField content will be replaced with the argument
	 * <li>If the TextField contains "0." (when deleting chars for instance), then
	 * the Textfield will concatenate the TextField content with the argument
	 * <li>If the TextField contains "-0" (when switching signs for instance), then
	 * the TextField will erase the "0" and replace it with the argument
	 * </ul>
	 * 
	 * @param number Number
	 */
	public void setNumber(String number) {
		if (this.getText().equals("0") || this.getText().equals("NaN") || this.getText().equals("-NaN")
				|| this.getText().equals("Infinity") || this.getText().equals("-Infinity")) {
			this.setText(number);
		} else if (this.getText().equals("0.")) {
			this.setText(this.getText() + number);
		} else if (this.getText().equals("-0")) {
			this.setText(this.getText().substring(0, this.getText().length() - 1) + number);
		} else {
			this.setText(this.getText() + number);
		}
	}

	/**
	 * Adds the argument (dot) to the TextField by concatenating its content with
	 * the dot
	 * 
	 * @param dot Dot
	 */
	public void setDot(String dot) {
		this.setText(this.getText() + dot);
	}

	/**
	 * Removes the first character of the TextField's content if it contains an
	 * hypen (in first position) and if it is not empty
	 * 
	 */
	public void switchSignPlus() {
		if (this.getText().contains("-") == true && this.getText().isEmpty() == false) {
			this.setText(this.getText().substring(1));
		}
	}

	/**
	 * Adds an hypen as the first character in a TextField's content if it does not
	 * already contain one and if it is not empty
	 * 
	 */
	public void switchSignMinus() {
		if (this.getText().contains("-") == false && this.getText().isEmpty() == false) {
			this.setText("-" + this.getText());
		}
	}

}
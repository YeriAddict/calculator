package leang.corporation.button;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

/**
 * Class Button contains methods related to the buttons. It inherits all methods
 * from the javax.swing.JButton class which is part of the Swing library. That
 * class allows the user to add properties to a JButton.
 * 
 * @author LEANG Denis
 */
public class Button extends JButton {

	/**
	 * Adds some properties to a JButton component
	 * <p>
	 * Those properties are :
	 * <ul>
	 * <li>Text inside it
	 * <li>Background color using color Hexcode as string
	 * <li>Foreground color using color Hexcode as string
	 * <li>Font properties
	 * <li>Absolute position (x,y) in a component such as a JFrame for instance
	 * <li>Width and Height of the JButton
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
	public void setProperties(String buttonContent, String backgroundColor, String foregroundColor, int fontSize, int x,
			int y, int width, int height) {
		this.setFocusable(false);
		this.setText(buttonContent);
		this.setBackground(Color.decode(backgroundColor));
		this.setForeground(Color.decode(foregroundColor));
		this.setFont(new java.awt.Font("Lato", Font.BOLD, fontSize));
		this.setBounds(x, y, width, height);
	}

}
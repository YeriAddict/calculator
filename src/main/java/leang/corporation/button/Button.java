package leang.corporation.button;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

public class Button extends JButton {

	public void setProperties(String buttonContent, String backgroundColor, String foregroundColor, int fontSize, int x, int y, int width, int height) {
		this.setFocusable(false);
		this.setText(buttonContent);
		this.setBackground(Color.decode(backgroundColor));
		this.setForeground(Color.decode(foregroundColor));
		this.setFont(new java.awt.Font("Lato", Font.BOLD, fontSize));
		this.setBounds(x, y, width, height);
	}
}
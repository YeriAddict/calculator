package leang.corporation.field;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

public class TextField extends JTextField{
	
	public void setProperties(String fieldContent, String backgroundColor, String foregroundColor, int fontSize, int x, int y, int width, int height ) {
		this.setEditable(false);
		this.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
		this.setText(fieldContent);
		this.setBackground(Color.decode(backgroundColor));
		this.setForeground(Color.decode(foregroundColor));
		this.setFont(new java.awt.Font("Lato", Font.BOLD, fontSize));
		this.setBounds(x,y,width,height);
	}
	
	public void setNumber(String number) {
		if (this.getText().equals("0")) {
			this.setText(number);
		}
		else if (this.getText().equals("0.")){
    		this.setText(this.getText() + number);
		}
		else if (this.getText().equals("-0")){
    		this.setText(this.getText().substring(0, this.getText().length() - 1) + number);
		}
		else {
			this.setText(this.getText() + number);
		}
	}
	
	public void setDot(String dot) {
		this.setText(this.getText() + dot);
	}
	
	public void switchSign() {
		if (this.getText().contains("-") == false) {
			this.setText("-" + this.getText());
		}
	}
}

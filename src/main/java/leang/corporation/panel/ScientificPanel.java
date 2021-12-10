package leang.corporation.panel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class ScientificPanel extends JPanel{
	JButton zeroScientificButton = new JButton("0");
	JButton oneScientificButton = new JButton("1");
	JButton twoScientificButton = new JButton("2");
	JButton threeScientificButton = new JButton("3");
	JButton fourScientificButton = new JButton("4");
	JButton fiveScientificButton = new JButton("5");
	JButton sixScientificButton = new JButton("6");
	JButton sevenScientificButton = new JButton("7");
	JButton eightScientificButton = new JButton("8");
	JButton nineScientificButton = new JButton("9");
	JButton commaScientificButton = new JButton(",");
	JButton deleteScientificButton = new JButton("DEL");
	JButton additionScientificButton = new JButton("+");
	JButton substractionScientificButton = new JButton("-");
	JButton multiplicationScientificButton = new JButton("*");
	JButton divisionScientificButton = new JButton("/");
	JButton moduloScientificButton = new JButton("%");
	JButton resetScientificButton = new JButton("C");
	JButton equalScientificButton = new JButton("=");
	JButton copyScientificButton = new JButton("COPY");
	JButton leftParenthesisScientificButton = new JButton("(");
	JButton rightParenthesisScientificButton = new JButton(")");
	JButton cosScientificButton = new JButton("cos");
	JButton sinScientificButton = new JButton("sin");
	JButton tanScientificButton = new JButton("tan");
	JButton factorialScientificButton = new JButton("!");
	JTextField resultScientificScreenText = new JTextField();
	JScrollPane resultScientificScreen = new JScrollPane(resultScientificScreenText);
	
	public ScientificPanel () {
		setProperties();
		addComponentsToPanel();
		setBackgroundColor();
		setForegroundColor();
		setFont();
		setPosition();
	}
	
	public void setProperties() {
		this.setLayout(null);
		resultScientificScreen.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		resultScientificScreenText.setEditable(false);
		resultScientificScreenText.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
	}
	
	public void addComponentsToPanel() {
		this.add(zeroScientificButton);
		this.add(oneScientificButton);
		this.add(twoScientificButton);
		this.add(threeScientificButton);
		this.add(fourScientificButton);
		this.add(fiveScientificButton);
		this.add(sixScientificButton);
		this.add(sevenScientificButton);
		this.add(eightScientificButton);
		this.add(nineScientificButton);
		this.add(commaScientificButton);
		this.add(deleteScientificButton);
		this.add(additionScientificButton);
		this.add(substractionScientificButton);
		this.add(multiplicationScientificButton);
		this.add(divisionScientificButton);
		this.add(moduloScientificButton);
		this.add(resetScientificButton);
		this.add(equalScientificButton);
		this.add(copyScientificButton);
		this.add(leftParenthesisScientificButton);
		this.add(rightParenthesisScientificButton);
		this.add(cosScientificButton);
		this.add(sinScientificButton);
		this.add(tanScientificButton);
		this.add(factorialScientificButton);
		this.add(resultScientificScreen);
	}
	
	public void setBackgroundColor() {
		this.setBackground(Color.decode("#333333"));
		resultScientificScreen.getViewport().getView().setBackground(Color.decode("#333333"));
		zeroScientificButton.setBackground(Color.decode("#000000"));
		oneScientificButton.setBackground(Color.decode("#000000"));
		twoScientificButton.setBackground(Color.decode("#000000"));
		threeScientificButton.setBackground(Color.decode("#000000"));
		fourScientificButton.setBackground(Color.decode("#000000"));
		fiveScientificButton.setBackground(Color.decode("#000000"));
		sixScientificButton.setBackground(Color.decode("#000000"));
		sevenScientificButton.setBackground(Color.decode("#000000"));
		eightScientificButton.setBackground(Color.decode("#000000"));
		nineScientificButton.setBackground(Color.decode("#000000"));
		commaScientificButton.setBackground(Color.decode("#000000"));
		deleteScientificButton.setBackground(Color.decode("#000000"));
		additionScientificButton.setBackground(Color.decode("#191919"));
		substractionScientificButton.setBackground(Color.decode("#191919"));
		multiplicationScientificButton.setBackground(Color.decode("#191919"));
		divisionScientificButton.setBackground(Color.decode("#191919"));
		moduloScientificButton.setBackground(Color.decode("#191919"));
		resetScientificButton.setBackground(Color.decode("#191919"));
		equalScientificButton.setBackground(Color.decode("#191919"));
		copyScientificButton.setBackground(Color.decode("#191919"));
		leftParenthesisScientificButton.setBackground(Color.decode("#191919"));
		rightParenthesisScientificButton.setBackground(Color.decode("#191919"));
		cosScientificButton.setBackground(Color.decode("#191919"));
		sinScientificButton.setBackground(Color.decode("#191919"));
		tanScientificButton.setBackground(Color.decode("#191919"));
		factorialScientificButton.setBackground(Color.decode("#191919"));
	}
	
	public void setForegroundColor() {
		resultScientificScreenText.setForeground(Color.decode("#FFFFFF"));
		zeroScientificButton.setForeground(Color.decode("#D3D3D3"));
		oneScientificButton.setForeground(Color.decode("#D3D3D3"));
		twoScientificButton.setForeground(Color.decode("#D3D3D3"));
		threeScientificButton.setForeground(Color.decode("#D3D3D3"));
		fourScientificButton.setForeground(Color.decode("#D3D3D3"));
		fiveScientificButton.setForeground(Color.decode("#D3D3D3"));
		sixScientificButton.setForeground(Color.decode("#D3D3D3"));
		sevenScientificButton.setForeground(Color.decode("#D3D3D3"));
		eightScientificButton.setForeground(Color.decode("#D3D3D3"));
		nineScientificButton.setForeground(Color.decode("#D3D3D3"));
		commaScientificButton.setForeground(Color.decode("#D3D3D3"));
		deleteScientificButton.setForeground(Color.decode("#D3D3D3"));
		additionScientificButton.setForeground(Color.decode("#BEBEBE"));
		substractionScientificButton.setForeground(Color.decode("#BEBEBE"));
		multiplicationScientificButton.setForeground(Color.decode("#BEBEBE"));
		divisionScientificButton.setForeground(Color.decode("#BEBEBE"));
		moduloScientificButton.setForeground(Color.decode("#BEBEBE"));
		resetScientificButton.setForeground(Color.decode("#BEBEBE"));
		equalScientificButton.setForeground(Color.decode("#BEBEBE"));
		copyScientificButton.setForeground(Color.decode("#BEBEBE"));
		leftParenthesisScientificButton.setForeground(Color.decode("#BEBEBE"));
		rightParenthesisScientificButton.setForeground(Color.decode("#BEBEBE"));
		cosScientificButton.setForeground(Color.decode("#BEBEBE"));
		sinScientificButton.setForeground(Color.decode("#BEBEBE"));
		tanScientificButton.setForeground(Color.decode("#BEBEBE"));
		factorialScientificButton.setForeground(Color.decode("#BEBEBE"));
		
	}
	
	public void setFont() {
		resultScientificScreenText.setFont(new java.awt.Font("Lato", Font.BOLD, 14));
		zeroScientificButton.setFont(new java.awt.Font("Lato", Font.BOLD, 14));
		oneScientificButton.setFont(new java.awt.Font("Lato", Font.BOLD, 14));
		twoScientificButton.setFont(new java.awt.Font("Lato", Font.BOLD, 14));
		threeScientificButton.setFont(new java.awt.Font("Lato", Font.BOLD, 14));
		fourScientificButton.setFont(new java.awt.Font("Lato", Font.BOLD, 14));
		fiveScientificButton.setFont(new java.awt.Font("Lato", Font.BOLD, 14));
		sixScientificButton.setFont(new java.awt.Font("Lato", Font.BOLD, 14));
		sevenScientificButton.setFont(new java.awt.Font("Lato", Font.BOLD, 14));
		eightScientificButton.setFont(new java.awt.Font("Lato", Font.BOLD, 14));
		nineScientificButton.setFont(new java.awt.Font("Lato", Font.BOLD, 14));
		commaScientificButton.setFont(new java.awt.Font("Lato", Font.BOLD, 14));
		deleteScientificButton.setFont(new java.awt.Font("Lato", Font.BOLD, 14));
		additionScientificButton.setFont(new java.awt.Font("Lato", Font.BOLD, 14));
		substractionScientificButton.setFont(new java.awt.Font("Lato", Font.BOLD, 14));
		multiplicationScientificButton.setFont(new java.awt.Font("Lato", Font.BOLD, 14));
		divisionScientificButton.setFont(new java.awt.Font("Lato", Font.BOLD, 14));
		moduloScientificButton.setFont(new java.awt.Font("Lato", Font.BOLD, 14));
		resetScientificButton.setFont(new java.awt.Font("Lato", Font.BOLD, 14));
		equalScientificButton.setFont(new java.awt.Font("Lato", Font.BOLD, 14));
		copyScientificButton.setFont(new java.awt.Font("Lato", Font.BOLD, 14));
		leftParenthesisScientificButton.setFont(new java.awt.Font("Lato", Font.BOLD, 14));
		rightParenthesisScientificButton.setFont(new java.awt.Font("Lato", Font.BOLD, 14));
		cosScientificButton.setFont(new java.awt.Font("Lato", Font.BOLD, 14));
		sinScientificButton.setFont(new java.awt.Font("Lato", Font.BOLD, 14));
		tanScientificButton.setFont(new java.awt.Font("Lato", Font.BOLD, 14));
		factorialScientificButton.setFont(new java.awt.Font("Lato", Font.BOLD, 14));
	}
	
	public void setPosition() {
		zeroScientificButton.setBounds(5,430,75,50);
		oneScientificButton.setBounds(5,370,75,50);
		fourScientificButton.setBounds(5,310,75,50);
		sevenScientificButton.setBounds(5,250,75,50);
		copyScientificButton.setBounds(5,190,75,50);
		cosScientificButton.setBounds(5,130,75,50);
		leftParenthesisScientificButton.setBounds(5,70,75,50);
		rightParenthesisScientificButton.setBounds(5,10,75,50);
		
		commaScientificButton.setBounds(90,430,75,50);
		twoScientificButton.setBounds(90,370,75,50);
		fiveScientificButton.setBounds(90,310,75,50);
		eightScientificButton.setBounds(90,250,75,50);
		resetScientificButton.setBounds(90,190,75,50);
		sinScientificButton.setBounds(90,130,75,50);
		
		deleteScientificButton.setBounds(175,430,75,50);
		threeScientificButton.setBounds(175,370,75,50);
		sixScientificButton.setBounds(175,310,75,50);
		nineScientificButton.setBounds(175,250,75,50);
		moduloScientificButton.setBounds(175,190,75,50);
		tanScientificButton.setBounds(175,130,75,50);
		
		equalScientificButton.setBounds(260,430,75,50);
		additionScientificButton.setBounds(260,370,75,50);
		substractionScientificButton.setBounds(260,310,75,50);
		multiplicationScientificButton.setBounds(260,250,75,50);
		divisionScientificButton.setBounds(260,190,75,50);
		factorialScientificButton.setBounds(260,130,75,50);

		resultScientificScreen.setBounds(90,5,245,100);
	}
}
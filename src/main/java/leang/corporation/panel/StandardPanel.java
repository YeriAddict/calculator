package leang.corporation.panel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

import leang.corporation.button.Button;
import leang.corporation.button.ButtonEvent;
import leang.corporation.field.TextField;

public class StandardPanel extends JPanel implements ActionListener {
	Button[] numberButtons = new Button[11];
	Button zeroButton = new Button();
	Button oneButton = new Button();
	Button twoButton = new Button();
	Button threeButton = new Button();
	Button fourButton = new Button();
	Button fiveButton = new Button();
	Button sixButton = new Button();
	Button sevenButton = new Button();
	Button eightButton = new Button();
	Button nineButton = new Button();
	Button dotButton = new Button();

	Button[] actionButtons = new Button[4];
	Button resetButton = new Button();
	Button deleteButton = new Button();
	Button equalButton = new Button();
	Button switchNegativeButton = new Button();

	Button[] arithmeticButtons = new Button[5];
	Button additionButton = new Button();
	Button subtractionButton = new Button();
	Button multiplicationButton = new Button();
	Button divisionButton = new Button();
	Button moduloButton = new Button();

	TextField resultScreenText = new TextField();
	ButtonEvent buttonEvent = new ButtonEvent();

	double zeroTester;
	List<String> numberString = new ArrayList<String>();
	double[] number = new double[1];
	double[] result = new double[1];
	char[] operator = new char[1];
	// Prevents mistakes when users missclick operation buttons multiple times
	char[] occurenceTester = new char[1];

	public StandardPanel() {
		numberButtons[0] = zeroButton;
		numberButtons[1] = oneButton;
		numberButtons[2] = twoButton;
		numberButtons[3] = threeButton;
		numberButtons[4] = fourButton;
		numberButtons[5] = fiveButton;
		numberButtons[6] = sixButton;
		numberButtons[7] = sevenButton;
		numberButtons[8] = eightButton;
		numberButtons[9] = nineButton;
		numberButtons[10] = dotButton;

		actionButtons[0] = resetButton;
		actionButtons[1] = deleteButton;
		actionButtons[2] = equalButton;
		actionButtons[3] = switchNegativeButton;

		arithmeticButtons[0] = additionButton;
		arithmeticButtons[1] = subtractionButton;
		arithmeticButtons[2] = multiplicationButton;
		arithmeticButtons[3] = divisionButton;
		arithmeticButtons[4] = moduloButton;

		setButtons();
		setTextField();
		setProperties();
		addComponentsToPanel();
		addActionEvent();
	}

	public void setButtons() {
		zeroButton.setProperties("0", "#000000", "#D3D3D3", 14, 5, 420, 75, 60);
		oneButton.setProperties("1", "#000000", "#D3D3D3", 14, 5, 345, 75, 60);
		fourButton.setProperties("4", "#000000", "#D3D3D3", 14, 5, 270, 75, 60);
		sevenButton.setProperties("7", "#000000", "#D3D3D3", 14, 5, 195, 75, 60);
		switchNegativeButton.setProperties("+/-", "#191919", "#BEBEBE", 14, 5, 120, 75, 60);

		dotButton.setProperties(".", "#000000", "#D3D3D3", 14, 90, 420, 75, 60);
		twoButton.setProperties("2", "#000000", "#D3D3D3", 14, 90, 345, 75, 60);
		fiveButton.setProperties("5", "#000000", "#D3D3D3", 14, 90, 270, 75, 60);
		eightButton.setProperties("8", "#000000", "#D3D3D3", 14, 90, 195, 75, 60);
		resetButton.setProperties("C", "#191919", "#BEBEBE", 14, 90, 120, 75, 60);

		deleteButton.setProperties("DEL", "#000000", "#D3D3D3", 14, 175, 420, 75, 60);
		threeButton.setProperties("3", "#000000", "#D3D3D3", 14, 175, 345, 75, 60);
		sixButton.setProperties("6", "#000000", "#D3D3D3", 14, 175, 270, 75, 60);
		nineButton.setProperties("9", "#000000", "#D3D3D3", 14, 175, 195, 75, 60);
		moduloButton.setProperties("%", "#191919", "#BEBEBE", 14, 175, 120, 75, 60);

		equalButton.setProperties("=", "#191919", "#BEBEBE", 14, 260, 420, 75, 60);
		additionButton.setProperties("+", "#191919", "#BEBEBE", 14, 260, 345, 75, 60);
		subtractionButton.setProperties("-", "#191919", "#BEBEBE", 14, 260, 270, 75, 60);
		multiplicationButton.setProperties("*", "#191919", "#BEBEBE", 14, 260, 195, 75, 60);
		divisionButton.setProperties("/", "#191919", "#BEBEBE", 14, 260, 120, 75, 60);
	}

	public void setTextField() {
		resultScreenText.setProperties("0", "#333333", "#FFFFFF", 18, 90, 5, 245, 100);
	}

	public void setProperties() {
		this.setLayout(null);
		this.setBackground(Color.decode("#333333"));
	}

	public void addComponentsToPanel() {
		for (int i = 0; i < 11; i++) {
			this.add(numberButtons[i]);
		}
		for (int i = 0; i < 4; i++) {
			this.add(actionButtons[i]);
		}
		for (int i = 0; i < 5; i++) {
			this.add(arithmeticButtons[i]);
		}
		this.add(resultScreenText);
	}

	public void addActionEvent() {
		for (int i = 0; i < 11; i++) {
			numberButtons[i].addActionListener(this);
		}
		for (int i = 0; i < 4; i++) {
			actionButtons[i].addActionListener(this);
		}
		for (int i = 0; i < 5; i++) {
			arithmeticButtons[i].addActionListener(this);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		buttonEvent.numberButtonsEvent(resultScreenText, e, numberButtons, switchNegativeButton, numberString, number);
		buttonEvent.dotButtonEvent(resultScreenText, e, dotButton, numberString, number);
		buttonEvent.resetButtonEvent(resultScreenText, e, resetButton, numberString, result, number);
		buttonEvent.deleteButtonEvent(resultScreenText, e, deleteButton, numberString, number);
		System.out.println("Texte : " + resultScreenText.getText());
		System.out.println(numberString.toString());
		System.out.println("Number :" + number[0]);
		System.out.println("Result :" + result[0]);
		
		buttonEvent.additionButtonEvent(resultScreenText, e, additionButton, numberString, operator, result, occurenceTester);
		buttonEvent.subtractionButtonEvent(resultScreenText, e, subtractionButton, numberString, operator, result, occurenceTester);
		buttonEvent.multiplicationButtonEvent(resultScreenText, e, multiplicationButton, numberString, operator, result, occurenceTester);
		buttonEvent.divisionButtonEvent(resultScreenText, e, divisionButton, numberString, operator, result, occurenceTester);
		buttonEvent.moduloButtonEvent(resultScreenText, e, moduloButton, numberString, operator, result, occurenceTester);
		buttonEvent.equalButtonEvent(resultScreenText, e, equalButton, numberString, operator, result, number, occurenceTester);
	}

}
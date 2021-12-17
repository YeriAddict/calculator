package leang.corporation.panel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

import leang.corporation.button.Button;
import leang.corporation.button.ButtonActionEvent;
import leang.corporation.button.ButtonScientificEvent;
import leang.corporation.button.ButtonStandardEvent;
import leang.corporation.field.TextField;

/**
 * Class Panel contains methods related to panels. It inherits all methods from
 * the javax.swing.JPanel class which is part of the Swing library. It also
 * implements ActionListener. With this class, the user can add components and
 * their properties such as buttons to the panel as well as events associated to
 * them.
 * 
 * @see Button
 * @see ButtonActionEvent
 * @see ButtonStandardEvent
 * @see ButtonScientificEvent
 * @see TextField
 * @author LEANG Denis
 */
public class Panel extends JPanel implements ActionListener {

	/**
	 * List of number buttons (0123456789.)
	 */
	Button[] numberButtons = new Button[11];
	/**
	 * Button 0
	 */
	Button zeroButton = new Button();
	/**
	 * Button 1
	 */
	Button oneButton = new Button();
	/**
	 * Button 2
	 */
	Button twoButton = new Button();
	/**
	 * Button 3
	 */
	Button threeButton = new Button();
	/**
	 * Button 4
	 */
	Button fourButton = new Button();
	/**
	 * Button 5
	 */
	Button fiveButton = new Button();
	/**
	 * Button 6
	 */
	Button sixButton = new Button();
	/**
	 * Button 7
	 */
	Button sevenButton = new Button();
	/**
	 * Button 8
	 */
	Button eightButton = new Button();
	/**
	 * Button 9
	 */
	Button nineButton = new Button();
	/**
	 * Button .
	 */
	Button dotButton = new Button();

	/**
	 * List of action buttons (C;DEL;=;+/-)
	 */
	Button[] actionButtons = new Button[4];
	/**
	 * Button C
	 */
	Button resetButton = new Button();
	/**
	 * Button DEL
	 */
	Button deleteButton = new Button();
	/**
	 * Button =
	 */
	Button equalButton = new Button();
	/**
	 * Button +/-
	 */
	Button switchSignButton = new Button();

	/**
	 * List of arithmetic buttons (+;-;*;/;%)
	 */
	Button[] arithmeticButtons = new Button[5];
	/**
	 * Button +
	 */
	Button additionButton = new Button();
	/**
	 * Button -
	 */
	Button subtractionButton = new Button();
	/**
	 * Button *
	 */
	Button multiplicationButton = new Button();
	/**
	 * Button /
	 */
	Button divisionButton = new Button();
	/**
	 * Button %
	 */
	Button moduloButton = new Button();

	/**
	 * List of scientific buttons (cos;sin;tan;!)
	 */
	Button[] scientificButtons = new Button[4];
	/**
	 * Button cos
	 */
	Button cosButton = new Button();
	/**
	 * Button sin
	 */
	Button sinButton = new Button();
	/**
	 * Button tan
	 */
	Button tanButton = new Button();
	/**
	 * Button !
	 */
	Button factorialButton = new Button();

	/**
	 * TextField
	 */
	TextField resultScreenText = new TextField();

	/**
	 * List of string containing the numerical digits, hyphen and dot which form a
	 * real number
	 */
	List<String> numberString = new ArrayList<String>();

	/**
	 * Operand
	 */
	double[] number = new double[1];

	/**
	 * Result displayed after the operation
	 */
	double[] result = new double[1];

	/**
	 * Character used to contain an operator
	 */
	char[] operator = new char[1];

	/**
	 * Character used to handle operation chaining and avoid errors
	 */
	char[] operatorTester = new char[1];
	/**
	 * Character used to handle the switchSignButton behavior
	 */
	char[] signTester = new char[1];

	/**
	 * Creates a panel with all the buttons
	 */
	public Panel() {
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
		actionButtons[3] = switchSignButton;

		arithmeticButtons[0] = additionButton;
		arithmeticButtons[1] = subtractionButton;
		arithmeticButtons[2] = multiplicationButton;
		arithmeticButtons[3] = divisionButton;
		arithmeticButtons[4] = moduloButton;

		scientificButtons[0] = cosButton;
		scientificButtons[1] = sinButton;
		scientificButtons[2] = tanButton;
		scientificButtons[3] = factorialButton;

		operatorTester[0] = 'N';
		signTester[0] = '+';
	}

	/**
	 * Adds properties to the TextField. This method calls the setProperties()
	 * method from TextField.
	 *
	 * @see TextField#setProperties(String, String, String, int, int, int, int, int)
	 */
	public void setTextField() {
		resultScreenText.setProperties("0", "#333333", "#FFFFFF", 18, 90, 5, 245, 100);
	}

	/**
	 * Adds properties to the JPanel.
	 */
	public void setProperties() {
		this.setLayout(null);
		this.setBackground(Color.decode("#333333"));
	}

	/**
	 * Adds properties to the Buttons. This method calls the setProperties() method
	 * from Button. The user can setup the mode by calling the argument either
	 * "Standard Mode" or "Scientific Mode"
	 * 
	 * @param mode Panel mode
	 * 
	 * @see Button#setProperties(String, String, String, int, int, int, int, int)
	 * @see StandardPanel
	 * @see ScientificPanel
	 */
	public void setButtons(String mode) {
		if (mode.equals("Standard Mode")) {
			zeroButton.setProperties("0", "#000000", "#D3D3D3", 14, 5, 420, 75, 60);
			oneButton.setProperties("1", "#000000", "#D3D3D3", 14, 5, 345, 75, 60);
			fourButton.setProperties("4", "#000000", "#D3D3D3", 14, 5, 270, 75, 60);
			sevenButton.setProperties("7", "#000000", "#D3D3D3", 14, 5, 195, 75, 60);
			switchSignButton.setProperties("+/-", "#191919", "#BEBEBE", 14, 5, 120, 75, 60);

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
		} else if (mode.equals("Scientific Mode")) {
			zeroButton.setProperties("0", "#000000", "#D3D3D3", 14, 5, 430, 75, 50);
			oneButton.setProperties("1", "#000000", "#D3D3D3", 14, 5, 370, 75, 50);
			fourButton.setProperties("4", "#000000", "#D3D3D3", 14, 5, 310, 75, 50);
			sevenButton.setProperties("7", "#000000", "#D3D3D3", 14, 5, 250, 75, 50);
			switchSignButton.setProperties("+/-", "#191919", "#BEBEBE", 14, 5, 190, 75, 50);
			cosButton.setProperties("cos", "#191919", "#BEBEBE", 14, 5, 130, 75, 50);

			dotButton.setProperties(".", "#000000", "#D3D3D3", 14, 90, 430, 75, 50);
			twoButton.setProperties("2", "#000000", "#D3D3D3", 14, 90, 370, 75, 50);
			fiveButton.setProperties("5", "#000000", "#D3D3D3", 14, 90, 310, 75, 50);
			eightButton.setProperties("8", "#000000", "#D3D3D3", 14, 90, 250, 75, 50);
			resetButton.setProperties("C", "#191919", "#BEBEBE", 14, 90, 190, 75, 50);
			sinButton.setProperties("sin", "#191919", "#BEBEBE", 14, 90, 130, 75, 50);

			deleteButton.setProperties("DEL", "#000000", "#D3D3D3", 14, 175, 430, 75, 50);
			threeButton.setProperties("3", "#000000", "#D3D3D3", 14, 175, 370, 75, 50);
			sixButton.setProperties("6", "#000000", "#D3D3D3", 14, 175, 310, 75, 50);
			nineButton.setProperties("9", "#000000", "#D3D3D3", 14, 175, 250, 75, 50);
			moduloButton.setProperties("%", "#191919", "#BEBEBE", 14, 175, 190, 75, 50);
			tanButton.setProperties("tan", "#191919", "#BEBEBE", 14, 175, 130, 75, 50);

			equalButton.setProperties("=", "#191919", "#BEBEBE", 14, 260, 430, 75, 50);
			additionButton.setProperties("+", "#191919", "#BEBEBE", 14, 260, 370, 75, 50);
			subtractionButton.setProperties("-", "#191919", "#BEBEBE", 14, 260, 310, 75, 50);
			multiplicationButton.setProperties("*", "#191919", "#BEBEBE", 14, 260, 250, 75, 50);
			divisionButton.setProperties("/", "#191919", "#BEBEBE", 14, 260, 190, 75, 50);
			factorialButton.setProperties("!", "#191919", "#BEBEBE", 14, 260, 130, 75, 50);
		}
	}

	/**
	 * Adds components to the JPanel. The user can setup the mode by calling the
	 * argument either "Standard Mode" or "Scientific Mode"
	 * 
	 * @param mode Panel mode
	 */
	public void addComponentsToPanel(String mode) {
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

		if (mode.equals("Scientific Mode")) {
			for (int i = 0; i < 4; i++) {
				this.add(scientificButtons[i]);
			}
		}
	}

	/**
	 * Adds action events. The user can setup the mode by calling the argument
	 * either "Standard Mode" or "Scientific Mode"
	 * 
	 * @param mode Panel mode
	 */
	public void addActionEvent(String mode) {
		for (int i = 0; i < 11; i++) {
			numberButtons[i].addActionListener(this);
		}
		for (int i = 0; i < 4; i++) {
			actionButtons[i].addActionListener(this);
		}
		for (int i = 0; i < 5; i++) {
			arithmeticButtons[i].addActionListener(this);
		}

		if (mode.equals("Scientific Mode")) {
			for (int i = 0; i < 4; i++) {
				scientificButtons[i].addActionListener(this);
			}
		}
	}

	/**
	 * Performs actions. This method calls all the methods in the ButtonActionEvent,
	 * ButtonStandardEvent and ButtonScientificEvent classes.
	 * 
	 * @param e ActionEvent object
	 * 
	 * @see ButtonActionEvent
	 * @see ButtonStandardEvent
	 * @see ButtonScientificEvent
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		ButtonActionEvent.numberButtonsEvent(e, resultScreenText, numberButtons, switchSignButton, numberString, number,
				signTester);
		ButtonActionEvent.dotButtonEvent(e, resultScreenText, dotButton, numberString, number);
		ButtonActionEvent.resetButtonEvent(e, resultScreenText, resetButton, numberString, operator, operatorTester,
				signTester, result, number);
		ButtonActionEvent.deleteButtonEvent(e, resultScreenText, deleteButton, numberString, signTester, number);

		ButtonStandardEvent.additionButtonEvent(e, resultScreenText, additionButton, numberString, operator,
				operatorTester, signTester, result);
		ButtonStandardEvent.subtractionButtonEvent(e, resultScreenText, subtractionButton, numberString, operator,
				operatorTester, signTester, result);
		ButtonStandardEvent.multiplicationButtonEvent(e, resultScreenText, multiplicationButton, numberString, operator,
				operatorTester, signTester, result);
		ButtonStandardEvent.divisionButtonEvent(e, resultScreenText, divisionButton, numberString, operator,
				operatorTester, signTester, result);
		ButtonStandardEvent.moduloButtonEvent(e, resultScreenText, moduloButton, numberString, operator, operatorTester,
				signTester, result);

		ButtonScientificEvent.cosineButtonEvent(e, resultScreenText, cosButton, numberString, result);
		ButtonScientificEvent.sineButtonEvent(e, resultScreenText, sinButton, numberString, result);
		ButtonScientificEvent.tangentButtonEvent(e, resultScreenText, tanButton, numberString, result);
		ButtonScientificEvent.factorialButtonEvent(e, resultScreenText, factorialButton, numberString, result);

		ButtonActionEvent.equalButtonEvent(e, resultScreenText, equalButton, numberString, operator, operatorTester,
				signTester, result, number);
	}

}
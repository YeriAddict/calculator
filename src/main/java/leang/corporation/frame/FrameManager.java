package leang.corporation.frame;

import java.awt.Color;
import javax.swing.*;

/**
 * Class FrameManager contains methods which manage frames. It creates an object from the MainFrame class.
 * 
 * @see MainFrame
 * @author LEANG Denis
 */
public class FrameManager {

	/**
	 * MainFrame object
	 */
	MainFrame mainFrame;

	/**
	 * Adds some properties to a MainFrame 
	 * <p>
	 * Those properties are :
	 * <ul>
	 * <li>Title 
	 * <li>Background color using color Hexcode
	 * <li>Absolute position (x,y) in a component such as a JFrame for instance
	 * <li>Width and Height of the JButton
	 * <li>Various properties (closing, visible...)
	 * </ul>
	 * 
	 */
	public void setupMainFrame() {
		this.mainFrame = new MainFrame(this);
		mainFrame.setTitle("Calculator - LeangCorporation");
		mainFrame.setVisible(true);
		mainFrame.setBounds(10, 10, 355, 550);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setResizable(false);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.getContentPane().setBackground(Color.decode("#333333"));
	}

}
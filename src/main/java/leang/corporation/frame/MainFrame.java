package leang.corporation.frame;

import java.awt.Font;
import javax.swing.*;
import leang.corporation.panel.StandardPanel;
import leang.corporation.panel.ScientificPanel;

/**
 * Class MainFrame contains methods for the main frame. For instance, a
 * JTabbedPane is added to the frame with various properties. This JTabbedPane contains StandardPanel and ScientificPanel.
 * 
 * @see MainFrame
 * @see leang.corporation.panel.Panel
 * @see StandardPanel
 * @see ScientificPanel
 * @author LEANG Denis
 */
public class MainFrame extends JFrame {

	/**
	 * FrameManager object
	 */
	FrameManager manager;
	/**
	 * JTabbedPane object
	 */
	JTabbedPane modeTab = new JTabbedPane();
	/**
	 * StandardPanel singleton object
	 */
	StandardPanel standardPanel = StandardPanel.getInstance();
	/**
	 * ScientificPanel singleton object
	 */
	ScientificPanel scientificPanel = ScientificPanel.getInstance();

	/**
	 * Creates a MainFrame object
	 * 
	 * @param manager Frame manager
	 * 
	 * @see FrameManager
	 */
	public MainFrame(FrameManager manager) {
		this.manager = manager;
		addComponentsToTabbedPane();
		setTabbedPaneProperties();
		this.add(modeTab);
	}

	/**
	 * Adds components such as Panel objects to the JTabbedPane
	 * 
	 * @see StandardPanel
	 * @see ScientificPanel
	 */
	public void addComponentsToTabbedPane() {
		modeTab.add("Standard Mode", standardPanel);
		modeTab.add("Scientific Mode", scientificPanel);
	}

	/**
	 * Adds properties to the JTabbedPane
	 * 
	 * Those properties are :
	 * <ul>
	 * <li>Width and Height of the JButton
	 * <li>Font and Font size
	 * </ul>
	 */
	public void setTabbedPaneProperties() {
		modeTab.setSize(350, 550);
		modeTab.setFont(new java.awt.Font("Lato", Font.BOLD, 12));
		modeTab.setVisible(true);
	}

}
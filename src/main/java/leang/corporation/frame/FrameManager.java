package leang.corporation.frame;

import java.awt.Color;
import javax.swing.*;

public class FrameManager {

	MainFrame mainFrame;

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
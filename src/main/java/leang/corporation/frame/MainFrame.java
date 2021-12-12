package leang.corporation.frame;

import java.awt.Font;
import javax.swing.*;
import leang.corporation.panel.StandardPanel;
import leang.corporation.panel.ScientificPanel;

public class MainFrame extends JFrame {

	FrameManager manager;
	JTabbedPane modeTab = new JTabbedPane();
	StandardPanel standardPanel = new StandardPanel();
	ScientificPanel scientificPanel = new ScientificPanel();

	public MainFrame(FrameManager manager) {
		this.manager = manager;
		addComponentsToTabbedPane();
		setTabbedPaneProperties();
		this.add(modeTab);
	}

	public void addComponentsToTabbedPane() {
		modeTab.add("Standard Mode", standardPanel);
		modeTab.add("Scientific Mode", scientificPanel);
	}

	public void setTabbedPaneProperties() {
		modeTab.setSize(350, 550);
		modeTab.setFont(new java.awt.Font("Lato", Font.BOLD, 12));
		modeTab.setVisible(true);
	}

}
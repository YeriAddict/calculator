package leang.corporation.main;

import leang.corporation.frame.FrameManager;

/**
 * Class Calculator is the main class of this project. It supports the Nimbus LookAndFeel and creates the FrameManager.
 * 
 * @author LEANG Denis
 */
public class Calculator {

	/**
	 * Main Calculator
	 * 
	 * @param args Args
	 */
	public static void main(String[] args) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(FrameManager.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(FrameManager.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(FrameManager.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(FrameManager.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		FrameManager manager = new FrameManager();
		manager.setupMainFrame();
	}

}
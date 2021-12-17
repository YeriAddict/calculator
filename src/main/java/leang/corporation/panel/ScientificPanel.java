package leang.corporation.panel;

/**
 * Class ScientificPanel is a singleton inheriting all methods from class Panel.
 * 
 * @see Panel
 * @author LEANG Denis
 */
public class ScientificPanel extends Panel {

	/**
	 * ScientificPanel object
	 */
	private static ScientificPanel uniqueInstance = null;

	/**
	 * Creates a Panel with all the properties in "Scientific Mode"
	 */
	public ScientificPanel() {
		this.setTextField();
		this.setProperties();
		this.setButtons("Scientific Mode");
		this.addComponentsToPanel("Scientific Mode");
		this.addActionEvent("Scientific Mode");
	}

	/**
	 * Handles singleton design pattern
	 * 
	 * @return Unique ScientificPanel object
	 */
	public static ScientificPanel getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new ScientificPanel();
		}
		return uniqueInstance;
	}

}
package leang.corporation.panel;

/**
 * Class StandardPanel is a singleton inheriting all methods from class Panel.
 * 
 * @see Panel
 * @author LEANG Denis
 */
public class StandardPanel extends Panel {

	/**
	 * StandardPanel object
	 */
	private static StandardPanel uniqueInstance = null;

	/**
	 * Creates a Panel with all the properties in "Standard Mode"
	 */
	public StandardPanel() {
		this.setTextField();
		this.setProperties();
		this.setButtons("Standard Mode");
		this.addComponentsToPanel("Standard Mode");
		this.addActionEvent("Standard Mode");
	}

	/**
	 * Handles singleton design pattern
	 * 
	 * @return Unique StandardPanel object
	 */
	public static StandardPanel getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new StandardPanel();
		}
		return uniqueInstance;
	}

}
package leang.corporation.panel;

public class StandardPanel extends Panel {

	private static StandardPanel uniqueInstance = null;
	
	public StandardPanel() {
		this.setTextField();
		this.setProperties();
		this.setButtons("Standard Mode");
		this.addComponentsToPanel("Standard Mode");
		this.addActionEvent("Standard Mode");
	}

	public static StandardPanel getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new StandardPanel();
		}
		return uniqueInstance;
	}
	
}
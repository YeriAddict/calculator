package leang.corporation.panel;

public class ScientificPanel extends Panel {

	private static ScientificPanel uniqueInstance = null;
	
	public ScientificPanel() {
		this.setTextField();
		this.setProperties();
		this.setButtons("Scientific Mode");
		this.addComponentsToPanel("Scientific Mode");
		this.addActionEvent("Scientific Mode");
	}
	
	public static ScientificPanel getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new ScientificPanel();
		}
		return uniqueInstance;
	}

}
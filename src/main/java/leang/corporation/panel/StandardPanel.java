package leang.corporation.panel;

public class StandardPanel extends Panel {

	public StandardPanel() {
		this.setTextField();
		this.setProperties();
		this.setButtons("Standard Mode");
		this.addComponentsToPanel("Standard Mode");
		this.addActionEvent("Standard Mode");
	}

}
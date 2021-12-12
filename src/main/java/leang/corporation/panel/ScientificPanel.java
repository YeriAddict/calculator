package leang.corporation.panel;

public class ScientificPanel extends Panel {

	public ScientificPanel() {
		this.setTextField();
		this.setProperties();
		this.setButtons("Scientific Mode");
		this.addComponentsToPanel("Scientific Mode");
		this.addActionEvent("Scientific Mode");
	}

}
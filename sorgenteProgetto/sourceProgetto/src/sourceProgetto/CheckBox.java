package sourceProgetto;

public class CheckBox extends ElementoGrafico {
	private Label label;
	private boolean check;
	
	public CheckBox(float x, float y, Label label) {
		super(x, y);
		this.label = label;
	}

	public Label getLabel() {
		return label;
	}

	public CheckBox(float x, float y) {
		super(x, y);
	}

	public boolean isChecked() {
		return check;
	}

	public void setRispostaCheckbox(boolean check) {
		this.check = check;
	}

	@Override
	public String toString() {
		return "CheckBox [label=" + label + ", check=" + check + "]";
	}
	
	
	
}

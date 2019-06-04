package sourceProgetto;

public class Label extends ElementoGrafico {
	private String font = "Arial";
	private float dimensioneFont;
	private String testo;
	
	public Label(float x, float y, String font, float dimensioneFont, String testo) {
		super(x, y);
		this.font = font;
		this.dimensioneFont = dimensioneFont;
		this.testo = testo;
	}

	public Label(float x, float y, String font, String testo) {
		super(x, y);
		this.font = font;
		this.testo = testo;
	}

	public Label(float x, float y, String testo) {
		super(x, y);
		this.testo = testo;
	}

	public String getFont() {
		return font;
	}

	public void setFont(String font) {
		this.font = font;
	}

	public float getDimensioneFont() {
		return dimensioneFont;
	}

	public void setDimensioneFont(float dimensioneFont) {
		this.dimensioneFont = dimensioneFont;
	}

	public String getTesto() {
		return testo;
	}

	public void setTesto(String testo) {
		this.testo = testo;
	}
	
	public void changeText(String newText) {
		setTesto(newText);
	}
	
	public void resizeLabel(float newY) {
		setY(newY);
	}

	@Override
	public String toString() {
		return "Label [font=" + font + ", dimensioneFont=" + dimensioneFont + ", testo=" + testo + ", X=" + getX()
				+ ", Y=" + getY() + "]";
	}

	
}

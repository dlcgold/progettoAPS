package domain;

public class ElementoGrafico {
	private float X;
	private float Y;
	
	public ElementoGrafico(float x, float y) {
		super();
		X = x;
		Y = y;
	}

	public float getX() {
		return X;
	}

	public void setX(float x) {
		X = x;
	}

	public float getY() {
		return Y;
	}

	public void setY(float y) {
		Y = y;
	}

	@Override
	public String toString() {
		return "ElementoGrafico [X=" + X + ", Y=" + Y + "]";
	}
	
	
	
}

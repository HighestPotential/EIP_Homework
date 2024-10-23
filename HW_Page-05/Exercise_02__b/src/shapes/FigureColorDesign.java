package shapes;

public class FigureColorDesign {
	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	private String fillColor;
	private String lineColor;
	
	public FigureColorDesign(String fillColor, String lineColor) {
		this.fillColor=fillColor;
		this.lineColor=lineColor;
	}
	
	
}

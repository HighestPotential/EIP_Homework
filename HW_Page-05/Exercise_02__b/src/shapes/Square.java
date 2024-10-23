package shapes;

public class Square {
	private FigureColorDesign figureColorDesign;
	private float sideLength;
	
	public float getSideLength() {
		return sideLength;
	}

	public void setSideLength(float sideLength) {
		this.sideLength = sideLength;
	}

	public Square(FigureColorDesign figureColorDesign, float sideLength) {
		this.figureColorDesign = new FigureColorDesign(figureColorDesign.getFillColor(), figureColorDesign.getLineColor());
		this.sideLength=sideLength;
	}
	
	public float getArea() {
		return sideLength*sideLength;
	}
	
	public void setFigureLineAndFillColor(FigureColorDesign figureColorDesign) {
		this.figureColorDesign.setFillColor(figureColorDesign.getFillColor());
		this.figureColorDesign.setLineColor(figureColorDesign.getLineColor());
		
	}
	
	public String getFigureLineColor(){
		return this.figureColorDesign.getLineColor();
	}
	
	public String getFigureFillColor(){
		return this.figureColorDesign.getFillColor();
	}

}

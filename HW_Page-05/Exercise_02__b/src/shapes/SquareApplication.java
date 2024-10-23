package shapes;

public class SquareApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FigureColorDesign figureColorDesign =new FigureColorDesign("white", "black");
		
			Square square=new Square(figureColorDesign, (float) 3.3);
			
			System.out.println(square.getArea());
			System.out.print(square.getFigureLineColor());

	}

}

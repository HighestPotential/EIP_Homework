package defaultPackage;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        testPythagoras();

        // Test Point class
        testPoint();
        
        // Test Case 1: Equilateral Triangle
        Point A1 = new Point(0, 0);
        Point B1 = new Point(1, Math.sqrt(3)); // height of equilateral triangle with side 1
        Point C1 = new Point(2, 0);
        Triangle triangle1 = new Triangle(A1, B1, C1);
        
        assert triangle1.isEquilateral() : "Triangle 1 should be equilateral.";
        //wrong, reason is rounding of double and bit representation of small numbers
        assert triangle1.isIsosceles() : "Triangle 1 should be isosceles.";
        assert triangle1.isAcute() : "Triangle 1 should be acute.";
        assert !triangle1.isRight() : "Triangle 1 should not be right.";
        assert !triangle1.isObtuse() : "Triangle 1 should not be obtuse.";

        // Test Case 2: Isosceles Triangle
        Point A2 = new Point(0, 0);
        Point B2 = new Point(2, 0);
        Point C2 = new Point(1, 2); // height
        Triangle triangle2 = new Triangle(A2, B2, C2);
        
        assert !triangle2.isEquilateral() : "Triangle 2 should not be equilateral.";
        assert triangle2.isIsosceles() : "Triangle 2 should be isosceles.";
        assert triangle2.isAcute() : "Triangle 2 should be acute.";
        assert !triangle2.isRight() : "Triangle 2 should not be right.";
        assert !triangle2.isObtuse() : "Triangle 2 should not be obtuse.";

        // Test Case 3: Right Triangle
        Point A3 = new Point(0, 0);
        Point B3 = new Point(3, 0);
        Point C3 = new Point(0, 4);
        Triangle triangle3 = new Triangle(A3, B3, C3);
        
        assert !triangle3.isEquilateral() : "Triangle 3 should not be equilateral.";
        assert !triangle3.isIsosceles() : "Triangle 3 should not be isosceles.";
        assert !triangle3.isAcute() : "Triangle 3 should not be acute.";
        assert triangle3.isRight() : "Triangle 3 should be right.";
        assert !triangle3.isObtuse() : "Triangle 3 should not be obtuse.";

        // Test Case 4: Obtuse Triangle
        Point A4 = new Point(0, 0);
        Point B4 = new Point(4, 0);
        Point C4 = new Point(1, 3); // height
        Triangle triangle4 = new Triangle(A4, B4, C4);
        
        assert !triangle4.isEquilateral() : "Triangle 4 should not be equilateral.";
        assert !triangle4.isIsosceles() : "Triangle 4 should not be isosceles.";
        assert !triangle4.isAcute() : "Triangle 4 should not be acute.";
        assert !triangle4.isRight() : "Triangle 4 should not be right.";
        assert triangle4.isObtuse() : "Triangle 4 should be obtuse.";

        System.out.println("All tests passed successfully.");
        
	}
	
    private static void testPythagoras() {
        System.out.println("Testing Pythagoras.calculate method:");

        double a = 3;
        double b = 4;
        double result = Pythagoras.calculate(a, b);
        System.out.println("Expected: 5.0, Got: " + result); // 3-4-5 triangle

        a = 5;
        b = 12;
        result = Pythagoras.calculate(a, b);
        System.out.println("Expected: 13.0, Got: " + result); // 5-12-13 triangle

        a = 8;
        b = 15;
        result = Pythagoras.calculate(a, b);
        System.out.println("Expected: 17.0, Got: " + result); // 8-15-17 triangle
    }

    private static void testPoint() {
        System.out.println("\nTesting Point class:");

        // Create Points
        Point point1 = new Point(1, 2);
        Point point2 = new Point(4, 6);

        // Test getX and getY
        System.out.println("Point1 X: Expected: 1.0, Got: " + point1.getX());
        System.out.println("Point1 Y: Expected: 2.0, Got: " + point1.getY());

        // Test distanceTo method
        double distance = point1.distanceTo(point2);
        System.out.println("Distance between Point1 and Point2: Expected: 5.0, Got: " + distance); // sqrt((4-1)^2 + (6-2)^2) = sqrt(9 + 16) = sqrt(25) = 5

        // Test shift method
        point1.shift(2, 3);
        System.out.println("After shifting Point1 by (2, 3):");
        System.out.println("Point1 X: Expected: 3.0, Got: " + point1.getX());
        System.out.println("Point1 Y: Expected: 5.0, Got: " + point1.getY());
    }
    

}

package none;

import java.util.Scanner;

public class ShapeApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape[] shapes = new Shape[10];
        
        System.out.println(" B i t t e geben S i e eine geometrische Form ein . Zur Auswahl stehen : \nDreieck\nQuadrat\nLinie\n\nZum Beenden des Programmes geben S i e \"Ende\" ein . ");
        
        for (int i = 0; i < shapes.length; i++) {

            String currentWord = scanner.next();
            
            switch (currentWord) {
                case "Dreieck":
                    shapes[i] = new Triangle();
                    break;
                case "Linie":
                    shapes[i] = new Line();
                    break;
                case "Quadrat":
                    shapes[i] = new Square();
                    break;
                case "Ende":
                    i = shapes.length; 
                    break;
                default:
                    System.out.println("Wrong Input");
                    i--; 
                    break;
            }
            
            scanner.nextLine();
        }

        System.out.println();
        

        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] != null) {
                shapes[i].printShape();
                System.out.println();
            }
        }

        scanner.close();
    }
}

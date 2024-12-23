package n;

public class Main {
    public static void main(String[] args) {
        // Lambda-Ausdrücke für timesThree und timesFour
        GenericFunction<Integer, Integer> timesThree = x -> x * 3;
        GenericFunction<Integer, Integer> timesFour = x -> x * 4;
        
        // Berechnung und Ausgabe
        System.out.print(timesThree.calculate(timesFour.calculate(5)));  // Gibt 60 aus
    }
}

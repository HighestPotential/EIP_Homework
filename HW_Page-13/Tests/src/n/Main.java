package n;

public class Main {
	public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            try {
                while (!Thread.currentThread().isInterrupted()) {
                    System.out.println("Thread läuft...");
                    Thread.sleep(10);  // Der Thread schläft für 1 Sekunde
                }
            } catch (InterruptedException e) {
                System.out.println("Thread wurde unterbrochen.");
                // Hier könnte der Thread die Unterbrechung verarbeiten und die Arbeit beenden
            }
            System.out.println("Thread beendet.");
        });

        thread.start();  // Startet den Thread

        Thread.sleep(4000); // Warte 3 Sekunden
        thread.interrupt();  // Unterbricht den Thread

        thread.join();  // Wartet darauf, dass der Thread beendet wird
        System.out.println("Thread ist im TERMINATED-Zustand.");
        
        Thread thread1 = new Thread(() -> System.out.println("Hello"));
        thread1.run(); // Just runs in main thread
        thread1.run(); // Also just runs in main thread - no new thread created
    }
}
package n;

import java.util.ArrayList;

public class MultiThreading {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<CounterThread> threads = new ArrayList<>();
        
        // Threads erstellen und starten
        for (int i = 0; i < 5; i++) {
            CounterThread thread = new CounterThread(i + 1); // Nummerierung ab 1
            threads.add(thread);
            thread.start();
        }

        // Warten, bis alle Threads fertig sind
        for (int i = 0; i < 5; i++) {
            threads.get(i).join();
        }

        // Abschlussmeldung
        System.out.println("Fertig");
    }
}

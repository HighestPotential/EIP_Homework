package n;

import java.util.ArrayList;

public class MultiThreading {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<CounterThread> threads = new ArrayList<>();
        
        
        for (int i = 0; i < 5; i++) {
            CounterThread thread = new CounterThread(i + 1); 
            threads.add(thread);
            thread.start();
        }

        
        for (int i = 0; i < 5; i++) {
            threads.get(i).join();
        }

      
        System.out.println("Fertig");
    }
}

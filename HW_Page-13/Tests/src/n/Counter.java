package n;

class Counter {
    private int count = 0;

    public synchronized void increment() {
    	
    		count++;
    	
         // Not thread-safe
    }

    public int getCount() {
        return count;
    }
}
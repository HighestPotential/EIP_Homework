package n;

class CounterThread extends Thread {
    public static int counter = 0;
    private int threadNum;

    
    public CounterThread(int threadNum) {
        this.threadNum = threadNum;
    }

    private static synchronized boolean incrementCounter(int threadNum) {
        
        if (counter >= 42) {
            return false;
        }

      
        counter++;
        System.out.println("Thread " + threadNum + " incremented counter to " + counter);
        return true;
    }

    @Override
    public void run() {
        while (true) {
           
            if (!incrementCounter(threadNum)) {
                break; 
            }

           
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

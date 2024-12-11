package none;

public class TestLinkedQueue {
    public static void main(String[] args) {
        LinkedQueue queue = new LinkedQueue(10);
        
        // Append some elements
        queue.append(20);
        queue.append(30);
        
        // Convert to array and print it
        int[] array = queue.toArray();
        System.out.print("Queue as array: ");
        for (int val : array) {
            System.out.print(val + " "); // Expected: 10 20 30
        }
        System.out.println();
        
        // Remove elements and check the array again
        queue.remove();
        array = queue.toArray();
        System.out.print("Queue as array after one removal: ");
        for (int val : array) {
            System.out.print(val + " "); // Expected: 20 30
        }
    }
}



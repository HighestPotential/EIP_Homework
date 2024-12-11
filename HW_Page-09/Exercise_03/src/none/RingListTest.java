package none;

public class RingListTest {

    public static void main(String[] args) {
        RingListImpl ringList = new RingListImpl();

        // Test 1: Add elements to the ring list
        System.out.println("Test 1: Adding elements");
        ringList.add(10);
        ringList.add(20);
        ringList.add(30);
        System.out.println("Expected: [10, 20, 30]");
        System.out.println("Actual: " + ringList);

        // Test 2: Get current value
        System.out.println("\nTest 2: Get current value");
        System.out.println("Expected: 10");
        System.out.println("Actual: " + ringList.getCurrentValue());

        // Test 3: Rotate the ring list
        System.out.println("\nTest 3: Rotate");
        ringList.rotate();
        System.out.println("Expected after rotation: [30, 10, 20]");
        System.out.println("Actual: " + ringList);

        // Test 4: Check if ring list contains an element
        System.out.println("\nTest 4: Contains check");
        System.out.println("Expected: true for 20, false for 40");
        System.out.println("Actual: " + ringList.contains(20) + ", " + ringList.contains(40));

        // Test 5: Remove current element
        System.out.println("\nTest 5: Remove current element");
        ringList.removeCurrent();
        System.out.println("Expected after removing current: [10, 20]");
        System.out.println("Actual: " + ringList);

        // Test 6: Remove all elements
        System.out.println("\nTest 6: Remove all elements");
        ringList.removeCurrent();
        ringList.removeCurrent();
        System.out.println("Expected: []");
        System.out.println("Actual: " + ringList);

        // Test 7: Add after removing all
        System.out.println("\nTest 7: Add after removing all");
        ringList.add(50);
        System.out.println("Expected: [50]");
        System.out.println("Actual: " + ringList);
    }
}

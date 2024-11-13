package defaultPackages;


public class MainClass {
    
    public static void main(String[] args) {
        testConstructors();
        testClone();
        testIsSameTime();
        testSetTime();
        testTick();
        testIsNextDay();
        testGetTimeUntilMidnight();
        testGetTimeDifference();
        testCalculateTimeIfDuringTheSameDay();
    }

    public static void testConstructors() {
        // Default constructor
        Time t1 = new Time();
        System.out.println("Default Constructor: " + 
            "Expected 0:0:0, Actual " + t1.getHours() + ":" + t1.getMinutes() + ":" + t1.getSeconds());
        
        // Hours only constructor
        Time t2 = new Time(10);
        System.out.println("Hours Only Constructor: " + 
            "Expected 10:0:0, Actual " + t2.getHours() + ":" + t2.getMinutes() + ":" + t2.getSeconds());
        
        // Hours and minutes constructor
        Time t3 = new Time(10, 30);
        System.out.println("Hours and Minutes Constructor: " + 
            "Expected 10:30:0, Actual " + t3.getHours() + ":" + t3.getMinutes() + ":" + t3.getSeconds());
        
        // Full constructor
        Time t4 = new Time(10, 30, 45);
        System.out.println("Full Constructor: " + 
            "Expected 10:30:45, Actual " + t4.getHours() + ":" + t4.getMinutes() + ":" + t4.getSeconds());
    }

    public static void testClone() {
        Time original = new Time(12, 30, 45);
        Time cloned = original.clone();
        
        System.out.println("Cloning: " + 
            "Original: " + original.getHours() + ":" + original.getMinutes() + ":" + original.getSeconds() +
            ", Cloned: " + cloned.getHours() + ":" + cloned.getMinutes() + ":" + cloned.getSeconds());

        cloned.setHours(11);
        System.out.println("Cloned after modification: " + cloned.getHours() + 
            " (Expected different from Original: " + original.getHours() + ")");
    }

    public static void testIsSameTime() {
        Time t1 = new Time(12, 30, 45);
        Time t2 = new Time(12, 30, 45);
        Time t3 = new Time(12, 30, 46);
        
        System.out.println("Is Same Time (True): " + t1.isSameTime(t2));
        System.out.println("Is Same Time (False): " + t1.isSameTime(t3));
    }

    public static void testSetTime() {
        Time t1 = new Time(12, 30, 45);
        Time t2 = new Time(10, 20, 30);
        
        t1.setTime(t2);
        System.out.println("Set Time: Expected 10:20:30, Actual " + 
            t1.getHours() + ":" + t1.getMinutes() + ":" + t1.getSeconds());
    }

    public static void testTick() {
        Time t1 = new Time(12, 30, 45);
        t1.tick();
        System.out.println("Tick Normal: Expected 12:30:46, Actual " + 
            t1.getHours() + ":" + t1.getMinutes() + ":" + t1.getSeconds());

        Time t2 = new Time(12, 30, 59);
        t2.tick();
        System.out.println("Tick Second Rollover: Expected 12:31:0, Actual " + 
            t2.getHours() + ":" + t2.getMinutes() + ":" + t2.getSeconds());

        Time t3 = new Time(12, 59, 59);
        t3.tick();
        System.out.println("Tick Minute Rollover: Expected 13:0:0, Actual " + 
            t3.getHours() + ":" + t3.getMinutes() + ":" + t3.getSeconds());

        Time t4 = new Time(23, 59, 59);
        t4.tick();
        System.out.println("Tick Day Rollover: Expected 0:0:0, Actual " + 
            t4.getHours() + ":" + t4.getMinutes() + ":" + t4.getSeconds());
    }

    public static void testIsNextDay() {
        Time t1 = new Time(23, 0, 0);
        Time t2 = new Time(0, 0, 0);
        System.out.println("Is Next Day (True): " + t1.isNextDay(t2));

        Time t7 = new Time(12, 30, 0);
        Time t8 = new Time(13, 30, 0);
        System.out.println("Is Next Day (False): " + t7.isNextDay(t8));
    }

    public static void testGetTimeUntilMidnight() {
        Time t1 = new Time(22, 30, 30);
        Time result1 = t1.getTimeUntilMidNight();
        System.out.println("Time Until Midnight: Expected 1:29:30, Actual " + 
            result1.getHours() + ":" + result1.getMinutes() + ":" + result1.getSeconds());
    }

    public static void testGetTimeDifference() {
        Time t1 = new Time(10, 30, 0);
        Time t2 = new Time(12, 45, 30);
        Time diff1 = t1.getTimeDifference(t2);
        System.out.println("Time Difference: Expected 2:15:30, Actual " + 
            diff1.getHours() + ":" + diff1.getMinutes() + ":" + diff1.getSeconds());
    }

    public static void testCalculateTimeIfDuringTheSameDay() {
        Time t1 = new Time(10, 30, 45);
        Time t2 = new Time(12, 45, 30);
        Time result = t1.calculateTimeIfDuringTheSameDay(t2);
        System.out.println("Calculate Time Same Day: Expected 2:14:45, Actual " + 
            result.getHours() + ":" + result.getMinutes() + ":" + result.getSeconds());
    }
}

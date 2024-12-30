package none;

import java.lang.reflect.*;

public class ReflectionExample {
    public static void main(String[] args) {
        try {
            // Dynamically load a class by its name
            String className = "java.util.ArrayList";
            Class<?> classReference = Class.forName(className);

            // Inspect the class: Display its name
            System.out.println("Class Name: " + classReference.getName());

            // Inspect the class: List all methods
            Method[] methods = classReference.getDeclaredMethods();
            System.out.println("\nMethods:");
            for (Method method : methods) {
                System.out.println(" - " + method.getName());
            }

            // Instantiate an object of the class dynamically (works only if there's a no-arg constructor)
            Object instance = classReference.getDeclaredConstructor().newInstance();
            System.out.println("\nInstance created: " + instance);

            // Use reflection to call a method (e.g., `add` on ArrayList)
            if (instance instanceof java.util.List) {
                Method addMethod = classReference.getMethod("add", Object.class);
                addMethod.invoke(instance, "Hello Reflection!");
                System.out.println("After add: " + instance);
                addMethod.invoke(instance, 321);
                System.out.println("After add: " + instance);
            }

        } catch (ClassNotFoundException e) {
            System.err.println("Class not found: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

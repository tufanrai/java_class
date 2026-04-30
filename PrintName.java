

public class PrintName {

    public static void main(String[] args) {
        // Check if an argument was provided
        if (args.length > 0) {
            // The first argument is the user's name
            String userName = args[0];
            System.out.println("Hello, " + userName + "! Thank you for running the application.");
        } else {
            System.out.println("Error: Please provide a name as a command-line argument.");
            System.out.println("Usage: java CommandLineNameApp \"John Doe\"");
        }
    }
}

// How to run this:
// Compile: javac CommandLineNameApp.java
// Run: java CommandLineNameApp "Alice Smith"

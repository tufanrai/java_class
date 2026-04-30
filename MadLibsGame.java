
import java.util.Scanner;

public class MadLibsGame {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            String adjective1;
            String noun1;
            String adjective2;
            String verb;
            String adjective3;

            System.out.print("Enter an adjective (description)");
            adjective1 = scanner.next();
            System.out.print("Enter a noun (animal or person)");
            noun1 = scanner.next();
            System.out.print("Enter an adjective (description)");
            adjective2 = scanner.next();
            System.out.print("Enter a verb end with -ing (action)");
            verb = scanner.next();
            System.out.print("Enter an adjective (description)");
            adjective3 = scanner.next();

            System.out.println("\nToday, I went to a " + adjective1 + " zoo.");
            System.out.println("In an exhibit, I saw a " + noun1 + ".");
            System.out.println(noun1 + " was " + adjective2 + " and " + verb + "!");
            System.out.println("I was " + adjective3 + "!");

            scanner.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


import java.util.Scanner;

public class Example4 {

    public static void main(String[] args) {
        float pi = 3.14f;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the radious of the circle ");
            float radious = scanner.nextFloat();

            float perimeter = 2 * pi * radious;

            System.out.println("The perimeter of the circle is " + perimeter);

            scanner.close();
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}

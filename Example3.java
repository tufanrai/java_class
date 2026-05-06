
import java.util.Scanner;

public class Example3 {

    public static void main(String[] args) {
        float pi = 3.14f;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the radious of the circle ");
            float radious = scanner.nextFloat();

            float area = pi * radious * radious;

            System.out.println("The area of the circle is " + area);

            scanner.close();
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}

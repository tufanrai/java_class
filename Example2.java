
import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the height of the triangle ");
            float height = scanner.nextFloat();

            System.out.print("Enter the breadth of the triangle ");
            float breadth = scanner.nextFloat();

            float areaOfTriangle = 0.5f * breadth * height;

            System.out.println("The area of a triangle is : " + areaOfTriangle);

            scanner.close();
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}

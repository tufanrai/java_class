
import java.util.Scanner;

public class ShoppingCart {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String itemName;
            byte price;
            byte quantity;
            short total;

            System.out.print("Enter the name of the food Item: ");
            itemName = scanner.next();

            price = switch (itemName) {
                case "pizza" ->
                    120;

                case "burger" ->
                    100;

                case "momo" ->
                    120;

                case "Coffee" ->
                    127;

                default ->
                    0;
            };

            System.out.print("Enter the quantity of the food item: ");
            quantity = scanner.nextByte();

            total = (short) (price * quantity);

            System.out.println("\nitem: " + itemName + "\nprice: " + price + "\nquantity " + quantity + "\ntotal: " + total);

            scanner.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

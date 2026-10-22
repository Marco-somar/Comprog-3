import java.util.Scanner;
/**
 *
 * @author HUAWEI
 */
public class WarehouseInventoryScanner {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int[][] werh = { //gagawin ko nlng "werh" yung "warehouse"
            // "warehouse" is turned into "werh" for shortcut purposes (please note that this will not affect the output)
            {9, 5, 16},
            {3, -1, 28},
            {7, 2, 17}
        };

        int choice;

        do {
            System.out.println("----WAREHOUSE INVENTORY MENU----\n");
            System.out.println("1. View Total Inventory");
            System.out.println("2. Find Low Stock Shelf");
            System.out.println("3. Restock Shelf");
            System.out.println("4. Exit");

            System.out.print("\nEnter choice: ");
            choice = readInt(sc);

            if (choice == 1) {
                int total = 0;

                for (int i = 0; i < werh.length; i++) {
                    for (int j = 0; j < werh[i].length; j++) {
                        if (werh[i][j] == -1) {
                            continue;
                        }

                        total += werh[i][j];
                    }
                }

                System.out.println("Total Inventory: " + total);

            } else if (choice == 2) {
                boolean found = false;

                for (int i = 0; i < werh.length; i++) {
                    for (int j = 0; j < werh[i].length; j++) {
                        if (werh[i][j] == -1) {
                            continue;
                        }

                        if (werh[i][j] <= 3) {
                            System.out.println("Low Stock Found!");
                            System.out.println("Row: " + (i + 1));
                            System.out.println("Column: " + (j + 1));
                            System.out.println("Items: " + werh[i][j]);

                            found = true;
                            break;
                        }
                    }

                    if (found) {
                        break;
                    }
                }

                if (!found) {
                    System.out.println("No critically low shelves found.");
                }

            } else if (choice == 3) {
                restock(werh, sc);

            } else if (choice == 4) {
                System.out.println("Exiting Inventory System...");

            } else {
                System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);
    }

    public static void restock(int[][] werh, Scanner sc) { // werh = warehouse
        int row;
        int column;

        while (true) {
            System.out.print("Enter row (1-" + werh.length + "): ");
            row = readInt(sc);

            System.out.print("Enter column (1-" + werh[0].length + "): ");
            column = readInt(sc);

            if (row < 1 || row > werh.length
                    || column < 1 || column > werh[0].length) {
                System.out.println("Invalid shelf location. Try again.");
                continue;
            }

            if (werh[row - 1][column - 1] == -1) {
                System.out.println("Cannot restock a damaged shelf. Try again.");
                continue;
            }

            break;
        }

        int amount;

        while (true) {
            System.out.print("Enter quantity to add: ");
            amount = readInt(sc);

            if (amount <= 0) {
                System.out.println("Quantity must be greater than zero.");
                continue;
            }

            break;
        }

        werh[row - 1][column - 1] += amount;

        System.out.println("Restocking Successful!");
        System.out.println("Updated Shelf Quantity: " + werh[row - 1][column - 1]);

        return;
    }

    public static int readInt(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.print("Invalid input. Enter a whole number: ");
            sc.next();
        }

        return sc.nextInt();
    }
    
}

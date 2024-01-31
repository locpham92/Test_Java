package menu;
import manage.ManageProduct;
import java.util.Scanner;

public class MenuProduct {
    static Scanner scanner = new Scanner(System.in);
    static ManageProduct manageProduct = new ManageProduct();

    public static void menu() {
        while (true) {
            System.out.println("Product Management:");
            System.out.println("1. Display all products");
            System.out.println("2. Add a new product");
            System.out.println("3. Edit a product");
            System.out.println("4. Delete a product");
            System.out.println("5. Sorting");
            System.out.println("6. Find the max price product");
            System.out.println("7. Read from file");
            System.out.println("8. Write the file");
            System.out.println("9. Exit");
            int choice = 0;
            while (true) {
                try {
                    System.out.println("Please choose a function: ");
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (Exception e) {
                    e.getStackTrace();
                }
            }

            switch (choice) {
                case 1:
                    manageProduct.display();
                    break;
                case 2:
                    menuAdd();
                    break;
                case 3:
                    manageProduct.edit();
                    break;
                case 4:
                    manageProduct.delete();
                    break;
                case 5:
                    menuSort();
                    break;
                case 6:
                    System.out.println(manageProduct.findProductMaxPrice());
                    break;
                case 7:
                    manageProduct.read();
                    break;
                case 8:
                    manageProduct.write();
                    break;
                case 9:
                    return;
            }

        }

    }
    public static void menuAdd() {
        manageProduct.add(manageProduct.create());
    }
    public static void menuSort() {
        while (true) {
            System.out.println("Do you want to sort by price ascending or descending");
            System.out.println("1. Ascending");
            System.out.println("2. Descending");
            System.out.println("3. Exit");
            int choice = 0;
            while (true) {
                try {
                    System.out.println("Please choose a function: ");
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (Exception e) {
                    e.getStackTrace();
                }
            }

            switch (choice) {
                case 1:
                    manageProduct.sortAscending();
                    break;
                case 2:
                    manageProduct.sortDescending();
                    break;
                case 3:
                    return;
            }
        }
    }
}
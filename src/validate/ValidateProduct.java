package validate;

import model.Product;

import java.util.List;
import java.util.Scanner;

public class ValidateProduct {
    static Scanner scanner = new Scanner(System.in);
    public static String vName(List<Product> products) {
        while (true) {
            boolean check=true;
            System.out.println("Input name: ");
            String name = scanner.nextLine();
            for (Product p : products) {
                if (p.getName().equals(name)) {
                    System.out.println("Duplicate!");
                    check=false;
                    break;
                }
            }
            if (check) {
                return name;
            }
        }
    }
    public static int vId() {
        while (true) {
            try {
                System.out.println("Input Id: ");
                int Id = scanner.nextInt();
                scanner.nextLine();
                return Id;
            } catch (Exception e) {
                scanner.nextLine();
                e.printStackTrace();
                System.out.println("Wrong!");
            }
        }
    }
    public static double vPrice() {
        while (true) {
            try {
                System.out.println("Input price: ");
                Double price=scanner.nextDouble();
                scanner.nextLine();
                return price;
            } catch (Exception e) {
                scanner.nextLine();
                e.getStackTrace();
                System.out.println("Wrong!");
            }
        }
    }
    public static int vQuantity() {
        while (true) {
            try {
                System.out.println("Input quantity: ");
                int quantity = scanner.nextInt();
                scanner.nextLine();
                return quantity;
            } catch (Exception e) {
                scanner.nextLine();
                e.printStackTrace();
                System.out.println("Wrong!");
            }
        }
    }
    public static String vContent() {
        while (true) {
            try {
                System.out.println("Input content: ");
                String content = scanner.nextLine();
                return content;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Wrong!");
            }
        }
    }
}

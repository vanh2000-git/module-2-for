import java.util.Scanner;

public class ShapePrinters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (corner is square at 4 different angles)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    printRectangle();
                    break;
                case 2:
                    printSquareTriangle();
                    break;
                case 3:
                    printIsoscelesTriangle();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void printRectangle() {
        int length = 4;
        int width = 7;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void printSquareTriangle() {
        System.out.println("1. Bottom-left triangle:");
        printBottomLeftTriangle();
        System.out.println("2. Top-left triangle:");
        printTopLeftTriangle();
        System.out.println("3. Bottom-right triangle:");
        printBottomRightTriangle();
        System.out.println("4. Top-right triangle:");
        printTopRightTriangle();
    }


    public static void printBottomLeftTriangle() {
        int height = 5;
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void printTopLeftTriangle() {
        int height = 5;
        for (int i = height; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void printBottomRightTriangle() {
        int height = 5;
        for (int i = 1; i <= height; i++) {
            for (int j = i; j < height; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void printTopRightTriangle() {
        int height = 5;
        for (int i = height; i >= 1; i--) {
            for (int j = i; j < height; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void printIsoscelesTriangle() {
        int height = 5;
        for (int i = 1; i <= height; i++) {
            for (int j = i; j < height; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

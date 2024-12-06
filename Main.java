import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Enter a number:");
//            int number = scanner.nextInt();
//            if (number < 2){
//                System.out.println(number + " is not a prime");
//            } else {
//                int i = 2;
//                boolean check = true;
//                while (i <= Math.sqrt(number)) {
//                    if (number % i == 0) {
//                        check = false;
//                        break;
//                    }
//                    i++;
//                }
//                if (check)
//                    System.out.println(number + " is a prime");
//                else
//                    System.out.println(number + " is not a prime");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số cần kiểm tra:");
        int n = scanner.nextInt();
        if (n < 2) {
            System.out.println("Không phải số nguyên tố");
        } else {
            boolean check = true;
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println("Là số nguyên tố");
            } else {
                System.out.println("Không phải số nguyên tố");
            }
        }
    }

}

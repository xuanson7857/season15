package bt.bt1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        try {
            System.out.print("Nhập số nguyên thứ nhất: ");
            int num1 = scanner.nextInt();

            System.out.print("Nhập số nguyên thứ hai: ");
            int num2 = scanner.nextInt();

            sum = num1 + num2;

            System.out.println("Tổng của " + num1 + " và " + num2 + " là: " + sum);
        } catch (InputMismatchException e) {
            System.out.println("Lỗi: Bạn đã nhập không phải số nguyên. Vui lòng nhập lại.");
            scanner.nextLine();
            main(args);
        } finally {
            scanner.close();
        }
    }
}

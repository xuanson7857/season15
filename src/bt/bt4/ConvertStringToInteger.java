package bt.bt4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConvertStringToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi cần chuyển đổi: ");
        String input = scanner.nextLine();

        List<Integer> integers = new ArrayList<>();
        int total = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            try {
                int number = Integer.parseInt(String.valueOf(c));
                integers.add(number);
                total += number;
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Ký tự '" + c + "' không phải số nguyên.");
                integers.add(0);
            }
        }

        System.out.println("Danh sách số nguyên từ chuỗi: " + integers);
        System.out.println("Tổng các số nguyên: " + total);
    }
}

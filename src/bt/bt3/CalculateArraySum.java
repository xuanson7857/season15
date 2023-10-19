package bt.bt3;

public class CalculateArraySum {
    public static void main(String[] args) {
        Object[] arr = {1, 2, 3, "four", 5};
        int sum = calculateSum(arr);
        System.out.println("Tổng của các số nguyên trong mảng là: " + sum);
    }

    public static int calculateSum(Object[] arr) {
        int sum = 0;
        for (Object element : arr) {
            try {
                if (element instanceof Integer) {
                    sum += (Integer) element;
                }
            } catch (Exception e) {
                System.out.println("Lỗi: " + element + " không phải số nguyên. Sẽ bỏ qua.");
            }
        }
        return sum;
    }
}

package bt.bt2;

public class FindMaxInArray {
    public static void main(String[] args) {
        int[] arr = {5, 10, 3, 7, 2};
        try {
            int max = findMax(arr);
            System.out.println("Số lớn nhất trong mảng là: " + max);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int findMax(int[] arr) throws Exception {
        if (arr.length == 0) {
            throw new Exception("Mảng rỗng");
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}

public class MaxArray {
    public static void main(String[] args) {
        int[] arr = {100, 200, 300, 400, 1000};
        System.out.println(max(arr));
    }

    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
// Maxx Array

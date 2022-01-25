public class BinarySearch {
    public static int binarySearch(int[] input, int num) {

        int n = input.length;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (num == input[mid]) {
                return mid;
            }
            if (input[mid] < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] input = {2, 4, 6, 8, 9, 11};
        int num = 4;
        int solution = binarySearch(input, num);
        System.out.println("The solution is " + solution);

        int[] input1 = {2, 4, 6, 8, 9, 11};
        int num1 = 5;
        int solution1 = binarySearch(input1, num1);
        System.out.println("The solution is " + solution1);
    }
}

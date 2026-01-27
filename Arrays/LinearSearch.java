public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 9};
        int target = 8;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Found at index " + i);
            }
        }
    }
}

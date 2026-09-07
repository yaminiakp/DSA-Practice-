public class firstlargestelement {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("The largest element is: " + largest);
    }
}

public class secondlargestelement {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        int largest = arr[0];
        int secondLargest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("The second largest element is: " + secondLargest);
    }
}

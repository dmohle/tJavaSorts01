import java.util.Random;

public class SortsBubbleandSelection {

    public static void selectionSort(int[] arr) {
        // Iterate through each position in the array (from 0 to length-2)
        for (int i = 0; i < arr.length - 1; i++) {
            // Assume the smallest element is at current index
            int smallestIndex = i;

            // Find the index of the smallest element in the unsorted part of the array
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallestIndex]) {
                    smallestIndex = j;
                }
            }

            // Swap the found smallest element with the element at 'i' if they are not the same
            if (smallestIndex != i) {
                int temp = arr[i];
                arr[i] = arr[smallestIndex];
                arr[smallestIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        // Generate an array of a thousand random numbers
        Random rand = new Random();
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10000);  // generate numbers between 0 to 9999
        }

        // Display the original array
        System.out.print("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Start the timer
        double startTime = System.nanoTime();

        // Sort the array using selection sort
        selectionSort(arr);

        // End the timer
        double endTime = System.nanoTime();
        // Time in nanoseconds
        double duration = (endTime - startTime);
        double displaySeconds = duration/1000000;

        System.out.println("\n\n the sort took " + displaySeconds + " seconds!\n\n");

        // Display the sorted array
        System.out.print("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Display the duration
        System.out.println("Time taken for sorting: " + duration + " nanoseconds");
    }
}

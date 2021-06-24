
public class Bubblesort {
        public static void bubbleSort(int[] arr) {
                int n = arr.length;
                int temp = 0;
                for (int i = 0; i < n; i++) {
                        for (int j = 1; j < (n - i); j++) {
                                if (arr[j - 1] > arr[j]) {
                                        temp = arr[j - 1];
                                        arr[j - 1] = arr[j];
                                        arr[j] = temp;
                                }

                        }
                }

        }

        public static void main(String args[]) {
                int arr[] = { 14, 36, 45, 29, 6, 8, 3, 13 };

                System.out.println("\nArray Before Bubble Sort\n");
                for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + " ");
                }
                System.out.println();

                bubbleSort(arr);

                System.out.println("\nArray After Bubble Sort\n");
                for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + " ");
                }

        }
}

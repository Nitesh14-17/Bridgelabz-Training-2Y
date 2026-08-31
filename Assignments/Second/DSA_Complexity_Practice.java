public class DSA_Complexity_Practice {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {8, 61, 2, 3, 4, 0};
        int[] sorted = {0, 2, 3, 4, 8, 61};

        System.out.println("Linear Search: " + linearSearch(arr, 8));
        System.out.println("Binary Search: " + binarySearch(sorted, 4));

        int[] sortArr = {8, 61, 2, 3, 4, 0};
        mergeSort(sortArr, 0, sortArr.length - 1);
        System.out.println("Merge Sort: ");
        for (int x : sortArr) {
            System.out.print(x + " ");
        }
    }
}

/*
TC-1: Linear Search Time Complexity
1. Best Case: O(1). If the target is at the first position, like 8, the search stops after one comparison.
2. Worst Case: O(n). If the target is 0 or not present, the algorithm may check every element in the array.
3. Average Case: O(n). For a random target position, about half the array is checked on average, so the complexity is still linear.

TC-2: Iterative Binary Search Complexity
Sorted array: {0, 2, 3, 4, 8, 61}
Target: 4
Step 1: low=0, high=5, mid=2, arr[2]=3 -> move right
Step 2: low=3, high=5, mid=4, arr[4]=8 -> move left
Step 3: low=3, high=3, mid=3, arr[3]=4 -> found
Worst-case steps: T(N) = T(N/2) + 1
This solves to T(N) = O(log N)

TC-3: Merge Sort Time Complexity
For the array {8, 61, 2, 3, 4, 0}:

At each level the total work is O(n), and there are log2(n) levels.
Recurrence: T(n) = 2T(n/2) + n
Solution: T(n) = O(n log n)

SC-1: Linear Search Space Complexity
The iterative linear search does not use extra memory proportional to input size. It only uses a few loop variables.
Auxiliary space complexity = O(1)

SC-2: Binary Search Space Complexity
Iterative binary search uses only low, high, and mid indices. No extra array is created.
Auxiliary space complexity = O(1)

SC-3: Merge Sort Space Complexity
Merge sort creates temporary arrays while merging two sorted halves. This extra memory grows with the size of the array.
Auxiliary space complexity = O(n)
Compared with in-place sorting algorithms like Insertion Sort or Quick Sort, Merge Sort uses more extra memory and is less space efficient.
*/

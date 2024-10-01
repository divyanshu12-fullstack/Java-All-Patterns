package Patterns;

public class UpperLowerbound {
    public static void main(String[] args) {
        int[] A = { 1, 2, 2, 2, 2, 3, 3, 3, 4 };
        System.out.println(Lowerbound(A, 2));
        System.out.println(Upperbound(A, 2));
    }

    public static int Lowerbound(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int mid;
        int LowestIndex = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == target) {
                LowestIndex = mid;
                high = mid - 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return LowestIndex;
    }

    public static int Upperbound(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int mid;
        int LowestIndex = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == target) {
                LowestIndex = mid;
                low = mid + 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return LowestIndex;
    }
}

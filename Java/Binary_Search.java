public class Binary_Search {

    
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; 

            
            if (arr[mid] == target) {
                return mid; 
            }

            
            if (arr[mid] < target) {
                left = mid + 1;
            } 
            
            else {
                right = mid - 1;
            }
        }

        
        return -1;
    }

    public static void main(String[] args) {
        int[] sortedArray = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int target = 14;

        int result = binarySearch(sortedArray, target);

        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}


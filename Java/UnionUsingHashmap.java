import java.util.*;

public class UnionUsingHashmap {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 4, 7, 9, 3, 4, 2};
        int[] arr2 = {1, 4, 3, 8, 12, 5, 1, 3, 7};

        Map<Integer, Boolean> uniqueElements = new HashMap<>();
        
        for (int num : arr1) {
            uniqueElements.put(num, true);
        }

        for (int num : arr2) {
            uniqueElements.put(num, true);
        }
        List<Integer> unionList = new ArrayList<>(uniqueElements.keySet());

        Collections.sort(unionList);

        System.out.println("Union of arr1 and arr2: " + unionList);
    }
}

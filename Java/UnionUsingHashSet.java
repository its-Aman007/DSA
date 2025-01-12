import java.util.*;

public class UnionUsingHashSet {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 4, 7, 9, 3, 4, 2};
        int[] arr2 = {1, 4, 3, 8, 12, 5, 1, 3, 7};

        Set<Integer> unionSet = new HashSet<>();

        for (int num : arr1) {
            unionSet.add(num);
        }

        for (int num : arr2) {
            unionSet.add(num);
        }
        Integer[] unionArray = unionSet.toArray(new Integer[0]);

        Arrays.sort(unionArray);

        System.out.println("Union of arr1 and arr2: " + Arrays.toString(unionArray));
    }
}


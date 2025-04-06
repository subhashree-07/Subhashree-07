import java.util.*;

public class ArrayIntersection {
    public static List<Integer> intersection(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (int num : arr1) {
            set1.add(num);
        }

        for (int num : arr2) {
            if (set1.contains(num)) {
                result.add(num);
                set1.remove(num); 
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {45,58,47,68,58};
        int[] arr2 = {56,85,74,68,87};
        System.out.println(intersection(arr1, arr2));
    }
}

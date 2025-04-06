import java.util.ArrayList;
import java.util.List;

public class QuadraticComplexity {
    public static List<String> findPairs(int[] arr, int target) {
        List<String> pairs = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    pairs.add("(" + arr[i] + ", " + arr[j] + ")");
                }
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 4, 7};
        List<String> result = findPairs(arr, 5);
        System.out.println(result); 
    }
}
import java.util.Arrays;

public class DeleteElement {
    public static int[] delete(int[] arr, int index) {
        if (index < 0 || index >= arr.length) return arr;

        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        int[] result = delete(arr, 2);
        System.out.println(Arrays.toString(result));
    }
}

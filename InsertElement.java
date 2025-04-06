import java.util.Arrays;

public class InsertElement {
    public static int[] insert(int[] arr, int element, int position) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }
        newArr[position] = element;
        for (int i = position; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,6};
        int[] result = insert(arr,1,2);
        System.out.println(Arrays.toString(result));
    }
}

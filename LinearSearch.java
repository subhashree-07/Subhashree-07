public class LinearSearch {
    public static int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return 1;
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] arr = {5,10,15,40};
        int index = search(arr,15);
        System.out.println(index);
    }
}

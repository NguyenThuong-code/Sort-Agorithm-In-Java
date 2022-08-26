package insertion;

public class Test {
    public static void main(String[] args) {
        int[] arr= {5,8,3,9,2};
        insertionSort(arr);
    }

    private static void insertionSort(int[] arr) {
        int min = arr[0];
        for (int i=0; i< arr.length; i++){
            if (min< arr[i]){
                arr[0]= min;
            }

        }
    }
}

package insertion;

public class InsertionSort{
public static void insertionSort(int arr[]){
    int n= arr.length;
    for (int j =1; j<n; j++){
        int key=arr[j];
        int i = j-1;
        while ((i>-1)&& (arr[i]>key)){
            arr[i+1]= arr[i];
            i--;
        }
        arr[i+1]= key;
    }
}

    public static void main(String[] args) {
        int[] arr={4,6,3,6,2,9};
        insertionSort(arr);
        System.out.println("the array sorted:");
        for (int i :arr
             ) {
            System.out.println(i+ " ");
        }
    }

}

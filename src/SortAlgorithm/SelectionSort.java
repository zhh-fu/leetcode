package SortAlgorithm;

public class SelectionSort extends SortAlgorithm{
    @Override
    public void sort(int[] arr){
        int length = arr.length;
        int min;
        for (int i=0;i<length-1;i++){
            min = i;
            for (int j=i+1;j<length;j++){
                if (arr[j]<arr[min]){
                    min = j;
                }
            }
            swap(arr,i,min);
        }
    }
}

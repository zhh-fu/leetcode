package BasicAlgorithm.SortAlgorithm;

public class QuickSort extends SortAlgorithm{
    @Override
    public void sort(int[] num) {

    }
    public int divide(int[] num,int l,int h){
        int length = num.length;
        int v = num[l];
        int i=l,j=h+1;
        while (num[i]<v&&i!=h){
            i++;
        }
        while (num[j-1]>v&&j!=l){
            j--;
        }
         {
            swap(num,i,j-1);
        }

        return i;
    }
}

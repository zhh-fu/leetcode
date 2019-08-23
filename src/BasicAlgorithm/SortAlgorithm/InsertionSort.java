package BasicAlgorithm.SortAlgorithm;

public class InsertionSort extends SortAlgorithm {
    /**
     * 插入排序的精髓在于将右侧的元素j插入左侧的有序子数组，使返回的长度加一的数组仍然有序。
     * 插入的元素是第i位元素，因此j=i
     * 排序操作从最左侧开始，令第j个元素与左侧的元素依次比较交换，因此是j--和j-1
     * @param num 待排序数组
     */
    @Override
    public void sort(int[] num) {
        int length =num.length;
        for (int i=1;i<length;i++){
            for (int j=i;j>0;j--){
                if (num[j]<num[j-1]){
                    swap(num,j,j-1);
                }
            }
        }
    }
}

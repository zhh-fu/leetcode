package BasicAlgorithm.SortAlgorithm;

public abstract class SortAlgorithm {

    /**
     * 数组交换不能直接采用两个值互换的方式，这样实际上两者并未发生变化
     * @param num 用于交换的数组
     * @param i   i,j为用于交换的数组元素的下标
     */
    public void swap(int[] num,int i,int j){
        int tmp;
        tmp = num[i];
        num[i] = num[j];
        num[j] = tmp;
    }
    public abstract void sort(int[] num);
}

package BasicAlgorithm.SortAlgorithm;

public class ShellSort extends SortAlgorithm {
    /**
     * 希尔排序是选择排序的升级版
     * 不同于选择排序，希尔排序是对间隔为h的元素进行排序，使其大体有序
     * 然后对选择间隔不断进行减小，最终为1时再排序。
     * 我的方法与网上方法有明显不同，不知道孰优孰劣。
     * @param num 待排序数组
     */
    @Override
    public void sort(int[] num) {
        int length = num.length;
        int h=1;
        while(h<length/3){
            h = 3*h+1;
        }
        while (h>=1){
            for (int i=length-1;i-h>=0;i--){
                if (num[i]<num[i-h]){
                    swap(num, i,i-h);
                }
            }
            h = h-1;
        }
    }
}

package SortAlgorithm;

public class BulubulubuluSort extends SortAlgorithm {
    /**
     * 冒泡排序共N趟，原理是通过不断的比较交换让最大的数处于数组的最右侧
     * 第一趟从0到N-1，第二趟从0到N-2，因为最后的数字是最大的。
     * @param num 待排序的数组
     */
    @Override
    public void sort(int[] num) {
        int length = num.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length-i-1; j++) {
                if (num[j] > num[j+1]) {
                    swap(num, j, j+1);
                }
            }
        }
    }
}

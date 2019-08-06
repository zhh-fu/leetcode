package ThreeSumAlgorithm;

public class ThreeSum {
    /**
     * 第一次手敲代码，错的很离谱
     * 考虑一下极限情况也不会出现这种错误
     * 脑子不清醒，很长时间没有手敲代码了
     * 因为处于同一个数组中，且数组元素不能重复所以索引不能一样
     * 同时边界条件决定了必然会出现下标分别是length-3、length-2、length-1情况
    public int count(int[] array){
        int count = 0;
        int length = array.length;
        for (int i=0;i<length;i++){
            for (int j=0;j<length-i;j++){
                for (int k=0;k<length-j;k++){
                    if (array[i]+array[j]+array[k]==0){
                        count++;
                    }
                }
            }
        }
        return count;
    }
     */
    public int count(int[] array){
        int count = 0;
        int length = array.length;
        for (int i=0;i<length;i++){
            for (int j=i+1;j<length;j++){
                for (int k=j+1;k<length;k++){
                    if (array[i]+array[j]+array[k]==0){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}

package BasicAlgorithm;

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

    /**
     * 该算法有问题。
     * 题设要求是三个不同的数字，但是在使用该算法的时候，将因为没有传进来索引值，会遍历所有数据，使其重新计算值。
     * 这样会导致某个值使用了两次，造成错误。
     */
    public int countBinarySearch(int[] ary,int target) {
        /*
        int realtarget = -target;
        int length = ary.length;
        int low = 1;
        int high = length - 1;
        boolean bool = false;
        while (low != (high-1)) {
            int mid = (high + low) / 2;
            if (ary[mid] == realtarget) {
                bool = true;
                break;
            } else if (ary[mid] > realtarget) {
                high = mid;
            } else if (ary[mid] < realtarget) {
                low = mid;
            }
            else
                bool = false;
        }
        */
        int l = 0, h = ary.length - 1;
        while (l <= h) {
            int m = l + (h - l) / 2;
            if (target == ary[m]) {
                return m;
            } else if (target > ary[m]) {
                l = m + 1;
            } else {
                h = m - 1;
            }
        }
        return -1;
    }

    public int sumTwoPoint(int[] ary){
        int N = ary.length;
        int count=0;
        for (int i=0;i<N-2;i++){
            int low = i+1, high = N-1, target = -ary[i];
            while (low < high){
                if (ary[low] + ary[high] == target){
                    count++;
                    low++;
                    high--;
                }
                else if (ary[low] + ary[high] > target){
                    high--;
                }
                else low++;
            }
        }
        return count;
    }

}

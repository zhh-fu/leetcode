package MajorAtProblemTest;


import ThreeSumAlgorithm.ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test1 {
    public static void main(String[] args) {
        int array[] = {1,2,3,-4,45,9,23,123,-132,-46,78};
        long starttime =  System.currentTimeMillis();
        ThreeSum testSum = new ThreeSum();
        int num = testSum.count(array);
        System.out.println(num);
        Arrays.sort(array);
        System.out.println(array);
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        long endtime = System.currentTimeMillis();
        System.out.println(endtime-starttime);

        ArrayList<Integer> list = new ArrayList<>();
        initIntArray(list);
        System.out.println(list);
        list.sort((i1,i2)->i1-i2);
        System.out.println(list);
    }
    public static void initIntArray(List list1) {
        for (int i = 0; i < 10; i++) {
            list1.add((int)(100 * Math.random() / 1));
        }
    }

}

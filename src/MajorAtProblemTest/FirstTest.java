package MajorAtProblemTest;


import BasicAlgorithm.ThreeSum;

import java.util.Arrays;

public class FirstTest {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, -4, -5};
        int length = array.length;
        int count;
        long starttime = System.currentTimeMillis();
        Arrays.sort(array);
        ThreeSum testSum = new ThreeSum();
        /*
        for (int i = 0; i < length; i++) {
            for (int j = i+1; j < length; j++) {
                int target = -(array[i] + array[j]);
                int index=testSum.countBinarySearch(array, target);
                if (index>j)
                {
                    count++;
                }
                //if (testSum.countBinarySearch(array, target)) count++;
            }
        }
        */
        count=testSum.sumTwoPoint(array);
        System.out.println(count);
        /*
        int num = testSum.count(array);
        System.out.println(num);

        System.out.println(array);
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }


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
    */
        long endtime = System.currentTimeMillis();
        System.out.println((endtime - starttime)/1000.0000);

    }
}

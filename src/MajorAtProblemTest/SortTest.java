package MajorAtProblemTest;

import BasicAlgorithm.SortAlgorithm.ShellSort;
import LeetCode.Solution;

import java.util.Arrays;

public class SortTest {
    public static void main(String[] args){
        int[] arr = {45,34,56,39,45,5,67,87,25,7};
        int[] test = {3,2,4};
        //Arrays.sort(test);
        //new SelectionSort().sort(arr);
        //new BulubulubuluSort().sort(arr);
        //new InsertionSort().sort(arr);
        //new ShellSort().sort(arr);
        //int[] answer = new TwoSum().twoSum(test,6);
        int[] answer = new Solution().anotherTwoSum(test,6);
        for (int after:answer) {
            System.out.println(after);
        }
    }
}

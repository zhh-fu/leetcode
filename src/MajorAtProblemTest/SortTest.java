package MajorAtProblemTest;

import SortAlgorithm.BulubulubuluSort;
import SortAlgorithm.InsertionSort;
import SortAlgorithm.SelectionSort;
import SortAlgorithm.ShellSort;

public class SortTest {
    public static void main(String[] args){
        int[] arr = {45,34,56,39,45,5,67,87,25,7};
        //new SelectionSort().sort(arr);
        //new BulubulubuluSort().sort(arr);
        //new InsertionSort().sort(arr);
        new ShellSort().sort(arr);
        for (int after:arr) {
            System.out.println(after);
        }
    }
}

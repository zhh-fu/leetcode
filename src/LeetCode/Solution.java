package LeetCode;

import java.util.Arrays;
import java.util.Stack;

public class Solution {
    /**
     * twoSum 找出数组中和为目标值的两个数，适用于已排序数组
     * @param nums 测试数组
     * @param target 目标值
     * @return 返回适配值的下标
     */
    public int[] twoSum(int[] nums, int target) {
        //Arrays.sort(nums);
        int i=0,j=nums.length-1;
        while(i<j){
            int sum = nums[i]+nums[j];
            if(sum == target){
                return new int[]{i,j};
            }
            else if(sum < target){
                i++;
            }
            else{
                j--;
            }
        }
        return null;
    }

    /**
     * anotherTwoSum 找出数组中和为目标值的两个数，适用于未排序数组
     * 不可自己排序，会打乱原顺序
     * @param nums 测试数组
     * @param target 目标值
     * @return 返回适配值的下标
     */
    public int[] anotherTwoSum(int[] nums,int target){
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                int sum = nums[i]+nums[j];
                if(sum == target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    /**
     * reverse 输入一个数，使其各位反转输出
     * @param target 目标值
     * @return 输出反转的数字
     */
    public int reverse(int target){
        String x = String.valueOf(target);
        int length = x.length();
        long result=0;
        if (target<0) length-=1;
        int[] nums = new int[length];
        for (int i=0;i<length;i++){
            nums[i] = target/(int) Math.pow(10,length-i-1);
            target = target - nums[i]*(int) Math.pow(10,length-i-1);
        }
        for (int i=0;i<length/2;i++){
            int tmp;
            tmp = nums[i];
            nums[i] = nums[length-1-i];
            nums[length-1-i] = tmp;
        }
        for (int i=0;i<length;i++){
            //此句会发生溢出情况，导致输出出现偏差。
            result = result + nums[i]*(long) Math.pow(10,length-i-1);
        }
        if ((result > (long) (Math.pow(2,31)-1))||(result < (long) (-Math.pow(2,31)))){
            result = 0;
        }
        //return nums;
        return (int)result;
    }

    public boolean isValid(String s){
        if (s.length()%2==1){
            return false;
        }
        if (s.equals("")){
            return true;
        }
        while (!s.equals("")){
            if (s.contains("()")){s = s.replace("()","");}
            else if (s.contains("{}")){s = s.replace("{}","");}
            else if (s.contains("[]")){s = s.replace("[]","");}
            else return false;
        }
        return true;
    }

    public boolean isValidAnother(String s){
        Stack<Character> stack = new Stack<>();
        if ((s.charAt(0)==']')||(s.charAt(0)==')')||(s.charAt(0)=='}')) return false;
        for (int i=0;i<s.length();i++){
            char sx = s.charAt(i),top = ' ';
            if ((sx == '(')||(sx == '{')||(sx == '[')){
                stack.push(sx);
                top = stack.peek();
            }
            //top = stack.peek();
            if (((top == '(') && (sx == ')'))||(top == '{'&& sx == '}')||(top == '['&& sx == ']')){
                top = stack.pop();
            }
            else return false;
        }
        if (!stack.empty()) return false;
        return true;
    }
}

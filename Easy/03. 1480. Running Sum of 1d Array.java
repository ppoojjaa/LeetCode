package com.company;

import java.util.Arrays;

public class SumOf1dArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(ArraySum(nums)));
    }

    static int[] ArraySum(int[] nums){
        int[] ans = new int[nums.length];
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            a+= nums[i];
            ans[i]= a;
            System.out.println(ans[i]);
        }

        return (ans);
    }
}

// MORE OPTIMAL
//
//public class SumOf1dArray {
//    public static void main(String[] args) {
//        int[] nums = {1,2,3,4};
//        System.out.println(Arrays.toString(ArraySum(nums)));
//    }
//
//    static int[] ArraySum(int[] nums){
//        for (int i = 1; i < nums.length; i++) {
//            nums[i] += nums[i-1];
//        }
//
//        return (nums);
//    }
//}

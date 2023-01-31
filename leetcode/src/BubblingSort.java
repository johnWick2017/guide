import java.util.Arrays;

/**
 * Create on 2023-01-07
 * Copyright (c) 2023 by XueBang Information Technology Co.Ltd.
 * All Rights Reserved, Designed By XueBangSoft
 * Copyright:  Copyright(C) 2014-2023
 * Company:    XueBang Information Technology Co.Ltd.
 *
 * @author y
 */
public class BubblingSort {

    /**
     * [2,5,3,1,4]
     * [2,5,3,1,4]
     * 冒泡排序
     *
     * @param nums
     * @return
     */
    public static int[] sort(int[] nums) {
        int[] newArr = nums.clone();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < newArr.length; j++) {
                if (nums[i] <= newArr[j]) {
                    if (j + 1 < newArr.length && newArr[j + 1] <= newArr[j]) {
                        int swap = newArr[j];
                        newArr[j] = newArr[j + 1];
                        newArr[j + 1] = swap;
                    }
                }
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(new int[]{2, 5, 3, 1, 4})));
        System.out.println(Arrays.toString(sort(new int[]{10, 8, 7, 6, 5})));
    }
}

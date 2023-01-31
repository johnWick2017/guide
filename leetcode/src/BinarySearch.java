/**
 * Create on 2023-01-10
 * Copyright (c) 2023 by XueBang Information Technology Co.Ltd.
 * All Rights Reserved, Designed By XueBangSoft
 * Copyright:  Copyright(C) 2014-2023
 * Company:    XueBang Information Technology Co.Ltd.
 *
 * @author y
 */
public class BinarySearch {

    public static int binarySearch(int[] nums, int key) {
        int edge = 0;
        int numsIndex = nums.length - 1;
        while (edge <= numsIndex) {
            int m = edge + (numsIndex - edge) / 2;
            if (nums[m] == key) {
                return m;
            } else if (nums[m] > key) {
                numsIndex = m - 1;
            } else {
                edge = m + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        binarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 1);
    }

}

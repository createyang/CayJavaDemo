package com.cay.cayjavademo.demo1;

import java.util.ArrayList;

/**
 * @author: Caoy
 * @created on: 2019/8/14 14:21
 * @description: 找出数组中重复的数字
 * <p>
 * 题目：在一个长度为n的数组里的所有数字都在0到n-1的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，
 * 也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。例如，如果输入长度为7的数组{2, 3, 1, 0, 2, 5, 3}，
 * 那么对应的输出是重复的数字2或者3。
 * <p>
 * 思路：重排数据；
 * 依次取出数组中的数，将其放入对应的索引数组位置，
 * 如果该索引位置有相同的数，说明是重复的。
 * {2, 3, 6, 0, 2, 5, 3}
 */
public class FindDuplication {
    public ArrayList<Integer> getDuplication(int[] arr) {
        ArrayList<Integer> dupList = new ArrayList<>();
        if (arr == null || arr.length <= 0) {
            System.out.println("数组输入无效！");
            return dupList;
        }

        for (int a : arr) {
            if (a < 0 || a > arr.length - 1) {
                System.out.println("数字大小超出范围！");
                return dupList;
            }
        }

        int temp;
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] != i) {
                if (arr[arr[i]] == arr[i]) {
                    dupList.add(arr[i]);
                    arr[i] = i;
                    continue ;
                } else {
                    temp = arr[i];
                    arr[i] = arr[temp];
                    arr[temp] = temp;
                }
            }
        }
        return dupList;
    }
}

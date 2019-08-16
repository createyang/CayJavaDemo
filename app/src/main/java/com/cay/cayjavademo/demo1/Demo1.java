package com.cay.cayjavademo.demo1;

import java.util.ArrayList;

/**
 * @author: Caoy
 * @created on: 2019/8/14 17:29
 * @description:
 */
public class Demo1 {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 8, 4, 5, 7, 1, 4, 5, 1};
        ArrayList<Integer> duplication = new FindDuplication().getDuplication(arr);
        for (Integer integer : duplication) {
            System.out.println("重复的数字: " + String.valueOf(integer));
        }
    }
}

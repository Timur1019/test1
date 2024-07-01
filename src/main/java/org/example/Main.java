package org.example;

import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static Map<Integer, Integer> countElements(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        return countMap;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 5, 1, 5, 4};
        Map<Integer, Integer> result = countElements(nums);
        System.out.println(result);
    }
}
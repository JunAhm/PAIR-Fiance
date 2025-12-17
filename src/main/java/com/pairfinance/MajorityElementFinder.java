package com.pairfinance;

import java.util.HashMap;

/**
 * PAIR Finance Submission
 *
 * Problem: Find the majority element in an integer array.
 * The majority element is the element that appears more than any other.
 *
 * Approach:
 * 1. Use a HashMap to store each number and its frequency.
 * 2. Iterate through the array once:
 *      - Update the frequency of each number in the map.
 *      - Track the element with the highest frequency on the fly.
 * 3. Return the number with the maximum frequency.
 *
 */
public class MajorityElementFinder {

    public static int findMajorityElement(int[] nums) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        int majorityElement = -1;
        int maxCount = 0;

        for (int num : nums) {
            if (frequencyMap.containsKey(num)) {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                frequencyMap.put(num, 1);
            }

            if (frequencyMap.get(num) > maxCount) {
                maxCount = frequencyMap.get(num);
                majorityElement = num;
            }
        }

        return majorityElement;
    }

    public static void main(String[] args) {
        int[] nums = {3, 3, 1, 1, 1, 3, 3};
        System.out.println("Majority element: " + findMajorityElement(nums));
    }
}

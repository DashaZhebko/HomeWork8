import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        str = str.toLowerCase();
        StringBuilder reversedStr = new StringBuilder(str);
        reversedStr = reversedStr.reverse();

        if (str.equals(reversedStr.toString())) {
            return true;
        }
        return false;


    }

    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> numToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int element = nums[i];

            if (numToIndex.get(element) != null) {
                return true;

            } else {
                numToIndex.put(element, i);
            }
        }

        return false;
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int element = target - nums[i];
            if (numToIndex.get(element) != null) {
                return new int[]{numToIndex.get(element), i};
            } else {
                numToIndex.put(nums[i], i);
            }

        }

        return new int[]{};
    }
}

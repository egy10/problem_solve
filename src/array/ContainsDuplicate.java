package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Given an array of integers, find if the array contains any duplicate
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] result = {1, 2, 3, 4, 1};
        System.out.println(containDuplicate(result));
        System.out.println(containDuplicateSort(result));
    }
    //first approach
    public static boolean containDuplicate(int[] nums) {
        Map<Integer, Integer> findDuplicate = new HashMap<>();
        for (int i : nums) {
            if (findDuplicate.containsKey(i)) {
                return true;
            } else findDuplicate.put(i, 1);
        }
        return false;
    }
    //Second approach
    public static boolean containDuplicateSort(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i <= nums.length; i++) {
            if (nums[i] == nums[i + 1]) return true;
        }
        return false;
    }
}

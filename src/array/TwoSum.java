package array;

import java.util.HashMap;
import java.util.Map;

// 1,2,3,4,5,6  target = 10
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 4, 5, 6, 7};
        int target = 9;
        int[] result = twoSum(nums, target);
        int[] result2 = getTwoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
        System.out.println(result2[1] + " " + result2[0]);

    }
    // 1,2,3,4,5,6,8   target= 7
    //first approach
    public static int[] twoSum(int[] nums, int target) {
        int a_pointer = 0;
        int b_pointer = nums.length - 1;

        while (a_pointer <= b_pointer) {
            int sum = nums[a_pointer] + nums[b_pointer];
            if (sum > target) {
                b_pointer -= 1;
            } else if (sum < target) {
                a_pointer += 1;
            } else {
                return new int[]{a_pointer, b_pointer };
            }
        }
        return new int[]{a_pointer, b_pointer};
    }
    //second approach
    public static int[] getTwoSum(int[] numbers, int target) {
        Map<Integer, Integer> visitedNumbers = new HashMap<>();
        for (int i = 0; i < numbers.length; i++){
            int myPair = target - numbers[i];
            if (visitedNumbers.containsKey(myPair)) {
                return new int[] {i, visitedNumbers.get(myPair)};
            }
            visitedNumbers.put(numbers[i], i);
        }
        return new int[] {-1,-1};
    }
}

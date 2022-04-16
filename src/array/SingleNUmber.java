package array;

import java.util.HashMap;
import java.util.Map;

//Given non-empty array of int, every elements appears twice except for one. Find that single one
public class SingleNUmber {
    public static void main(String[] args) {
        int[] result = new int[] {1,2,1};
        System.out.println(singleNumber(result));
    }
    public static int singleNumber(int[] nums) {
        Map<Integer,Integer> num_frequencies = new HashMap<>();

        for (int i = 0; i <= nums.length; i++) {
            if (!num_frequencies.containsKey(nums[i])) {
                num_frequencies.put(nums[i], 1);
            } else {
                num_frequencies.put(nums[i], num_frequencies.get(nums[i]) +1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : num_frequencies.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (value == 1) {
                return key;
            }
        }
        return -1;
    }
}
// ! doesn't work

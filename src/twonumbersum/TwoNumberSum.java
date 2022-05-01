package twonumbersum;

import java.util.HashSet;
import java.util.Set;

public class TwoNumberSum {
    public static void main(String[] args) {
        int[] input = {3,5,-4,8,11,1,-1,6};
        int target = 10;
        int[] result = twoNumberSum(input, target);
        System.out.println("The output: " + result[0] + ", " + result[1]);
    }
    public static int[] twoNumberSum(int[] arr, int target) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i <= arr.length; i++) {
            int myPair = target - arr[i];

            if (set.contains(myPair)) {
                return new int[] {arr[i], target - arr[i]};
            } else{
                set.add(arr[i]);
            }
        }
        return new int[0];
    }
}
//array = [3,5,-4,8,11,1,-1,6]   set: [7,5,-14,2,-1,9,11,4]
//target = 10
//output = [-1,11]

//package rotation;
//
//public class Rotations {
//    public static void main(String[] args) {
//        int[] result = {1,2,3,4,5,6,7};
//        int k = 2;
//        System.out.println(rotate(result,k));
//    }
//    public static int[] rotate(int[] nums, int k) {
//        k = k % nums.length;
//        reverse(nums, 0, nums.length-1);
//        reverse(nums, 0, k-1);
//        reverse(nums, k , nums.length-1);
//    }
//    public static void reverse(int[] nums, int start, int end) {
//        while (start < end) {
//            int tmp = nums[start];
//            nums[start] = nums[end];
//            nums[end] = tmp;
//            start++;
//            end--;
//        }
//    }
//}

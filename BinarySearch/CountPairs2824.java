package BinarySearch;

import java.util.Arrays;
import java.util.List;

public class CountPairs2824 {
    public int countPairs(List<Integer> nums, int target) {
        // Convert List to array and sort for two-pointer technique
        int[] arr = nums.stream().mapToInt(i -> i).toArray();
        Arrays.sort(arr);

        int left = 0, right = arr.length - 1;
        int count = 0;

        while (left < right) {
            if (arr[left] + arr[right] < target) {
                count += (right - left); // all pairs between left and right are valid
                left++;
            } else {
                right--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CountPairs2824 sol = new CountPairs2824();
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        int target = 7;
        System.out.println("Number of pairs: " + sol.countPairs(nums, target)); // Output: 6
    }
}

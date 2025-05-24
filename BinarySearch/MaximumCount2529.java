package BinarySearch;

public class MaximumCount2529 {
    public int maximumCount(int[] nums) {
        int firstPos = findFirstPositive(nums);
        int firstZero = findFirstZero(nums);
        
        // Count negatives = firstZero, count positives = nums.length - firstPos
        return Math.max(firstZero, nums.length - firstPos);
    }

    private int findFirstPositive(int[] nums) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low; // first positive index
    }

    private int findFirstZero(int[] nums) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] >= 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low; // count of negatives (first zero or positive)
    }

    // You can add a main to test locally if you want:
    public static void main(String[] args) {
        MaximumCount2529 sol = new MaximumCount2529();
        int[] nums = {-3, -2, -1, 0, 0, 1, 2};
        System.out.println(sol.maximumCount(nums)); // Output: 3 (negatives)
    }
}

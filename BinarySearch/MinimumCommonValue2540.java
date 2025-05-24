package BinarySearch;

public class MinimumCommonValue2540 {
    public int getCommon(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        if(nums1[n1-1] < nums2[0] || nums1[0] > nums2[n2-1]){
            return -1;
        }
        int i = 0, j = 0;
        while(i < nums1.length && j < nums2.length) {
            if(nums1[i] == nums2[j]) {
                return nums1[i];
            } else if(nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        MinimumCommonValue2540 sol = new MinimumCommonValue2540();
        
        int[] nums1 = {1, 2, 3, 6, 7};
        int[] nums2 = {2, 3, 4, 5};
        
        int result = sol.getCommon(nums1, nums2);
        System.out.println(result);  // Output: 2

        // Additional test cases
        System.out.println(sol.getCommon(new int[]{1,4,5}, new int[]{2,3,6}));  // Output: -1
        System.out.println(sol.getCommon(new int[]{1,2,3}, new int[]{1,2,3}));  // Output: 1
    }
}

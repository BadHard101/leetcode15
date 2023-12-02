import java.lang.reflect.Array;
import java.util.*;

class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);


        Set<List<Integer>> uniqueElements = new HashSet<>();

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int foundIndex = Arrays.binarySearch(nums, j+1, nums.length, (nums[j] + nums[i]) - 2 * (nums[j] + nums[i]));

                if (foundIndex >= 0) {
                    uniqueElements.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[foundIndex])));
                }
            }
        }

        List<List<Integer>> res = new ArrayList<>(uniqueElements);


        return res;
    }

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        System.out.println(threeSum(new int[]{0, 0, 0, 0}));
    }
}
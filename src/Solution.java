import java.lang.reflect.Array;
import java.util.*;

class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
        /*res.add(temp);
        temp = new ArrayList<>(Arrays.asList(6, 9, 13));
        res.add(temp);*/

        Arrays.sort(nums);
        /*System.out.println(Arrays.toString(nums));*/


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

        /*int i = 0;
        int j;
        int n = res.size();
        while (i < n-1) {
            j = i + 1;
            while (j != n) {
                if (res.get(i).equals(res.get(j))) {
                    res.remove(j);
                    j--;
                    n--;
                }
                j++;
            }
            i++;
        }*/

        /*for (int i = 0; i < res.size() - 1; i++) {
            for (int j = i + 1; j < res.size(); j++) {
                if (res.get(i).equals(res.get(j))) {
                    res.remove(j);
                    i--;
                }
            }
        }*/

        return res;
    }

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        System.out.println(threeSum(new int[]{0, 0, 0, 0}));
    }
}
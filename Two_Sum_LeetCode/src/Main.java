import java.util.HashMap;

public class Main {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> myMap = new HashMap<>();

        for (int i = 0; i < nums.length; ++i) {
            myMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; ++i) {
            if (myMap.containsKey(target - nums[i]) && myMap.get(target - nums[i]) != i) {
                int[] result = {i, myMap.get(target - nums[i])};
                return result;
            }
        }

        return new int[]{};
    }
}

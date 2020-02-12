package DS.Array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> unique = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int secondNum = target - nums[i];
            if (unique.containsKey(secondNum)) {
                int index = unique.get(secondNum);
                int[] result = new int[]{index, i};
                return new int[]{index, i};
            } else {
                unique.put(nums[i], i);
            }
        }
        return new int[]{};

    }
}

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        System.out.println(Arrays.toString(new Solution().twoSum(nums, target)));
    }

    static class Solution {
        public int[] twoSum(int[] nums, int target){
            int[] answer = new int[2];

            for(int i=0; i<nums.length; i++) {
                for(int j=i+1; j<nums.length; j++){
                    if (nums[i] + nums[j] == target){
                        answer[0] = i;
                        answer[1] = j;
                        return answer;
                    }
                }
            }
            return answer;
        }
    }
}

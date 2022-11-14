package leetcode.day1;

class Solution3 {
	public int searchInsert(int[] nums, int target) {
		int low = 0;
		int high = nums.length-1;

		while(low <= high) {
			int mid = low + (high - low) / 2;

			if(nums[mid] == target) {
				return mid;
			} else if(nums[mid] > target) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return low;
	}
}

public class SearchInsertPosition {
	public static void main(String[] args) {
		Solution3 s = new Solution3();
		int[] nums = {1};
		int target = 0;

		System.out.println(s.searchInsert(nums, target));
	}
}

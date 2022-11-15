package leetcode.algorithm1.day1;

class Solution1 {
	public int search(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;

		while(low <= high) {
			int mid = (low+high)/2;

			if(target == nums[mid]) {
				return mid;
			} else if(target > nums[mid]) {
				low = mid+1;
			} else {
				high = mid-1;
			}
		}

		return -1;
	}
}

public class BinarySearch {
	public static void main(String[] args) {
		Solution1 s = new Solution1();
		int[] nums = {-1, 0, 3, 5, 9, 12};
		int target = 9;

		int answer = s.search(nums, target);
		System.out.println(answer);
	}
}

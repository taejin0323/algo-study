package leetcode.algorithm1.day2;

import java.util.Arrays;

class Solution2 {
	public void rotate(int[] nums, int k) {
		int[] temp = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			temp[(i+k)%nums.length] = nums[i];
		}

		for (int i = 0; i < nums.length; i++) {
			nums[i] = temp[i];
		}
	}
}

class Solution3 {
	public static void reverse(int nums[], int i, int j){
		int li = i;
		int ri = j;

		while(li < ri){
			int temp = nums[li];
			nums[li] = nums[ri];
			nums[ri] = temp;

			li++;
			ri--;
		}
	}
	public void rotate(int[] nums, int k) {
		k = k % nums.length;
		if(k < 0){
			k += nums.length;
		}
		reverse(nums, 0, nums.length - k - 1);
		reverse(nums, nums.length - k, nums.length - 1);
		reverse(nums, 0, nums.length - 1);
	}
}

public class RotateArray {
	public static void main(String[] args) {
		Solution3 s = new Solution3();
		int[] nums = {1,2,3,4,5,6,7};

		s.rotate(nums, 3);
		System.out.println(Arrays.toString(nums));
	}
}

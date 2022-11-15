package leetcode.algorithm1.day2;

import java.util.Arrays;

class Solution1 {
	public int[] sortedSquares(int[] nums) {
		int[] answer = new int[nums.length];

		int start = 0;
		int end = nums.length-1;
		for(int i=nums.length-1; i>=0; i--) {
			int first = (int) Math.pow(nums[start], 2);
			int second = (int) Math.pow(nums[end], 2);

			if(first >= second) {
				answer[i] = first;
				++start;
			} else {
				answer[i] = second;
				--end;
			}
		}
		return answer;
	}
}

public class SquaresOfASortedArray {
	public static void main(String[] args) {
		Solution1 s = new Solution1();
		int[] nums = {-7,-3,2,3,11};

		System.out.println(Arrays.toString(s.sortedSquares(nums)));
	}
}

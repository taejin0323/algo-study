package leetcode.day1;

class Solution2 {
	public int firstBadVersion(int n) {
		int left = 1;
		int right = n;

		while(left<right) {
			int mid = left + (right-left)/2;

			if(isBadVersion(mid)) {
				right = mid;
			} else {
				left = mid + 1;
			}
		}
		return left;
	}

	public boolean isBadVersion(int n) {
		if(n==1) return false;
		return true;
	}
}


public class FirstBadVersion {
	public static void main(String[] args) {
		Solution2 s = new Solution2();
		int n = 3;
		int bad = 2;

		int answer = s.firstBadVersion(n);
		System.out.println(answer);
	}
}

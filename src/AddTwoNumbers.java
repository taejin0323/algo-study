public class AddTwoNumbers {
    public static void main(String[] args) {
        Solution solution = new Solution();
    }


    private static class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2){
            int carry = 0;
            ListNode dummy = new ListNode(0), tail = dummy;

            while(l1 != null || l2 != null || carry != 0) {
                int x = l1 != null ? l1.val : 0;
                int y = l2 != null ? l2.val : 0;
                int sum = x + y + carry;

                carry = sum / 10;
                ListNode newNode = new ListNode(sum%10);
                tail.next = newNode;
                tail = newNode;

                if (l1 != null) l1 = l1.next;
                if (l2 != null) l2 = l2.next;
            }
            return tail.next;
        }
    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) { this.val=val; this.next=next;}
    }
}

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode answer = new ListNode(0);
        ListNode head = answer;
        int carry = 0;
        while(l1 != null && l2 != null){
            int sum = l1.val + l2.val + carry;
            carry = sum / 10;
            sum = sum % 10;
            answer.val = sum;
            if(l1.next!=null && l2.next!=null){
                answer.next = new ListNode(0);
                answer = answer.next;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        ListNode remainingList = null;
        if(l1 != null)
            remainingList = l1;
        else if(l2 != null)
            remainingList = l2;
        while(remainingList!=null){
            int sum = remainingList.val + carry;
            carry = sum / 10;
            sum = sum % 10;
            answer.next = new ListNode(0);
            answer = answer.next;
            answer.val = sum;
            remainingList = remainingList.next;
        }
        if(carry != 0){
            answer.next = new ListNode(carry);
        }
        return head;
    }
}

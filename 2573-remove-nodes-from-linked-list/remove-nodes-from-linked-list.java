/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNodes(ListNode head) {
        ListNode temp = head;
        Stack<ListNode> stack = new Stack<>();

        while (temp != null) {

            while (!stack.isEmpty() && stack.peek().val < temp.val) {
                stack.pop();
            }
            stack.push(temp);
            temp = temp.next;
        }

        ListNode res = new ListNode(0);
        temp = res;

        for (ListNode n : stack) {
            temp.next = n;
            temp = temp.next;
        }

        return res.next;
    }
}
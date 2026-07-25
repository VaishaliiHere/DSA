/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode nextNode = node.next;

        //swapping values of given node and the next node
        int temp = nextNode.val;
        nextNode.val = node.val;
        node.val = temp;
        
        node.next = nextNode.next;
    }
}
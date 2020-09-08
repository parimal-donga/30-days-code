/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null)return false;
        if(head.next==head)return true;
        if(head.next==null)return false;
        ListNode p= head;
        ListNode p2= head.next.next;
        while(p!=null&&p2!=null){
            if(p==p2)return true;
            p2=p2.next;
            if(p2!=null)p2=p2.next;
            p=p.next;
        }
        return false;
    }
}

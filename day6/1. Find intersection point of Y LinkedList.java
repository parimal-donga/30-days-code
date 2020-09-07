/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headB==null ||headA==null)return null;
        ListNode ok=headA;
        ListNode ko=headB;
        while(ok!=ko){
            if(ok==null)ok=headB;
            else ok=ok.next;
            if(ko==null)ko=headA;
            else ko=ko.next;
            if(ok==ko)break;
        }
        return ok;
    }
}

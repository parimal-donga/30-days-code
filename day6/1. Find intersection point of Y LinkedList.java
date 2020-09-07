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
/*
// swaping at each iteration
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headB==null ||headA==null)return null;
        ListNode ok=headA;
        ListNode ko=headB;
        boolean o=true;
        boolean k= true;
        while(ok!=ko){
            if(ok==null) {
                if(o)ok=headB;
                else ok=headA;
            }
            else ok=ok.next;
            if(ko==null){
                if(k)ko=headA;
                else ko=headB;
            }
            else ko=ko.next;
            if(ok==ko)break;
        }
        return ok;
    }
}
*/

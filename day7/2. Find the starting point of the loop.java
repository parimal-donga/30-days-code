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
    public ListNode detectCycle(ListNode head){
        ListNode ok = head;
        ListNode ok2 = head;
        if(ok==null||ok.next==null)return null;
        try{
            while(ok2!=null){
                ok=ok.next;
                ok2=ok2.next.next;
                if(ok==ok2){
                    ok=head;
                    while(ok!=ok2){
                        ok=ok.next;
                        ok2=ok2.next;
                    }
                    return ok;
                }
            }
        }
        catch (NullPointerException e){
            return null;
        }
        return null;
    }
}

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
    public boolean isPalindrome(ListNode head) {
        ListNode ok= new ListNode();
        ListNode ptr = head;
        ListNode ptr2 = head;
        
        try{
            while(ptr2.next!=null || ptr2!=null){
                ptr2=ptr2.next.next;
                ListNode temp =new ListNode(ptr.val,ok);
                ok=temp;
                ptr=ptr.next;
            }
        }
        catch(NullPointerException e) {
            if(ptr2!=null)ptr=ptr.next;//odd
            while(ptr!=null){
                if(ptr.val!=ok.val)return false;
                ptr=ptr.next;ok=ok.next;
            }
            return true;
        }
        return true;
    }
}


/*
// inside try blockk
            ListNode temp;
            while(ptr2.next!=null || ptr2!=null){
                ptr2=ptr2.next.next;
                temp=ptr.next;
                ptr.next=ok;
                ok=ptr;
                ptr=temp;
            }

*/

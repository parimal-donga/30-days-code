/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null)return head;
        Node ptr=head;
        Map <Node,Node> ansh= new HashMap<>();
        while(ptr!=null){
            Node nod= new Node(ptr.val);
            ansh.put(ptr,nod);
            ptr=ptr.next;
        }
        ptr=head;
        Node ans = ansh.get(head);
        while(ptr!=null){
            ansh.get(ptr).next  = ansh.get(ptr.next);
            ansh.get(ptr).random= ansh.get(ptr.random);
            ptr=ptr.next;
        }
        return ans;
    }
}

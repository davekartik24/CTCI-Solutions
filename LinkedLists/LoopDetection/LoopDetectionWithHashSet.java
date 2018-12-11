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
public class LoopDetectionWithHashSet {
    public boolean hasCycle(ListNode head) {
        
        HashSet<ListNode> lookupCheck = new HashSet<ListNode>();
        
        while(head != null) {
            
            if(lookupCheck.contains(head)) return true;
            
            lookupCheck.add(head);
            
            head = head.next;
        }
        
        return false;
        
    }
}
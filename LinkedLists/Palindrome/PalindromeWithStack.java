/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class PalindromeWithStack {
    public boolean isPalindrome(ListNode head) {
        
        ListNode focusedNode = head;
        
        int listLength = 0;
        
        int toSkip = 0;
        
        ArrayDeque<ListNode> stack = new ArrayDeque<>();
        
        while(focusedNode != null) {
            
            listLength++;
            focusedNode = focusedNode.next;
        }
        
        if(listLength % 2 == 0) {
            
            toSkip = listLength / 2;
            
        } else {
            
            toSkip = (listLength / 2) + 1; 
            
        }
        
        focusedNode = head;
        
        for(int i = 0; i < toSkip; i++) {
            
            focusedNode = focusedNode.next;
        }
        
        while(focusedNode != null) {
            
            stack.push(focusedNode);
            focusedNode = focusedNode.next;
        }
        
        focusedNode = head;
        
        while(!stack.isEmpty()) {
            
            if(focusedNode.val != stack.poll().val) return false;
            
            focusedNode = focusedNode.next;
        }
        
        return true;
    }
}
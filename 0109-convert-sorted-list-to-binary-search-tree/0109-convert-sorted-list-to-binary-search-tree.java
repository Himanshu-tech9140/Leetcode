class Solution {

    public TreeNode sortedListToBST(ListNode head) {

        // Empty list
        if (head == null) {
            return null;
        }

        // Find middle node
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // slow is the middle node

        // Break left half from middle
        if (prev != null) {
            prev.next = null;
        }

        // Create root
        TreeNode root = new TreeNode(slow.val);

        // If only one node
        if (head == slow) {
            return root;
        }

        // Left half
        root.left = sortedListToBST(head);

        // Right half
        root.right = sortedListToBST(slow.next);

        return root;
    }
}
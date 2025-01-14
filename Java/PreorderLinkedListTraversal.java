class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class PreorderLinkedListTraversal {
    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Perform preorder traversal
        System.out.println("Preorder traversal of linked list:");
        printPreorder(head);
    }

    // Recursive function for preorder traversal
    public static void printPreorder(ListNode node) {
        if (node == null) return; // Base case: end of the list
        System.out.print(node.val + " "); // Process the current node
        printPreorder(node.next); // Recur on the next node
    }
}

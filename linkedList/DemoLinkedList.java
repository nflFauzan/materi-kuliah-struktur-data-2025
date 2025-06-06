public class DemoLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insert elements
        list.insertAtEnd("Tahtia");
        list.insertAtBeginning("Siti");
        list.insertAtEnd("Ainun");
        list.insertAtEnd("Zahra");

        // Print the list
        System.out.println("Linked List after insertions:");
        list.printListForward(); // Expected Forward: Siti -> Tahtia -> Ainun -> Zahra -> null
        list.printListBackward(); // Expected Backward: Zahra -> Ainun -> Tahtia -> Siti -> null

        // Insert after a specific node
        Node nodeTahtia = list.getNode("Tahtia");
        if (nodeTahtia != null) {
            list.insertAfter(nodeTahtia, "Fauzan");
        }

        // Print the list after insertAfter
        System.out.println("\nLinked List after inserting Fauzan after Tahtia:");
        list.printListForward(); // Expected Forward: Siti -> Tahtia -> Fauzan -> Ainun -> Zahra -> null
        list.printListBackward(); // Expected Backward: Zahra -> Ainun -> Fauzan -> Tahtia -> Siti -> null

        // Delete a node
        list.deleteNode("Ainun");

        // Print the list after deletion
        System.out.println("\nLinked List after deleting Ainun:");
        list.printListForward(); // Expected Forward: Siti -> Tahtia -> Fauzan -> Zahra -> null
        list.printListBackward(); // Expected Backward: Zahra -> Fauzan -> Tahtia -> Siti -> null

        // Delete a non-existent node
        list.deleteNode("Ojan");

        // Print the list after trying to delete non-existent node
        System.out.println("\nLinked List after trying to delete Ojan:");
        list.printListForward(); // Expected Forward: Siti -> Tahtia -> Fauzan -> Zahra -> null
        list.printListBackward(); // Expected Backward: Zahra -> Fauzan -> Tahtia -> Siti -> null
    }
}
// test
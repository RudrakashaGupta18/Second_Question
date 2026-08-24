class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class NodeofLinkedList {

    public static int trav(int[] array) {
    Node head = new Node(array[0]);
    Node temp = head;

    for (int i = 1; i < array.length; i++) {
        temp.next = new Node(array[i]);
        temp = temp.next;
    }

    int count = 0;
    temp = head;

    while (temp != null) {
        count++;
        temp = temp.next;
    }

    return count; 
    }
    public static int checkIfPresent(Node head ,int val){
        Node temp = head;
        while (temp != null) {
            if(temp.val == val){
                return 1;
            }
            temp = temp.next;
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] array = {12, 5, 6, 9};
        Node head = new Node(array[0]);
        Node temp = head;
        
        
        for(int i = 1; i < array.length ; i++){
            temp.next = new Node(array[i]);
            temp = temp.next;
        }
        int val = 0;

        System.out.println(checkIfPresent(head, val));
    }
}
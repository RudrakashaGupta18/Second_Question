class Node{
    int val;
    Node next;
    Node back;

    Node(int val, Node next, Node back){
        this.val = val;
        this.next = next;
        this.back = back;
    }
    Node(int val){
        this.val = val;
        this.back = null;
        this.next = null;
    }
}

public class DLL {
    
    private static void print(Node head){
        while(head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    private static Node DDList(int[] array){
        Node head = new Node(array[0]);
        Node prev = head;

        for(int i = 1 ; i < array.length ; i++ ){
            Node temp = new Node(array[i], null , prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] array = {12, 5, 6, 9};
        
        Node head = DDList(array);
        print(head);

    }
}

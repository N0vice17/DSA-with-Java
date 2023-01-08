import java.util.*;
public class Node {
    int data;
    Node next;

    public Node(int Data, Node Next) {
        this.data = Data;
        this.next = Next;
    }

    public Node(int Data) {
        this.data = Data;
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;

        }
        System.out.println();
    }

    public static Node takeInput() {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        Node head = null, tail = null;
        while (num != -1) {
            Node temp = new Node(num);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            num = input.nextInt();
        }
        return head;
    }

    public static Node InsertNode(Node head, int position, int value) {
        Node temp = head;
        int count = 0;
        if (position == 0) {
            Node insert = new Node(value, temp);
            temp = insert;
            return temp;
        } else {
            while (count != position - 1) {
                if (temp == null) {
                    break;
                }
                temp = temp.next;
                count++;
            }
            if (position > count && temp == null) {
                return head;
            } else {
                if (temp.next == null) {
                    Node Insert = new Node(value, null);
                    temp.next = Insert;
                } else {
                    Node insert = new Node(value, temp.next);
                    temp.next = insert;
                }
                return head;
            }
        }
    }
    public static Node DeleteNode(Node head,int position){
        Node temp=head;
        if(position==0){
            head=temp.next;
            return head;
        }
        else{
            int count=0;
            while(count!=position-1){
                if(temp.next==null){
                    break;
                }
                temp=temp.next;
                count++;
            }
            if(position>count&&temp.next==null){
                return head;
            }
            else{
            temp.next=temp.next.next;
            return head;
            }
        }
    }
}

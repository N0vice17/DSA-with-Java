import java.util.*;
public class Practice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Node head=Node.takeInput();
        Node.printList(head);
        input.close();
    }
}
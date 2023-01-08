import java.util.*;
public class Practice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Node five=new Node(50,null);
        Node four=new Node(40,five);
        Node three=new Node(30,four);
        Node two=new Node(20,three);
        Node one=new Node(10,two);
        Node head=Node.DeleteNode(one, 2);
        Node.printList(head);
        input.close();
    }
}
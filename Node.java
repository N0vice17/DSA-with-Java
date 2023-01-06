import java.util.*;
public class Node {
    int data;
    Node next;
    public Node(int Data,Node Next){
        this.data=Data;
        this.next=Next;
    }
    public Node(int Data){
        this.data=Data;
    }
    public static void printList(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
            
        }
        System.out.println( );
    }
    public static Node takeInput(){
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        Node head=null;
        while(num!=-1){
            Node temp=new Node(num);
            if(head==null){
                head=temp;
            }
            else{
                Node tail=head;
                while(tail.next!=null){
                    tail=tail.next;
                }
                tail.next=temp;
            }
            num=input.nextInt();
        }
        return head;
    }
}

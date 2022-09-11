public class Linked_list{
    Node head;
    Node tail;
    int size;
    public Linked_list(){
        this.size=0;
    }
    public void insertfirst(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }
    public void insertlast(int value){
        Node node=new Node(value);
        tail.next=node;
        tail=node;
        size++;
    }
    public void insertatIndex(int index,int value){
        if(index==0){
            insertfirst(value);
        }
        else if(index==size){
            insertlast(value);
        }
        else{
            Node temp=head;
            for(int i=1;i<index;i++){
                temp=temp.next;
            }
            Node node=new Node(value,temp.next);
            temp.next=node;
            size++;
        }
    }
    public void deletefirst(){
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
    }
    public void deletelast(){
        if(size<=1){
            deletefirst();
        }
        else{
        Node temp=head;
        for(int i=0;i<size-2;i++){
            temp=temp.next;
        }
        tail=temp;
        tail.next=null;
        size--;
    }
    }
    public void delete(int index){
        if(index==0){
            deletefirst();
        }
        else if(index==size-1){
            deletelast();
        }
        else{
            Node temp=head;
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
    }
    public Node number(int value){
        Node node=head;
        while(node!=null){
            if(node.value==value){
                return node;
            }
            node=node.next;
        }
        return node;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
    }
    public class Node{
        int value;
        Node next;
        public Node(int value){
            this.value=value;
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
public static void main(String[]args){
        Linked_list list=new Linked_list();
        list.insertfirst(1);
        list.insertfirst(2);
        list.insertfirst(3);
        list.insertfirst(4);
        System.out.println("Original Linked list:");
        list.display();
        System.out.println("\nAfter modification:");
        list.number(4);
}
}
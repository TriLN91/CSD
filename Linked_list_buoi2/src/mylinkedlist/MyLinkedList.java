package mylinkedlist;

import java.lang.classfile.components.ClassPrinter;

public class MyLinkedList {
    private Node head;
    
    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null ){
            temp = temp.next;
        }
        //sau câu lệnh này, tìm được temp cuối cùng và được
        //gắn cho temp
        temp.next = newNode;

    }

    public void add(int data, int index){
        Node newNode = new Node(data);
        if (index == 0 ) {
            addFirst(data);
            return;
        }else{
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node nextNode = temp.next;
            temp.next = newNode;
            newNode.next = nextNode;
        }

    }

    public int length(){
        int count = 0;
        Node temp = head;
        if(temp != null){
            temp = temp.next;
            count++;
        }
        return count ;
    }

    public void display(){
        Node current = head;  
          
        if(head == null) {  
            return;  
        }  
        System.out.println("Nodes of singly linked list: ");  
        while(current != null) {  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
        
    }  

        /*Xác định một nút hiện tại ban đầu trỏ tới đầu danh sách.
Duyệt qua danh sách cho đến khi điểm hiện tại trỏ tới null.
Hiển thị từng nút bằng cách trỏ đến nút bên cạnh nó trong mỗi lần lặp. */
    
    



    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        // linkedList.addFirst(1);
        // linkedList.addFirst(2);
        // linkedList.addFirst(3);
        //3->2->1

        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        //1->2->3

        linkedList.display();
        
    }

    
}

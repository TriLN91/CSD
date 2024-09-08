import java.lang.classfile.components.ClassPrinter;
import mylinkedlist.MyLinkedList;
import mylinkedlist.Node;

public class Main {
    public static void main(String[] args) throws Exception {
        
        MyLinkedList linkedList = new MyLinkedList();
        // linkedList.addFirst(1);
        // linkedList.addFirst(2);
        // linkedList.addFirst(3);
        //3->2->1

        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.add(24,2 );
        linkedList.addFirst(7);
        //1->2->3
        Node newNode = new Node();
        

        linkedList.display();

        linkedList.deleteFirst();
       
        linkedList.display();
        System.out.println();
        System.out.println("count: " + linkedList.length());
        linkedList.display();
    }
}

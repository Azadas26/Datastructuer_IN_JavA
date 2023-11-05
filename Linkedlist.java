public class Linkedlist {
    public class node {
    
        int data;
        node next;
        node(int data)
        {
            this.data = data;
        }
    }
    public node head = null;
    public node tail = null;
    public void deletenode(int data)
    {
        node temp = head,prv=null;
        if(head.data == data)
        {
             head = temp.next;
        }
          while(temp.data != data)
            {
                prv=temp;
                temp=temp.next;  
            }
        if(tail.data == data)
        {
            tail = prv;
            tail.next =null;
        }
        else
        {
            prv.next = temp.next;
            temp = prv;
        }
        
    } 

    public void addnode(int data)
    {
        node newNode  = new node(data);
        if(head == null)
        {
            head = newNode;
        }
        else
        {
            tail.next = newNode;
        }
        tail = newNode;
    }
    public void display()
    {
        if(head == null)
        {
            System.out.println("List Is emply");
        }
        else
        {
            node temp = head;
            
            while (temp != null) {
                System.err.println(temp.data);
                temp = temp.next;
            }
        }
    } 
    public static void main(String[] args) {
        Linkedlist first = new Linkedlist();
        first.display();
        first.addnode(10);
        first.addnode(20);
        first.addnode(30);
        first.addnode(40);
        first.addnode(50);
       // first.display();
        first.deletenode(30);
        first.display();
        
    }

}

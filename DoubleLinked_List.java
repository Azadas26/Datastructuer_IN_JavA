public class DoubleLinked_List {
    class Node{
        int data;
        Node next;
        Node prv;
        Node(int data)
        {
            this.data = data;
        }
    }
        public Node head = null;
        public Node tail = null;

        public void DeleteLinkedlist(int data)
        {
            Node temp = head,cons=null,const2=null;
            if(head.data == data)
            {
                head = temp.next;
                head.prv = null;
            }
            else if(tail.data == data)
            {
                tail = tail.prv;
                tail.next = null;
            }
            else
            {
                System.out.println("Colled");
                while (temp.data !=data) 
                {
                cons = temp;
                temp = temp.next;
                }
                const2 = temp.next;
                cons.next = temp.next;
                const2.prv = cons;

            }
        }
        public void AddDatas(int data)
        {
           Node newnode = new Node(data);
           if(head == null)
           {
                head = newnode;
           }
           else
           {
                tail.next = newnode;
                newnode.prv = tail;
           }
           tail=newnode;
        }
        public void DisplayF()
        {
            if(head == null)
            {
                System.out.println("List Is Emplty");
            }
            else
            {
                Node temp = head;
                while (temp != null) {
                    System.out.println(temp.data);
                    temp = temp.next;
                }
            }
        }
        public void DisplayL()
        {
            if(tail == null)
            {
                System.out.println("List Is Emplty");
            }
            else
            {
                Node temp = tail;
                while (temp != null) {
                    System.out.println(temp.data);
                    temp = temp.prv;
                }
            }
        }
    
    public static void main(String[] args) {
        DoubleLinked_List obj = new DoubleLinked_List();
        obj.DisplayF();
        obj.DisplayL();
        obj.AddDatas(10);
        obj.AddDatas(20);
        obj.AddDatas(30);
        obj.AddDatas(40);
        obj.AddDatas(50);
        obj.AddDatas(60);
        obj.AddDatas(70);
        obj.DisplayF();
        System.out.println("###");
        obj.DisplayL();
        obj.DeleteLinkedlist(60);
        System.out.println("@@@@@2");
        obj.DisplayL();
        obj.DisplayF();

    }
}

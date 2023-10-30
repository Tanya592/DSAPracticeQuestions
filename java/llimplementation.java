public class llimplementation {
//insertion at end


    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

    }

    public static class linkedlist {
        Node head = null;
        Node tail = null;

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            //node we want to add
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
            //as we want to implement these in both the cases thatswhy we written this outside the if else statement
            //
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
        void insertAtHead(int val){
            Node temp=new Node(val);
            if(head==null){
                head=tail=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }
        }

        int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;

            }
            return count;
        }
        void insertAt(int idx,int val){
            Node t=new Node(val);
            Node temp=head;
            if(idx==size()){
                insertAtEnd(val);
                return;
            }
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;

            }
            t.next=temp.next;
            temp.next=t;
        }


        public static void main(String[] args) {
            linkedlist ll = new linkedlist();
            ll.insertAtEnd(9);
            ll.insertAtEnd(8);
            ll.display();
            System.out.println(ll.size());
            ll.insertAtEnd(7);
            ll.display();
            System.out.println("-------------------------------------");
            ll.insertAtHead(67);
            ll.display();
            ll.insertAt(2,10);
            ll.display();
            System.out.println(ll.head.data);
            System.out.println(ll.tail.data);
        }
    }
}
    


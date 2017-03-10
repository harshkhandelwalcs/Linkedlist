 class Linkedlist {
    Node Head;
    static  class Node
      {
          int data;
          Node next;
          Node(int d)
          {
              data=d;
              next=null;
            }
    }
        public void printlist(){
            
            Node tmp=Head;
            
            while(tmp!=null){
                System.out.println(tmp.data);
                tmp=tmp.next;
            }
            
            
            
        }
        //push at first position of linklist
        public void insert(int new_data){
            Node new_node=new Node(new_data);
            new_node.next=Head;
            Head=new_node;
            
            
        }
        
        
        //push after given position
        public void insert_givenposition(int position,int new_data)
        {
            int count;
             Node new_node=new Node(new_data);
             Node tmp=Head;
        Node prev=null;
           
           for(count=0;count<position;count++)
        {
     
                 
                 prev=tmp;
                 tmp=tmp.next;
                   
                 
                
        
            }        
           prev.next=new_node;
       new_node.next=tmp;
          
     }
        
        public void delete(int key){
            Node tmp=Head;
            Node prev=null;
            while(tmp.data!=key){
                prev=tmp;
                tmp=tmp.next;
            }
            prev.next=tmp.next;
        }
        public void length(){
            int count=0;
            Node tmp=Head;
            while(tmp!=null){
                
                tmp=tmp.next;
                count++;
            }
            System.out.println("Length of linklist:"+count);
        }
    public void reverse(){
        System.out.println("reverse of list is");
        Node tmp=Head;
        Node prev=null;
        Node nxt=null;
        while(tmp!=null){
            
            nxt=tmp.next;
            tmp.next=prev;
            prev=tmp;
            tmp=nxt;
            
        }
        Head=prev;
    }
        
  
    public static void main(String[] args) {
      
       Linkedlist l=new Linkedlist();
//       l.Head=new Node(1);
//      Node second=new Node(2);
//       Node third= new Node(3);

//       l.Head.next=second;
//       second.next=third;
//       third.next=null;
l.insert(1);
l.insert(2);
l.insert(3);
l.insert_givenposition(2, 4);
l.delete(4);
l.length();
       l.printlist();
       l.reverse();
       
         l.printlist();
    }
    
}
